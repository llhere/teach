package test.designPattern.结构型_7种._06适配器模式.接口适配器模式;

public class Test {

	
	public static void main(String[] args) {
		SourceSub1 sourceSub1 = new SourceSub1();
		SourceSub2 sourceSub2 = new SourceSub2();
		
		sourceSub1.method1();
		sourceSub1.method2();
		
		System.out.println("=================================================");
		
		sourceSub2.method1();
		sourceSub2.method2();
		
	}
	
}
