package q46;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {

	public static void main(String[] args) {
		MyClass myClassInstance = new MyClass();
		ExecutorService service = Executors.newFixedThreadPool(29);
		try {
			for (int i = 0; i < 1000; i++)
				service.submit(myClassInstance::increment);
		} finally {
			service.shutdown();
		}

	}

}


class MyClass {
	 private int myInt = 0;

	public void increment() {
		System.out.println(++myInt);
	}
}


/*
class MyClass {
	private volatile int myInt = 0;

	public void increment() {
		System.out.println(++myInt);
	}
}
*/

/*
class MyClass {
	private int myInt = 0;

	synchronized public void increment() {
		System.out.println(++myInt);
	}
}
*/

/*
class MyClass {
	private AtomicInteger myInt = new AtomicInteger(0);

	synchronized public void increment() {
		System.out.println(myInt.incrementAndGet());
	}
}
*/