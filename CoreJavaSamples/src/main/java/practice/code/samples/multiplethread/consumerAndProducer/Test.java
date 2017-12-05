package practice.code.samples.multiplethread.consumerAndProducer;

import java.util.Vector;

/**
 * 
 * @author Pranav_Gothadiya
 *
 */
public class Test {

	public static void main(String[] args) {
		Vector list = new Vector();
		int size = 5;
		Thread producer = new Thread(new Producer(list, size), "Producer" );
		Thread consumer = new Thread(new Consumer(list, size), "Consumer");

		producer.start();
		consumer.start();
	}
}
