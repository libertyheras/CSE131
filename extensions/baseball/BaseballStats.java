package baseball;

import cse131.ArgsProcessor;

public class BaseballStats {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		String name = ap.nextString("Name of player?");
		int ab = ap.nextInt("Number of at-bats?");
		int hits = ap.nextInt("Number of hits?");
		boolean worthy = false;
		double ba = (double) Math.round(((double) hits) / ((double) ab) * 1000d) / 1000d;

		System.out.println(name + " " + ba);
		if (ba > +.270 && ab > 200) {
			worthy = true;
		}
		System.out.println("All star worthy? " + worthy);
	}

}
