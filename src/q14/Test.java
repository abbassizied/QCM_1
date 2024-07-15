package q14;

import java.io.FileNotFoundException;
import java.util.Random;

public class Test {
	static void throwingMrthod() throws FileNotFoundException {
		try {

			if (new Random().nextInt(10) > 5) {
				throw new ArithmeticException();
			} else {
				throw new FileNotFoundException();
			}
		} catch (RuntimeException rx) {
			throw rx;
		}

	}

	public static void main(String[] args) {

	}

}
