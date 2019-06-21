package test.designPattern.结构型_7种._06适配器模式.接口适配器模式;


/**
 *   接口适配器
 *   
 *   有时我们写的一个接口中有多个抽象方法，当我们写该接口的实现类时，
 *   必须实现该接口的所有方法，这明显有时比较浪费，因为并不是所有的方法都是我们需要的，
 *   有时只需要某一些，此处为了解决这个问题，我们引入了接口的适配器模式，借助于一个抽象类，
 *   该抽象类实现了该接口，实现了所有的方法，而我们不和原始的接口打交道，只和该抽象类取得联
 *   系，所以我们写一个类，继承该抽象类，重写我们需要的方法即可
 *
 */


//一个借口有N个方法
public interface Sourceable {
	
	public void method1();
	public void method2();

}


//抽象类实现Sourceable，重写接口内的方法
abstract class Wrapper implements Sourceable{
	
	
	@Override
	public void method1() {}
	
	@Override
	public void method2() {}
}



//只需要继承抽象类并重写Sourceable借口内的方法，达到只重写某个方法而不重写接口内所有方法
class SourceSub1 extends Wrapper {

	@Override
	public void method1() {
		System.out.println("method1");
	}
	
}


//通上
class SourceSub2 extends Wrapper {
	
	@Override
	public void method2() {
		System.out.println("method2");
	}
	
}