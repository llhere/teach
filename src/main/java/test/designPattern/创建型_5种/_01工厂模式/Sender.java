package test.designPattern.创建型_5种._01工厂模式;

/**
 * 
 * 工厂模式
 * 
 * 简单工厂模式有一个问题就是，类的创建依赖工厂类，也就是说，如果想要拓展程序，
 * 必须对工厂类进行修改，这违背了闭包原则，所以，从设计角度考虑，有一定的问题，
 * 如何解决？就用到工厂方法模式，创建一个工厂接口和创建多个工厂实现类，这样一旦需要增加新的功能，
 * 直接增加新的工厂类就可以了，不需要修改之前的代码。
 * 
 * 其实这个模式的好处就是，如果你现在想增加一个功能：发及时信息，则只需做一个实现类，
 * 实现Sender接口，同时做一个工厂类，实现Provider接口，就OK了，无需去改动现成的代码。这样做，拓展性较好！
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



//工厂模式  做一个Provider接口,在做一个实现类实现Sender接口，同时做一个工厂类，实现Provider接口 

//工厂实现接口
interface Provider{
	public Sender produce();  
}

//发送邮件工厂
class SendEmailFactory implements Provider{

	@Override
	public Sender produce() {
		return new MailSender();
	}
	
}

//发送短信工厂
class SendSmsFactory implements Provider{
	
	@Override
	public Sender produce() {
		return new SmsSender();
	}
	
}

