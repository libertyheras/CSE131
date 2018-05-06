package lab9;

import cse131.ArgsProcessor;

public class FindInputWord {

	private static String[][] grid = new String[4][4];

	/**
	 * A WUggle game
	 * 
	 * @param grid
	 *            a 4x4 array of Strings. The string at row r, 0 <= r < 4 and column
	 *            c, 0 <= c < 4 is stored at grid[r][c]
	 */

	public static void main(String[] args) {
		int rand = (int) (Math.random() * ((5) + 1));
		grid[0][0] = Dice.die00[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[0][1] = Dice.die01[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[0][2] = Dice.die02[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[0][3] = Dice.die03[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[1][0] = Dice.die04[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[1][1] = Dice.die05[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[1][2] = Dice.die06[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[1][3] = Dice.die07[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[2][0] = Dice.die08[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[2][1] = Dice.die09[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[2][2] = Dice.die10[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[2][3] = Dice.die11[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[3][0] = Dice.die12[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[3][1] = Dice.die13[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[3][2] = Dice.die14[rand];
		rand = (int) (Math.random() * ((5) + 1));
		grid[3][3] = Dice.die15[rand];
		rand = (int) (Math.random() * ((5) + 1));

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.print(grid[i][j]);
			}
			System.out.println();
		}
		System.out.println();
boolean chk = true;
		while(chk ==true) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String in = ap.nextString("String to be found");
System.out.println("String to find: " + in);
		boolean check = stringMatch(in);
		if (check) {
			System.out.println("yes!");
		} else {
			System.out.println("no!");
		}
		System.out.println();
		}
	}
/**
 * Matches string in to board string
 * @param in
 * @return true if string exists
 */
	public static boolean stringMatch(String in) {
		int length = in.length();
		// String[] chk1 = new String[length];
		// String[] chk2 = new String[length];

		String chk1 = "";
		String chk2 = "";

		String first = in.substring(0, 1);
		//System.out.println(first);
	//	System.out.println(length);
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (grid[i][j].equals(first)) {
					//System.out.println(i + " " + j);
					for (int k = i; k < length; k++) {
					if (i + length > 4) {
						break;
					}
						chk1 = chk1 + grid[k][j];
					}
					for (int k = j; k < length; k++) {
					if (j + length > 4) {
						break;
					}
						chk2 = chk2 + grid[i][k];
					}
					if (chk1.equals(in) || chk2.equals(in)) {
						return true;
				}
				
				}

			}

		}
		return false;
	}

}
