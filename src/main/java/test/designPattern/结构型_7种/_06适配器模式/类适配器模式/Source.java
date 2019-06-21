package test.designPattern.结构型_7种._06适配器模式.类适配器模式;

/**
 *适配器模式将某个类的接口转换成客户端期望的另一个接口表示，目的是消除由于接口不匹配所造
 *成的类的兼容性问题。主要分为三类：类的适配器模式、对象的适配器模式、接口的适配器模式。
 *
 *类的适配器模式:
 *
 *核心思想就是：有一个Source类，拥有一个方法，待适配，目标接口是Targetable，通过Adapter类，将Source的功能扩展到Targetable里
 *
 */


//带适配的类
public class Source {

	public void printHello() {
		System.out.println("Hello");
	}
}


//创建一个接口，包含原方法和新方法   这样Targetable接口的实现类就具有了Source类的功能。
interface Targetable {
	
	//与原方法相同
	public void printHello();
	
	//新增方法
	public void printHelloWorld();
	
}


class Adapter extends Source implements Targetable{

	@Override
	public void printHelloWorld() {
		System.out.println("Hello World");
	}
	
}