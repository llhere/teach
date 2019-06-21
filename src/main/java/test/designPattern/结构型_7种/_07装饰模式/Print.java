package test.designPattern.结构型_7种._07装饰模式;


/**
 * 装饰者模式
 * 
 * 
 *  顾名思义，装饰模式就是给一个对象动态增加一些新的功能，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
 *  
 *  
 * 	装饰器模式的应用场景：
	1、需要扩展一个类的功能。
	2、动态的为一个对象增加功能，而且还能动态撤销。（继承不能做到这一点，继承的功能是静态的，不能动态增删。）
	缺点：产生过多相似的对象，不易排错！
 *
 */

//一个接口
public interface Print {

	public void hello();
	
}


//被装饰的类
class PrintHello implements Print{

	@Override
	public void hello() {
		System.out.println("Hello");
	}
	
}


//装饰类  给一个对象增加一些新的功能，而且是动态的，要求装饰对象和被装饰对象实现同一个接口，装饰对象持有被装饰对象的实例
class YouHelloMe implements Print{
	
	private PrintHello printHello;
	
	public YouHelloMe(PrintHello printHello) {
		super();
		this.printHello = printHello;
	}
	

	@Override
	public void hello() {
		System.out.println("you");
		
		//被装饰的类
		printHello.hello();
		
		System.out.println("me");
	}
	
	
	
	
	
	
	
	
	
	
}