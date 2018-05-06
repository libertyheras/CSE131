package studio1;

import cse131.ArgsProcessor;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArgsProcessor ap = new ArgsProcessor(args);
		
		int n1 = ap.nextInt("What is n1?");
		int n2 = ap.nextInt("What is n2?");
		
		double average = (double) (n1 + n2)/2;
		
		System.out.println("The average of n1 and n2 is " + average + ".");
		
	}

}
