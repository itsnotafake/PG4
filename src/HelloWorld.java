
public class HelloWorld {
	
	public static void main(String[] Args) {
		
		String[] howdy = {
		    "Hello Cool World",
		    "Bonjour Tout Le Monde Cool",
		    "JAJAJA",
		    "Haagan Daaz"
		    };
		
		for(String s:howdy) {
			FunkyClass fc = new FunkyClass(s);
			fc.print();
		}
	}
}
