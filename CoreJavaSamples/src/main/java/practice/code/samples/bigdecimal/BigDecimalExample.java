package practice.code.samples.bigdecimal;

/**
 * How to use Big Decimal
 * @author Pranav_Gothadiya
 */
import java.io.IOException;
import java.math.BigDecimal;

public class BigDecimalExample {

	int i;

	public static void main(String args[]) throws IOException {

		// floating point calculation

		double amount1 = 2.15;
		double amount2 = 1.10;
		// floating point subtraction using 'double'
		System.out.println("[double] difference between 2.15 and 1.10 using double is: " + (amount1 - amount2));
		System.out.println("[double] Addtion of 2.15 and 1.10 using double is: " + (amount1 + amount2));

		// Use BigDecimal for financial calculation
		// ALWAYS USE 'BigDecimal' WITH 'String'
		// BigDecimal with 'String' value
		BigDecimal amount3 = new BigDecimal("2.15");
		BigDecimal amount4 = new BigDecimal("1.10");
		System.out.println("[BigDecimal] difference between 2.15 and 1.10 using BigDecimal is: " + (amount3.subtract(amount4)));

		// BigDecimal with 'double' value
		BigDecimal amount5 = new BigDecimal(2.15);
		BigDecimal amount6 = new BigDecimal(1.10);
		System.out.println("[Bigdecimal] difference between 2.15 and 1.10 using BigDecimal is: " + (amount5.subtract(amount6)));

	}

	private void test() {
		System.out.println(i);
	}
}

// Read more:
// http://javarevisited.blogspot.com/2012/02/java-mistake-1-using-float-and-double.html#ixzz3DC87Zn6V
