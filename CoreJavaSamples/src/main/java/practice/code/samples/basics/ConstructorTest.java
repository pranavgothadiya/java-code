package practice.code.samples.basics;

/**
 * Simple Constructor test
 * @author Pranav_Gothadiya
 *
 */
public class ConstructorTest {
	
	public ConstructorTest(String name) {
		System.out.println("ConstrTest->Constructor name: " + name);
	}

	public static void main(String[] args) {
		ConstructorTest test = new SubTest("Hi");
	}

}

class SubTest extends ConstructorTest{

	public SubTest(String name){
		super(name);
		System.out.println("SubTest");
	}
}
