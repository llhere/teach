package test.designPattern.创建型_5种._00简单工厂模式.多方法简单工厂;

//多方法简单工厂模式测试类
public class Test {

	
	public static void main(String[] args) {

		//发送内容
		String message = "你好";
		
		//发送
		new SendFactory().produceMail().send(message);
		
	}
	
}
