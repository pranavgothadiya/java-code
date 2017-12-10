package practice.code.samples.basics;

/**
 * How to use String
 * @author Pranav_Gothadiya
 *
 */
public class StringTest {
	
 
	public StringTest(String name) {
		// TODO Auto-generated constructor stub
	}
	
	public StringTest(int id) {
		// TODO Auto-generated constructor stub
	}
	
	public void stringOperations(){ 
		
		StringTest test = new StringTest("Test");
		
		String str = "We are working for SymDNA team";
		System.out.println("Lenght: " + str.length());
		System.out.println("charAt 0: " + str.charAt(0));
		System.out.println(str.codePointAt(3));
		System.out.println("Concat String: " + str.concat(", great!"));
		System.out.println(str.substring(str.indexOf('S')));
		System.out.println(str.substring(str.indexOf('S'), str.indexOf('A') + 1));
		System.out.println("Lower case: " + str.toLowerCase());
		System.out.println("Upper case: " + str.toUpperCase());
		System.out.println("Starts with: " + str.startsWith(" We".trim()));
		System.out.println("Ends with: " + str.endsWith("am ".trim()));
		System.out.println("index of: " + str.indexOf("working"));
		System.out.println("last index of: " + str.lastIndexOf('r', str.length()));
		System.out.println("intern: " + str.intern());
		
	} 
	
}


class Test extends StringTest{
	
	public Test(String name) {
		super(name);
	}
	
}

class Test2 extends Test {

	public Test2(String name) {
		super(name);
	}
	
}