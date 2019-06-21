package test.designPattern.创建型_5种._00简单工厂模式.简单工厂;

/**
 * 简单工厂模式不为23中设计模式，简单工厂模式分为3种：简单工厂模式、多方法简单工厂、静态方法简单工厂
 * 
 * 简单工厂模式
 * 
 * 总体来说，工厂模式适合：凡是出现了大量的产品需要创建，并且具有共同的接口时，
 * 可以通过工厂方法模式进行创建。在以上的三种模式中，第一种（简单工厂）如果传入的字符串有误，
 * 不能正确创建对象，第三种（静态方法简单工厂）相对于第二（多方法简单工厂）种，不需要实例化工厂类，所以，大多数情况下，
 * 我们会选用第三种——静态工厂方法模式。
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


//简单工厂   为什么创建发送者但不发送消息？ --> 单一职责原则
class SendFactory{
	
	public Sender produce(String type) {
		
		//邮箱发送
		if("mail".equals(type))
			return new MailSender();
		
		//短信发送
		else if("sms".equals(type))
			return new SmsSender();
		
		//其他
		else
			throw new ClassCastException("发送类型不存在,转换失败");
	}
	
}

