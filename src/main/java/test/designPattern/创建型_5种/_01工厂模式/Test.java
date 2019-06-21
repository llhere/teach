package test.designPattern.创建型_5种._01工厂模式;

//多静态方法简单工厂模式测试类
public class Test {

	
	public static void main(String[] args) {

		//发送内容
		String message = "你好";
		
		//发送邮件
		new SendEmailFactory().produce().send(message);
		
		//发送短信
		new SendSmsFactory().produce().send(message);
		
	}
	
}
