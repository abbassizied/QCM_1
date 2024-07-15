package q24;

public class Test {

	public static void main(String[] args) {
		try {
			throw new IllegalArgumentException();
		} catch (RuntimeException e) {
			System.out.println(1);
		} catch (Exception e) {
			System.out.println(1);
		} catch (IllegalArgumentException e) {
			System.out.println(1);
		} finally {
			System.out.println(4);
		}

	}

}
