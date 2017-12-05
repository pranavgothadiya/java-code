package practice.code.samples.a_basics;

public class Main {

	public static void main(String[] args) {
		method(null);
		
		System.out.println("String Test");
		System.out.println("-----------");
		StringTest strTest = new StringTest(1);
		strTest.stringOperations();
		
		System.out.println("String Immutability Test");
		System.out.println("-----------");
		String first = "Hello";
		System.out.println("first Hashcode: " + first.hashCode());
		String second = "Hello";
		System.out.println("second Hashcode: " + second.hashCode());
		String third = second.toUpperCase();
		System.out.println("third Hashcode: " + third.hashCode());
		

		String objFirst = new String("Hello");
		String objSecond = new String("Hello");
		System.out.println("objFirst Hashcode: " + objFirst.hashCode());
		System.out.println("objsecond Hashcode: " + objSecond.hashCode());
		
	}
	
	public static void method(Object o) {
		System.out.println("Object impl");
	}

	public static void method(String s) {
		System.out.println("String impl");
	}
	
}

		/*public static void method(Exception s) {
			System.out.println("String impl");
		}
		
		public static void method(ArithmeticException s) {
			System.out.println("String impl");
		}*/

		//String is immutable
		/*String first = "Hello";
		System.out.println("Hashcode: " + first.hashCode());
		String second = "Hello";
		System.out.println("Hashcode: " + second.hashCode());
		String third = second.toUpperCase();
		System.out.println("Hashcode: " + third.hashCode());
		

		String objFirst = new String("Hello");
		String objSecond = new String("Hello");
		System.out.println("Hashcode: " + objFirst.hashCode());
		System.out.println("Hashcode: " + objSecond.hashCode());*/
		
		//StringTest strTest = new StringTest(1);
		//strTest.stringOperations();