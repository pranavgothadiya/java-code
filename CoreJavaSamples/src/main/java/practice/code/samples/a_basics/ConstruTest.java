package practice.code.samples.a_basics;

public class ConstruTest {
	
	public ConstruTest(String name) {
		System.out.println("ConstrTest->Constructor name: " + name);
	}

	public static void main(String[] args) {

	}

}

class SubTest extends ConstruTest{

	public SubTest(String name){
		super(name);
		System.out.println("SubTest");
	}
}
