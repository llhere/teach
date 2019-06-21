package test.annotation.program;

import org.springframework.stereotype.Component;

import test.annotation.myAnnotations.MyCacheAnnotation;
import test.lambda.lambdaApple.Apple;


@Component
public class AppleProgram {
	
	
	/**
	 * 
	 * @description 根据id查询Apple,缓存存在则直接返回，不存在则查数据库
	 * @param id
	 * @return
	 * @returnType Apple
	 * @author chenpengwei
	 * @date 2019年6月6日 下午1:26:47
	 */
	@MyCacheAnnotation
	public Apple selectAppleById(Long id) {
		
		System.out.println("查数据库");
		Apple apple = new Apple();
		apple.setId(2L);
		
		return apple;
	}
	
}
