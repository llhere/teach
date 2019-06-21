package test.designPattern.结构型_7种._10桥接模式;

public class Test {

	
	public static void main(String[] args) {
		
		Birdge birdge = new MyBirdge();
		
		birdge.setSource(new SourceSub1());
		birdge.method();
		
		
		birdge.setSource(new SourceSub2());
		birdge.method();
		
		
	}
	
}
