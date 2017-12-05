package practice.code.samples.multiplethread.executor.callableAndFuture;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<Long> {

	public Long call() throws Exception {
		long sum = 0;
		for (long i = 0; i < 100; i++) {
			sum += i;
		}
		return sum;
	}

}
