package test.designPattern.结构型_7种._08代理模式;

public class Test {

	
	public static void main(String[] args) {
		new YouHelloMe(new PrintHello(), false).hello();
	}
	
}
