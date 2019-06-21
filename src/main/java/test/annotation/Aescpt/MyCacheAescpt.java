package test.annotation.Aescpt;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;

import redis.clients.jedis.Jedis;
import test.lambda.lambdaApple.Apple;
import org.springframework.stereotype.Component;


@Component
@Aspect
public class MyCacheAescpt {
	
	public Jedis jedis = new Jedis();

	@Around("annotation(test.annotation.program.AppleProgram)")
	public Apple queryAppleCache(ProceedingJoinPoint joinPoint) {
		
		System.out.println("方法执行前");
		
		
		return null;
	}
	
}
