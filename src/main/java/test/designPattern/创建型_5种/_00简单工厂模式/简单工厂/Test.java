package test.designPattern.创建型_5种._00简单工厂模式.简单工厂;

//简单工厂模式测试类
public class Test {

	
	public static void main(String[] args) {
		
		//短信
		String type = "mail";
		
		//发送内容
		String message = "你好";
		
		//发送
		new SendFactory().produce(type).send(message);
		
		
		//关闭原则  -> 扩展发送微信
		new Sender() {

			@Override
			public void send(String message) {
				System.out.println(message);
			}
			
		}.send("发送微信");
		
	}
	
}
