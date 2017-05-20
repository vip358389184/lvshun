package com.lvshun.config;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/* *
 *绫诲悕锛歅ayConfig
 *鍔熻兘锛氬熀纭?閰嶇疆绫?
 *璇︾粏锛氳缃笎鎴锋湁鍏充俊鎭強杩斿洖璺緞
 *璇存槑锛?
 *浠ヤ笅浠ｇ爜鍙槸涓轰簡鏂逛究鍟嗘埛娴嬭瘯鑰屾彁渚涚殑鏍蜂緥浠ｇ爜锛屽晢鎴峰彲浠ユ牴鎹嚜宸辩綉绔欑殑闇?瑕侊紝鎸夌収鎶?鏈枃妗ｇ紪鍐?,骞堕潪涓?瀹氳浣跨敤璇ヤ唬鐮併??
 *璇ヤ唬鐮佷粎渚涘涔犲拰鐮旂┒鏀粯鎺ュ彛浣跨敤锛屽彧鏄彁渚涗竴涓弬鑰冦??
 */

public class PayConfig {
	
	static Properties prop;

	//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓
	// 商户号
     public static String merId;
	// 商户的私钥
	public static String key;
	//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑


	// 字符编码格式 目前支持 utf-8
	public static String input_charset = "utf-8";

	// 签名方式 不需修改
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
