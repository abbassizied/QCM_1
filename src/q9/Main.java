package q9;

import java.util.stream.Stream;

public class Main {

	public static void main(String[] args) {
		Stream<Integer> stream = Stream.of(1, 2, 3, 4, 5).map(i -> i * i).sorted(); // 1
		stream.forEach(System.out::println);
		stream.filter(n -> n > 1).forEach(System.out::println); // 2

	}

}
