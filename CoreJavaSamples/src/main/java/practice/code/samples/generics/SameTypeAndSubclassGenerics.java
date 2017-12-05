package practice.code.samples.generics;


/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class SameTypeAndSubclassGenerics {
	public static void main(String[] args) {
		
		NumberType<Integer> numType = new NumberType<Integer>(5);
		numType.add(10);
		int val = numType.get();
		System.out.println("Val: " + val);
		
		NumberType<Double> floatType = new NumberType<Double>(2);
		floatType.add(10.10);
		double fVal = floatType.get();
		System.out.println("double val: " + fVal);
		
		//ERROR - Bound mismatch: The type String is not a valid substitute for the bounded parameter <T extends Number> of the type NumberType<T>
		//NumberType<String> strType = new NumberType<String>(5);
		
	}
}

class NumberType<T extends Number>{
	public T[] contents;
	private int index = 0;
	
	@SuppressWarnings("unchecked")
	public NumberType(int size) {
		contents = (T[]) new Number[size];
	}
	
	public void add(T content){
		contents[index] = content;
	}
	
	public T get(){
		return contents[index];
	}
}