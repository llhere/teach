package test.lambda.lambdaApple;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

public class LambdaAppleTest {

	public static void main(String[] args) {
		
		//声明Apple集合
		ArrayList<Apple> appleList = new ArrayList<>();
		
		//一堆Apple
		appleList.add(new Apple(1L, Color.red, 80.0F, "台湾"));
		appleList.add(new Apple(2L, Color.red, 90.0F, "台湾"));
		appleList.add(new Apple(3L, Color.red, 100.0F, "北京"));
		appleList.add(new Apple(4L, Color.red, 80.F, "台湾"));
		appleList.add(new Apple(5L, Color.red, 90.0F, "台湾"));
		appleList.add(new Apple(6L, Color.green, 100.0F, "台湾"));

		//筛选Apple1
		List<Apple> appleFilter = filterApplesByAppleFilter(appleList, new AppleFilter() {
			@Override
			public boolean accept(Apple apple) {
				return Color.red.equals(apple.getColor()) && apple.getWeight() >= 90 && apple.getOrigin().equals("台湾");
			}

		});
		
		System.out.println(appleFilter.size());
		
		
		//筛选Apple2
		appleFilter = filterApplesByAppleFilter(appleList, apple -> Color.red.equals(apple.getColor()) && apple.getWeight() >= 90 );

		System.out.println(appleFilter.size());
	}

	
	/**
	 * Apple过滤器
	 * @author 0.0
	 * 
	 * @FunctionalInterface  函数式接口注解，使用该注解表明该抽象方法只能有一个抽象方法，用于lambda
	 */
	@FunctionalInterface
	interface AppleFilter {
		
		boolean accept(Apple apple);
	}

	
	/**
	 * 删选符合条件的Apple
	 * @description
	 * @param appleList
	 * @param appleFilter
	 * @return
	 * @author chenpengwei
	 * @date 2019年5月15日 下午2:27:43
	 */
	public static List<Apple> filterApplesByAppleFilter(List<Apple> appleList, AppleFilter appleFilter) {
		
		// 保存符合删选条件的Apple
		ArrayList<Apple> filterApple = new ArrayList<Apple>();

		// 将符合条件的Apple添加进filterApple里
		for (Apple apple : appleList) {
			if (appleFilter.accept(apple))
				filterApple.add(apple);
		}

		// 返回符合条件的Apple
		return filterApple;
	}

}
