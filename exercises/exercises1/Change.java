package exercises1;

import cse131.ArgsProcessor;

public class Change {

	public static void main(String[] args) {
		//
		// Below, prompt the user to enter a number of pennies
		//
		
		
		//
		// Then, compute and print out how many 
		//    dollars, quarters, dimes, nickels, and pennies
		// should be given in exchange for those pennies, so as to
		// minimize the number of coins (see the videos)
		//
		ArgsProcessor ap = new ArgsProcessor(args);
		
		int penniesinitial = ap.nextInt("Starting number of penneis");
		int dollars = penniesinitial/100;
		int pad = penniesinitial % 100;
		int quarters = pad/25;
		int paq = pad % 25;
		int dimes = paq /10;
		int padime = paq % 10;
		int nickels = padime / 5;
		int pan = padime % 5;
		int penniesfinal = pan%5;
		
		System.out.println("you have " + dollars + " dollars");
		System.out.println("you have " + quarters + " quarters");
		System.out.println("you have " + dimes + " dimes");
		System.out.println("you have " + nickels + " nickles");
		System.out.println("you have " + penniesfinal + " pennies");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
