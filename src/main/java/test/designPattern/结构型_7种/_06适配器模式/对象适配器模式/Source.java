package test.designPattern.结构型_7种._06适配器模式.对象适配器模式;


/**
 * 对象适配器模式
 * 
 * 基本思路和类的适配器模式相同，只是将Adapter类作修改，这次不继承Source类，而是持有Source类的实例，以达到解决兼容性的问题
 * 
 *
 */

//代适配的类
public class Source {
	
	public void printHello() {
		System.out.println("Hello");
	}
}


//创建一个接口，包含原方法和新方法   这样Targetable接口的实现类就具有了Source类的功能。
interface Targetable{
	
	public void printHello();
	public void printHelloWorld();
}



//对象适配器模式,不继承Targetable接口，而是持有Source类的实例
class Adapter implements Targetable{
	
	private Source source;
	
	public Adapter(Source source) {
		super();
		this.source = source;
	}
	

	@Override
	public void printHello() {
		source.printHello();
	}

	@Override
	public void printHelloWorld() {
		System.out.println("this is Targetable printHelloWord");
	}
	
}
