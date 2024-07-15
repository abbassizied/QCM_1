package q50;

import java.util.TreeSet;

public class Car {
	int horsePower;
	String model;
	boolean isFourWheelDrive;

	public Car(int horsePower, String model, boolean isFourWheelDrive) {
		super();
		this.horsePower = horsePower;
		this.model = model;
		this.isFourWheelDrive = isFourWheelDrive;
	}

	public int compareTo(Car o) {
		if (this.horsePower - o.horsePower != 0) {
			return this.horsePower - o.horsePower;
		} else {
			return this.model.compareTo(o.model);
		}
	}

	public static void main(String[] args) {
		TreeSet<Car> cars = new TreeSet<>();
		cars.add(new Car(100, "Mercedes", false));
		cars.add(new Car(150, "BMW", true));
		cars.add(new Car(200, "Audi", false));
		cars.add(new Car(100, "Aston Martin", false));
		System.out.println(cars.first().model);

	}

}
