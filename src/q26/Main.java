package q26;

public class Main {
	public static LEVEL levelCalculation(int intensity) {
		/*
		return switch(intensity) {
		case 1,2 -> LEVEL.EASY;
		case 3,4 -> {yield LEVEL.MID;}
		case 5,6 : yield LEVEL.HARD;
		case 7,8 -> yield LEVEL.IMPOSSIBLE;
		 */
		return switch (intensity) {
		case 1, 2 -> LEVEL.EASY;
		case 3, 4 -> LEVEL.MID;
		case 5, 6 -> LEVEL.HARD;
		case 7, 8 -> LEVEL.IMPOSSIBLE;
		default -> LEVEL.IMPOSSIBLE;
		};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public enum LEVEL {
		EASY, MID, HARD, IMPOSSIBLE
	}

}
