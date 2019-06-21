package test.designPattern.结构型_7种._07装饰模式;

public class Test {

	
	public static void main(String[] args) {
		
		//装饰之前
		new PrintHello().hello();
		
		
		System.out.println("\n装饰之后==========================================\n");
		
		
		//装饰之后
		new YouHelloMe(new PrintHello()).hello();
		
		
		
	}
	
}
