package q6;

class Vehicule {
	public Vehicule() {
		System.out.println("Vehicule is constructed");
	}
}

class Car extends Vehicule {
	public Car() {
		System.out.println("Car is constructed");
	}
}

class Mercedes extends Car {
	public Mercedes() {
		this();
		System.out.println("Mercedes is constructed");
	}
}

public class CarTest {

	public static void main(String[] args) {
		Vehicule mercedes = new Mercedes();

	}

}
