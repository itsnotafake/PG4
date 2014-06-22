
public class FunkyClass {
	
	static int sCount = 0;
	
	String sVal = null;
	
	public FunkyClass(String s) {
		sVal = s;
		sCount++;
	}
	
	public void print() {
		System.out.println("Lang " + sCount + ": " + sVal);
	}
}
