package q39;

import java.util.List;
import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		List<Car> myCars = List.of(new Car("Mercedes", 2500.0), new Car("BMW", 3500.0), new Car("Audi", 6000.0));

		Optional<Double> average = myCars.stream().peek(c -> c.setPrice(1000)).mapToDouble(Car::getPrice).average();
		
		average.ifPresent(System.out::println);
	}

}
