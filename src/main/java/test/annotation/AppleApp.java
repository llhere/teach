package test.annotation;

import java.util.HashMap;
import java.util.Map;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.Pipeline;
import test.annotation.program.AppleProgram;

public class AppleApp {
	
	static AppleProgram appleDao = new AppleProgram(); 
	
	static Jedis jedis = new Jedis("192.168.44.2", 6379);
	
	
	public static void main(String[] args) throws InterruptedException {
		
//		Apple apple = appleDao.selectAppleById(1L);
//		
//		System.out.println(apple.getId());
		
		Pipeline pl = jedis.pipelined();
		
		Map<String,String> map = new HashMap<>();
		
		long star = System.currentTimeMillis();
		
		  for (int i = 0; i <= 1500000; i++) { 
			  map.put("chen" + i, "this is :" + i);
			  
		  }
//		 
//		for (int i = 0; i <= 1500000; i++) {
//			pl.append("chen" + i, "this is :" + i);
//		}
		
		System.out.println(System.currentTimeMillis() - star);
		pl.close();
		
		
	}

}
