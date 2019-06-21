package test.designPattern.行为型._11种._1父类与子类._13策略模式;


/**
 *  策略模式
 *  
 *  策略模式定义了一系列算法，并将每个算法封装起来，使他们可以相互替换，
 *  且算法的变化不会影响到使用算法的客户。需要设计一个接口，为一系列实现类
 *  提供统一的方法，多个实现类实现该接口，设计一个抽象类（可有可无，属于辅助类），提供辅助函数，
 *
 *
 *  策略模式的决定权在用户，系统本身提供不同算法的实现，新增或者删除算法，对各种算法做封装。因此，策略模式多用在算法决策系统中，外部用户只需要决定用哪个算法即可。
 */

//定义一个计算接口
public interface ICalculator {
	
	public int calcultor(String exp);

}


//定义一个抽象类，写个split方法
abstract class AbstractCalculator{
	
	public int[] split(String exp, String opt) {
		
		String[] arrayStr = exp.split(opt);
		int[] arrayInt = new int[2];
		arrayInt[0] = Integer.parseInt(arrayStr[0]);
		arrayInt[1] = Integer.parseInt(arrayStr[1]);
		  
		return arrayInt;
	}
	
}



//三个实现类

//加法
class Plus extends AbstractCalculator implements ICalculator{

	@Override
	public int calcultor(String exp) {

		int[] arrayInt = split(exp, "\\+");
		
		return arrayInt[0] + arrayInt[1];
	}
	
}

//减法
class minus extends AbstractCalculator implements ICalculator{
	
	@Override
	public int calcultor(String exp) {
		
		int[] arrayInt = split(exp, "-");
		
		return arrayInt[0] - arrayInt[1];
	}
	
}

//乘法
class multiply extends AbstractCalculator implements ICalculator{
	
	@Override
	public int calcultor(String exp) {
		
		int[] arrayInt = split(exp, "\\*");
		
		return arrayInt[0] * arrayInt[1];
	}
	
}














