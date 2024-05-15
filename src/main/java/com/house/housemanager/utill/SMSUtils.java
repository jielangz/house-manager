package com.house.housemanager.utill;

import com.aliyun.dysmsapi20170525.models.SendSmsResponse;
import com.aliyun.tea.TeaException;

/**
 * 短信发送工具类
 */
public class SMSUtils {
	
	public static com.aliyun.dysmsapi20170525.Client createClient() throws Exception {
		// 工程代码泄露可能会导致 AccessKey 泄露，并威胁账号下所有资源的安全性。以下代码示例仅供参考。
		// 建议使用更安全的 STS 方式，更多鉴权访问方式请参见：https://help.aliyun.com/document_detail/378657.html。
		com.aliyun.teaopenapi.models.Config config = new com.aliyun.teaopenapi.models.Config()
				// 必填，请确保代码运行环境设置了环境变量 ALIBABA_CLOUD_ACCESS_KEY_ID。
				.setAccessKeyId(System.getenv("ALIBABA_CLOUD_ACCESS_KEY_ID"))
				// 必填，请确保代码运行环境设置了环境变量 ALIBABA_CLOUD_ACCESS_KEY_SECRET。
				.setAccessKeySecret(System.getenv("ALIBABA_CLOUD_ACCESS_KEY_SECRET"));
		// Endpoint 请参考 https://api.aliyun.com/product/Dysmsapi
		config.endpoint = "dysmsapi.aliyuncs.com";
		return new com.aliyun.dysmsapi20170525.Client(config);
	}

	/**
	 * 发送短信
	 * @param signName 签名
	 * @param templateCode 模板
	 * @param phoneNumbers 手机号
	 * @param param 参数
	 */
	public static void sendCodeMessage(String signName, String templateCode,String phoneNumbers,String param) throws Exception {
		com.aliyun.dysmsapi20170525.Client client = createClient();
		String param1 = "{\"code\":\""+param+"\"}";
		com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
				.setPhoneNumbers(phoneNumbers)
				.setSignName(signName)
				.setTemplateCode(templateCode)
				.setTemplateParam(param1);
		com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
		try {
			com.aliyun.dysmsapi20170525.models.SendSmsResponse resp = client.sendSmsWithOptions(sendSmsRequest, runtime);
			com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(resp));
		} catch (TeaException error) {
			// 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
			// 错误 message
			System.out.println(error.getMessage());
			// 诊断地址
			System.out.println(error.getData().get("Recommend"));
			com.aliyun.teautil.Common.assertAsString(error.message);
		} catch (Exception _error) {
			TeaException error = new TeaException(_error.getMessage(), _error);
			// 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
			// 错误 message
			System.out.println(error.getMessage());
			// 诊断地址
			System.out.println(error.getData().get("Recommend"));
			com.aliyun.teautil.Common.assertAsString(error.message);
		}
	}
	
	public static void sendMessage(String name,String phone) throws Exception {
		com.aliyun.dysmsapi20170525.Client client = createClient();
		String param1 = "{\"name\":\""+name+"\"}";
		com.aliyun.dysmsapi20170525.models.SendSmsRequest sendSmsRequest = new com.aliyun.dysmsapi20170525.models.SendSmsRequest()
				.setSignName("租客管理")
				.setTemplateCode("SMS_465980975")
				.setPhoneNumbers(phone)
				.setTemplateParam(param1);
		com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
		try {
			// 复制代码运行请自行打印 API 的返回值
			SendSmsResponse sendSmsResponse = client.sendSmsWithOptions(sendSmsRequest, runtime);
			com.aliyun.teaconsole.Client.log(com.aliyun.teautil.Common.toJSONString(sendSmsResponse));
		} catch (TeaException error) {
			// 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
			// 错误 message
			System.out.println(error.getMessage());
			// 诊断地址
			System.out.println(error.getData().get("Recommend"));
			com.aliyun.teautil.Common.assertAsString(error.message);
		} catch (Exception _error) {
			TeaException error = new TeaException(_error.getMessage(), _error);
			// 此处仅做打印展示，请谨慎对待异常处理，在工程项目中切勿直接忽略异常。
			// 错误 message
			System.out.println(error.getMessage());
			// 诊断地址
			System.out.println(error.getData().get("Recommend"));
			com.aliyun.teautil.Common.assertAsString(error.message);
		}
	}

}
