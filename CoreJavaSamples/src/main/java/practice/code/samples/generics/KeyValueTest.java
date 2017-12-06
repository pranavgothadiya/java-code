package practice.code.samples.generics;


/**
 * Class using Generics key-value
 * @author Pranav_Gothadiya
 */
import java.util.HashMap;

public class KeyValueTest {

	public static void main(String[] args) {
		MyMap<Integer, String> myMap = new MyMap<Integer, String>();
		myMap.put(1, "Pranav");
		String nm = myMap.get(1);
		System.out.println(nm);
	}
}


/**
 * 
 * @author Pranav_Gothadiya
 *
 * @param <K> can hold key of any type
 * @param <V> can hold value of any type
 */
class MyMap<K,V>{

	HashMap<K, V> list = new HashMap<K,V>();
	
	public V get(K key){
		return list.get(key);
	}
	
	public void put(K key, V value){
		list.put(key, value);
	}
}
