package test.designPattern.结构型_7种._06适配器模式.对象适配器模式;

public class Test {

	public static void main(String[] args) {
		
		new Adapter(new Source()).printHello();
		new Adapter(new Source()).printHelloWorld();

	}

}
