package q15;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es = Executors.newSingleThreadExecutor();
		es.execute(() -> System.out.println("1")); // line 1
	    System.out.println(es.execute(() -> "2")); // line 2
		es.submit(() -> System.out.println("3")); // line 3
		System.out.println(es.submit(() -> "4")); // line 4

	}

}
