package q48;

import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {
		// A - Collectors.joining()
		// B - Collectors.joining("")
		// C - Collectors.joining("","","")
		// D - Collectors.reducing( (a,c) -> a.concat(c))
		// E - Collectors.reducing("", (a, c) -> a.concat(c))
		// F -
		List<String> chars = List.of("O", "C", "P", "17");
		String message = chars.stream().collect(Collectors.reducing("", (a, c) -> a.concat(c)));
		System.out.println(message);

	}

}
