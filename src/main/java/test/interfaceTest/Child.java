package test.interfaceTest;

public class Child implements Parent {

	@Override
	public String birthChild(String child) {
		return "1";
	}
	
	public String getChildName(String a, Parent b) {
		return b.birthChild(a);
	}

}