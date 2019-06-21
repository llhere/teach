package test.lambda.lambdaNum;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

public class LambdaListMap{

	public static void main(String[] args) {
		
		File[] listFiles = new File("D:\\code\\apache-maven-3.5.4").listFiles(pathname -> pathname.isFile());
		System.out.println(listFiles.length);
		
		
		
		List<String> list = new ArrayList<>();
		list.add("1");
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("5");
		list.add("6");
		
		
		Map<Integer,String> map = new HashMap<>();
		map.put(1, "1");
		map.put(2, "2");
		map.put(3, "3");
		map.put(4, "4");
		
		
		
		map.forEach(new BiConsumer<Integer, String>() {

			@Override
			public void accept(Integer t, String u) {
				System.out.println(u);
				
			}
		});
		
		map.forEach( (s,n) -> System.out.println(n) );
		
		
	}

}
