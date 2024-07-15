package q3;

public class MainRunner {

	public static void main(String[] args) {
		var index = 0;
		for (;;) { // 1
			if (index > 3)
				continue;
			else // 2
				break; // 3
			index++; // 4

		}
		System.out.println(index++);

	}

}
