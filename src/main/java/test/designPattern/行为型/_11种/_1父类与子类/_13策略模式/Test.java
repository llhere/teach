package test.designPattern.行为型._11种._1父类与子类._13策略模式;

public class Test {
	  
    public static void main(String[] args) {  
        String exp = "2+8";  
        ICalculator cal = new Plus();  
        int result = cal.calcultor(exp);  
        System.out.println(result);  
    }  
}
