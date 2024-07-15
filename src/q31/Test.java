package q31;

public class Test {

	public static void main(String[] args) {
		String someText = new String(new StringBuilder().append(""));
/*
 * A - someText.isEmpty()
 * B - someText.isBlank()
 * C - someText == ""
 * D - someText.compareTo("")!=0  
 */
		if (someText.compareTo("")!=0) {
			System.out.println("It's not empty!");
		} else {
			throw new RuntimeException("String is empty");
		}
	}

}
