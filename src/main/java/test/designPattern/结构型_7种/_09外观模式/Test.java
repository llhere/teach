package test.designPattern.结构型_7种._09外观模式;

public class Test {
	
	
	public static void main(String[] args) {
		
		//用户启动电脑   模拟user
		Computer computer = new Computer();
		
		//打开电脑
		computer.startComputer();
		
		System.out.println("\n==========================================\n");
		
		//关闭电脑
		computer.shutdownComputer();
		
	}

}
