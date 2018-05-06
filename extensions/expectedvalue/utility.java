package expectedvalue;

import cse131.ArgsProcessor;

public class utility {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int p = 110000 + (int) (Math.random() * ((160000 - 110000) + 1));

		int g = 0;

		double chance = ap.nextDouble("Probability of making it big");

		boolean check = true;

		boolean check1 = true;

		double gu = 0;

		double pu = 0;

		g = (int) ((chance * 190000.) + ((1 - chance) * 5000.));

		if (p > g) {

			check = false;

		}

		System.out.println("Assuming Linear Conditions");

		System.out.println("Salary of a Programmer: " + p);

		System.out.println("Salary of a Gamer: " + g);

		System.out.println("You should be a Gamer: " + check);

		gu = 3 * Math.pow(g, .5);

		pu = 2 * Math.pow(p, .5);

		if (pu > gu) {

			check1 = false;

		}

		System.out.println("Assuming differing utility conditions");

		System.out.println("You should be a gamer: " + check1);

	}
}
