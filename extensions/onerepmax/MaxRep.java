package onerepmax;

import cse131.ArgsProcessor;

public class MaxRep {

	public static void main(String[] args) {

		ArgsProcessor ap = new ArgsProcessor(args);

		double r = 0;

		double max = 0;

		double d = 0;
		
		double w =0;

		r = ap.nextInt("Succesful reps?");

		w = ap.nextInt("Succesful Weight?");
		
		d = ap.nextInt("Desired number of reps?");

		max = w * (1 + (r / 30));

		d = max / (1 + r / 30);

		System.out.println("One-rep max: " + max);

		System.out.println("Weight for " + d + " reps");

		System.out.println("95% " + max * .95);

		System.out.println("90% " + max * .90);

		System.out.println("85% " + max * .85);

		System.out.println("80% " + max * .80);

		System.out.println("75% " + max * .75);

		System.out.println("70% " + max * .70);

		System.out.println("65% " + max * .65);

		System.out.println("60% " + max * .60);

		System.out.println("55% " + max * .55);

		System.out.println("50% " + max * .50);

	}

}
