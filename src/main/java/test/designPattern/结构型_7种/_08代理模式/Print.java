package test.designPattern.结构型_7种._08代理模式;


/**
 * 代理模式
 * 
 * 
 *  给对象增加代理功能，与装饰者不同的是，代理注重对对象的控制权，可以决定在什么情况下调用被代理对象，而装饰着是对被装饰者对象功能的增强
 *  
 *  
 *  应用场景：

	如果已有的方法在使用的时候需要对原有的方法进行改进，此时有两种办法：
	
	1、修改原有的方法来适应。这样违反了“对扩展开放，对修改关闭”的原则(开闭原则)。
	
	2、就是采用一个代理类调用原有的方法，且对产生的结果进行控制。这种方法就是代理模式。
	
	使用代理模式，可以将功能划分的更加清晰，有助于后期维护！
 */

//一个接口
public interface Print {

	public void hello();
	
}


//被代理的类
class PrintHello implements Print{

	@Override
	public void hello() {
		System.out.println("Hello");
	}
	
}


//代理类  给一个对象增加代理功能
class YouHelloMe implements Print{
	
	private PrintHello printHello;
	
	//打印机状态
	private boolean status;
	
	public YouHelloMe(PrintHello printHello, boolean status) {
		super();
		this.printHello = printHello;
		this.status = status;
	}
	

	@Override
	public void hello() {

		//打印机坏了
		if(!status)
			System.out.println("打印机坏了打不了字");
		
		//打印机没坏可以打印，调用打印机打印
		else
			printHello.hello();
		
	}
	
	
	
	
	
	
	
	
	
	
}