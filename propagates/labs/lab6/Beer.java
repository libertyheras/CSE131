package lab6;

import cse131.ArgsProcessor;

public class Beer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.print(bottlesOfBeer(5));
	}

	/**
	 * Bottles of Beer Song
	 * @param n number of initial bottles
	 * @return n bottles of beer on the wall, n bottles of beer...
	 */
	public static String bottlesOfBeer(int n) {
		if (n <= 0) {
			return "";
		} else {
			return n + " bottles of beer on the wall, " + n + " bottles of beer; you take one down, pass it around, "
					+ (n - 1) + " bottles of beer on the wall. \n" + bottlesOfBeer(n - 1);
		}
	}

}
