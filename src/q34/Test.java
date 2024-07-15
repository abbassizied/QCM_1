package q34;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		List<String> cars = List.of("Dodge", "Aston Martin", "Chevrolet", "BMW");
		cars.stream().map(e -> e.substring(1, e.length())) // line 1
				.sorted(Comparator.reverseOrder()) // line 2
				.collect(Collectors.toList());
		System.out.println(cars.get(0));
	}

}
