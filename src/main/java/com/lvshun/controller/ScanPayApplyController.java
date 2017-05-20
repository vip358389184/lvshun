package com.lvshun.controller;

import com.alibaba.fastjson.JSON;

import com.lvshun.config.PayConfig;
import com.lvshun.util.HttpClientNewUtil;
import com.lvshun.util.Signature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * Created by Administrator on 2017/3/4 0004.
 */
@Controller
@RequestMapping("/scanPay")
public class ScanPayApplyController {

    private static final String PAY_GATEWAY = "/payment/ScanPayApply.do";

    @RequestMapping("/pay")
    public void scanPay(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
    request.setCharacterEncoding("UTF-8");
		response.setCharacterEncoding("UTF-8");

    // ��request����Ĳ����ŵ�Map��
    Enumeration e = request.getParameterNames();
    SortedMap<String, String> map = new TreeMap<String, String>();
		while (e.hasMoreElements()) {
        String param = (String) e.nextElement();
        map.put(param, request.getParameter(param));
    }

		if("MD5".equalsIgnoreCase(map.get("signType").toString())){
        //#.md5���벢ת�ɴ�д ǩ����
        String sign = Signature.createSign(map, PayConfig.key);
        map.put("signData",sign);
    }

		try {
        String resData = HttpClientNewUtil.post(PayConfig.trans_url+PAY_GATEWAY, map);//�ύ��֧��ϵͳ
        Map<String, String> retmap = (Map<String, String>) JSON.parse(resData);
        String retCode = (String) retmap.get("retCode");
        String retMsg = (String) retmap.get("retMsg");
        String qrcode = (String) retmap.get("qrcode");
        String platmerord = (String) retmap.get("platmerord");
        String signType = (String) retmap.get("signType");
        String signData = (String) retmap.get("signData");

        if("1".equals(retCode)){
            if("MD5".equalsIgnoreCase(signType)){
                String sign = "";
                SortedMap<String, String> nMap = new TreeMap<String, String>();
                nMap.put("platmerord", platmerord);
                nMap.put("qrcode", qrcode);
                nMap.put("retCode", retCode);
                nMap.put("retMsg", retMsg);
                sign = Signature.createSign(nMap, PayConfig.key);

                if(!sign.equals(signData)){
                    retCode = "-40";
                    retMsg = "��ǩʧ��!";
                }
            }
        }

			/*String inParameterStr = "";
			for (Map.Entry<String, String> entry : retmap.entrySet()) {
				inParameterStr = inParameterStr + entry.getKey() + " = " + entry.getValue() + "; ";
			}

			StringBuilder html = new StringBuilder();
			html.append("<script language=\"javascript\">window.onload=function(){alert(\"" + "���׷�����:" + retCode + "\\n���׷�����Ϣ:" + retMsg + "\\n���ز�����Ϣ:" + inParameterStr + "\")}</script>\n");
			response.setCharacterEncoding("utf-8");
			response.setContentType("text/html;charset=utf-8");
			response.getWriter().append(html).close();
			*/

        request.getSession().setAttribute("retCode", retCode);
        request.getSession().setAttribute("retMsg", retMsg);
        request.getSession().setAttribute("qrcode", qrcode);
        request.getRequestDispatcher("/qrcode.jsp").forward(request, response);
    } catch (Exception e1) {
        e1.printStackTrace();
    }
}
}
