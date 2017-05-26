package com.lvshun.controller;



import com.alibaba.fastjson.JSONObject;

import com.lvshun.config.PayConfig;
import com.lvshun.util.HttpClientNewUtil;
import com.lvshun.util.Signature;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Enumeration;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * ������ѯ
 * Created by Mattew on 2017/3/4 0016.
 */
@Controller
@RequestMapping("/channelQuery")
public class ChannelQueryController {
    private static final long serialVersionUID = 6105929450972175984L;

    /**
     * ֧��ƽ̨�ṩ���̻��ķ����������URL
     */
    private static final String PAY_GATEWAY = "/ChannelQuery.do";

    @RequestMapping("/query")
    public void query(HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");

        // ��request����Ĳ����ŵ�Map��
        Enumeration e = request.getParameterNames();
        SortedMap<String, String> map = new TreeMap<String, String>();
        while (e.hasMoreElements()) {
            String param = (String) e.nextElement();
            map.put(param, request.getParameter(param));
        }
        if ("MD5".equalsIgnoreCase(map.get("signType").toString())) {
            //#.md5���벢ת�ɴ�д ǩ����
            String sign = Signature.createSign(map, PayConfig.key);
            map.put("signData", sign);
        }

        try {
            String resData = HttpClientNewUtil.post(PayConfig.trans_url + PAY_GATEWAY, map);//�ύ��֧��ϵͳ

            JSONObject retJson = JSONObject.parseObject(resData);

            if (retJson.getString("code").equals("1")) {
                if ("MD5".equalsIgnoreCase(map.get("signType").toString())) {
                    map = new TreeMap<String, String>();
                    map.put("typecode", retJson.getString("typecode"));
                    map.put("merId", retJson.getString("merId"));

                    //#.md5���벢ת�ɴ�д ǩ����
                    String sign = Signature.createSign(map, PayConfig.key);

                    String signData = (String) retJson.get("signData");
                    if (!signData.equalsIgnoreCase(sign)) {
                        String retMsg = "֧��ƽ̨MD5��ǩʧ�ܡ���";
                        String retCode = "09997";
                        StringBuilder html = new StringBuilder();
                        html.append("<script language=\"javascript\">window.onload=function(){alert(\"" + "���׷�����:" + retCode + "\\n���׷�����Ϣ:" + retMsg + "\")}</script>\n");
                        response.setCharacterEncoding("utf-8");
                        response.setContentType("text/html;charset=utf-8");
                        response.getWriter().append(html).close();
                        return;
                    }
                }

                String typecode = retJson.getString("typecode");

                request.setAttribute("obj", retJson);
                request.setAttribute("typecode", typecode);
                request.getRequestDispatcher("/lvshun/payApplyPage.jsp").forward(request, response);
            } else {
                String code = (String) retJson.get("code");
                String desc = (String) retJson.get("desc");
                StringBuilder html = new StringBuilder();
                html.append("<script language=\"javascript\">window.onload=function(){alert(\"" + "���ش�����:" + code + "\\n���ش�����Ϣ:" + desc + "\")}</script>\n");
                response.setCharacterEncoding("utf-8");
                response.setContentType("text/html;charset=utf-8");
                response.getWriter().append(html).close();
            }
        } catch (ServletException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
