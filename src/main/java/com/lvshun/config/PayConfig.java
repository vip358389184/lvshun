package com.lvshun.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* *
 *类名：PayConfig
 *功能：基�?配置�?
 *详细：设置帐户有关信息及返回路径
 *说明�?
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的�?要，按照�?术文档编�?,并非�?定要使用该代码�??
 *该代码仅供学习和研究支付接口使用，只是提供一个参考�??
 */

public class PayConfig {
	
	static Properties prop;

	//�����������������������������������Ļ�����Ϣ������������������������������
	// �̻���
     public static String merId;
	// �̻���˽Կ
	public static String key;
	//�����������������������������������Ļ�����Ϣ������������������������������


	// �ַ������ʽ Ŀǰ֧�� utf-8
	public static String input_charset = "utf-8";

	// ǩ����ʽ �����޸�
	public static String sign_type = "MD5";
	
	public static String trans_url = "";
	
	
	static{
		try {
			prop = new Properties();
			InputStream in = PayConfig.class.getClassLoader().getResourceAsStream("/properties/payconfig.properties");
			prop.load(in);
			key = prop.getProperty("KEY");
			merId = prop.getProperty("MERID");
			input_charset = prop.getProperty("INPUT_CHARSET");
			sign_type = prop.getProperty("SIGN_TYPE");
			trans_url = prop.getProperty("TRANS_URL");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
}
