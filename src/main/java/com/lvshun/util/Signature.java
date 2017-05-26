package com.lvshun.util;

import org.apache.commons.codec.digest.DigestUtils;
import org.apache.commons.lang.StringUtils;

import java.io.UnsupportedEncodingException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;


/**
 * @date 2016/12/12
 * @time 17:38
 */
public class Signature {
	 
	/**
	 * ����md5ժҪ,������:����������a-z����,������ֵ�Ĳ������μ�ǩ����
	 * @param packageParams
	 * @return
	 */
	@SuppressWarnings("rawtypes")
	public static String createSign(SortedMap<String, String> packageParams,String partnerKey) {
		StringBuffer sb = new StringBuffer();
		Set es = packageParams.entrySet();
		Iterator it = es.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			String k = (String) entry.getKey();
			String v = (String) entry.getValue();
			if (StringUtils.isNotEmpty(v) && !"sign".equals(k) && !"key".equals(k)) {
				sb.append(k + "=" + v + "&");
			}
		}
		sb.append("key=" + partnerKey);
		String sign = null;
		try {
			sign = DigestUtils.md5Hex(sb.toString().getBytes("UTF-8")).toUpperCase();
			System.out.println("ǩ��ԭ��:"+sb.toString()+" ��ǩ�������" + sign);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return sign;
	}
}
