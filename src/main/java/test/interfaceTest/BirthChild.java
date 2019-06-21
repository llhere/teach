package test.interfaceTest;

public class BirthChild {

	
	public static void main(String[] args) {
		String childName = new Child().getChildName("123", new Parent() {
			
			@Override
			public String birthChild(String child) {
				return child;
			}
		});
		
		System.out.println(childName);
		
	}
	
}
