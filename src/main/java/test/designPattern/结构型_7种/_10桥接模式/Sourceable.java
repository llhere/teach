package test.designPattern.结构型_7种._10桥接模式;


/**
 * 桥接模式
 * 
 *   桥接模式就是把事物和其具体实现分开，使他们可以各自独立的变化。桥接的用意是：将
 *   抽象化与实现化解耦，使得二者可以独立变化，像我们常用的JDBC桥DriverManager一样，
 *   JDBC进行连接数据库的时候，在各个数据库之间进行切换，基本不需要动太多的代码，甚
 *   至丝毫不用动，原因就是JDBC提供统一接口，每个数据库提供各自的实现，用一个叫做数
 *   据库驱动的程序来桥接即可。
 * 
 *
 */


//定义一个接口
public interface Sourceable {

	public void method();
}


//定义两个实现类
class SourceSub1 implements Sourceable {  
  
    @Override  
    public void method() {  
        System.out.println("this is the first sub!");  
    }  
}  


//定义两个实现类
class SourceSub2 implements Sourceable {  
	
	@Override  
	public void method() {  
		System.out.println("this is the second sub!");  
	}  
}  



//定义一个桥，持有Sourceable的一个实例,实现了对接口Sourceable的实现类SourceSub1和SourceSub2的调用。实现了抽象与行为实现的分离。
abstract class Birdge{
	
	private Sourceable source; 
	
	public void method() {
		source.method();
	}
	
	
	public Sourceable getSource() {
		return source;
	}
	
	public void setSource(Sourceable source) {
		this.source = source;
	}
}


class MyBirdge extends Birdge{
	
	@Override
	public void method() {
		getSource().method();
	}
}



