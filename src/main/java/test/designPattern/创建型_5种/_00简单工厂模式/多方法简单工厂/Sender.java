package test.designPattern.创建型_5种._00简单工厂模式.多方法简单工厂;

/**
 * 简单工厂模式不为23中设计模式，简单工厂模式分为3种：简单工厂模式、多方法简单工厂、静态方法简单工厂
 * 
 * 多方法简单工厂模式   从简单工厂内的一个方法多个if拆分为多个方法
 *
 */
public interface Sender {
	
	/**
	 * 发送信息		关闭原则 --> 可扩展，发送邮件和短信，还可以扩展发送微信和QQ，但不可被修改
	 * @description 
	 * @param message
	 * @author chenpengwei
	 * @date 2019年5月16日 下午1:17:27
	 */
	public void send(String message);

}


//发送邮件
class MailSender implements Sender{

	@Override
	public void send(String message) {
		System.out.println("发送邮件");
	}
	
}


//发送短信
class SmsSender implements Sender{

	@Override
	public void send(String message) {
		System.out.println("发送短信");
	}
	
}


//多方法简单工厂   从简单工厂内的一个方法多个if拆分为多个方法
class SendFactory{
	
	public Sender produceMail() {
		return new MailSender();
	}
	
	public Sender produceSms() {
		return new SmsSender();
	}
	
}

