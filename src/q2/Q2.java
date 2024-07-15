package q2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Q2 {

	public static void main(String[] args) {

		try (BufferedReader reader = new BufferedReader(
				new FileReader("C:\\Users\\CPG\\eclipse-workspace\\QCM_1\\files\\input.txt"));
				BufferedWriter writer = new BufferedWriter(
						new FileWriter("C:\\Users\\CPG\\eclipse-workspace\\QCM_1\\files\\output.txt"))) {
			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
