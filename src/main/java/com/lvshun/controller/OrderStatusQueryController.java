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
import java.math.BigDecimal;
import java.util.Enumeration;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/**
 * ������ѯ
 * Created by Mattew on 2017/3/4 0016.
 */
@Controller
@RequestMapping("/orderStatus")
public class OrderStatusQueryController {
    private static final long serialVersionUID = 6105929450972175984L;

    /**
     * ֧��ƽ̨�ṩ���̻��ķ����������URL
     */
    private static final String PAY_GATEWAY = "/OrderStatusQuery.do";

   // private static final String PAY_GATEWAY = "/payment/OrderStatusQuery.do";

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
            String signType = (String) retmap.get("signType");
            String prdordno = (String) retmap.get("prdordno");
            String prdordtype = (String) retmap.get("prdordtype");
            String orderstatus = (String) retmap.get("orderstatus");
            String ordamt = (String) retmap.get("ordamt");

            StringBuilder html = new StringBuilder();
            if(!"1".equals(retCode)){
                html.append("<script language=\"javascript\">window.onload=function(){alert(\"" + "���׷�����:" + retCode + "\\n���׷�����Ϣ:" + retMsg + "\")}</script>\n");
            }else{
                if("MD5".equalsIgnoreCase(signType)){
                    map = new TreeMap<String, String>();
                    map.put("orderstatus", orderstatus);
                    map.put("prdordtype", prdordtype);
                    map.put("ordamt", ordamt);
                    map.put("retCode", retCode);
                    map.put("retMsg", retMsg);

                    //#.md5���벢ת�ɴ�д ǩ����
                    String sign = Signature.createSign(map,PayConfig.key);

                    String signData = (String) retmap.get("signData");
                    if (!signData.equalsIgnoreCase(sign)) {
                        retMsg = "֧��ƽ̨MD5��ǩʧ�ܡ���";
                        retCode = "09997";
                        html.append("<script language=\"javascript\">window.onload=function(){alert(\"" + "���׷�����:" + retCode + "\\n���׷�����Ϣ:" + retMsg + "\")}</script>\n");
                    }else{
                        //����״̬:00:δ֧��,01:֧���ɹ�,02:֧��������,11:��������,14:����, 19:������  20 �����
                        if("00".equals(orderstatus)){
                            orderstatus = "δ֧��";
                        }else if("01".equals(orderstatus)){
                            orderstatus = "֧���ɹ�";
                        }else if("02".equals(orderstatus)){
                            orderstatus = "֧��������";
                        }else if("11".equals(orderstatus)){
                            orderstatus = "��������";
                        }else if("14".equals(orderstatus)){
                            orderstatus = "����";
                        }else if("19".equals(orderstatus)){
                            orderstatus = "������";
                        }else if("20".equals(orderstatus)){
                            orderstatus = "�����";
                        }

                        if("12".equals(prdordtype) || "13".equals(prdordtype)){
                            if("00".equals(orderstatus)){
                                orderstatus = "������";
                            }else if("01".equals(orderstatus)){
                                orderstatus = "�����";
                            }else if("02".equals(orderstatus)){
                                orderstatus = "������";
                            }else if("14".equals(orderstatus)){
                                orderstatus = "������";
                            }else if("20".equals(orderstatus)){
                                orderstatus = "������";
                            }else if("21".equals(orderstatus)){
                                orderstatus = "���д�����";
                            }
                        }

                        //��Ʒ����   0-����;11-���ѳ��� 1-��ֵ; 2-����֧��; 3-�̻���ֵ; 5-��֤���ֵ; 6-��֤��ⶳ; 7-Ԥ�䱣֤�����ַ����; 8-��ֵ�������֮����; 9-��ֵ�������֮��ֵ 10-�����˻������; 12:�̻����֣�13����������
                        if("0".equals(prdordtype)){
                            prdordtype = "���Ѷ���";
                        }else if("12".equals(prdordtype)){
                            prdordtype = "�̻����ֶ���";
                        }else if("13".equals(prdordtype)){
                            prdordtype = "���������ֶ���";
                        }

                        if(ordamt != null){
                            ordamt = new BigDecimal(ordamt).divide(new BigDecimal(100)).toPlainString();
                        }

                        html.append("<script language=\"javascript\">window.onload=function(){alert(\"" + "������:" + prdordno + "\\n��������:" + prdordtype + "\\n����״̬:" + orderstatus+ "\\n�������:" + ordamt + "\")}</script>\n");
                    }
                }
            }

            response.setCharacterEncoding("utf-8");
            response.setContentType("text/html;charset=utf-8");
            response.getWriter().append(html).close();
        } catch (Exception e1) {
            e1.printStackTrace();
        }
    }
}
