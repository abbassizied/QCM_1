package q45;

import java.nio.file.Path;

public class Test {

	public static void main(String[] args) {
		Path pt1 = Path.of("C:\\Users\\Zied\\eclipse-workspace\\QCM_1\\files\\input.txt");
		Path subPath = pt1.subpath(1, 4).resolve(pt1);
		System.out.println(subPath);
	}

}
