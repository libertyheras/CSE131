package exercises4;

import cse131.ArgsProcessor;

public class Pitches {

	public static void main(String[] args) {
		// encoding has 0 as concert A
		//    1 would be Bb, just above A
		//   -1 would be Ab, just below A

		ArgsProcessor ap = new ArgsProcessor(args);
		int p1 = ap.nextInt("What first pitch?");
		double f1 = 440.0*Math.pow(2, p1/12.0);
		
		int p2 = ap.nextInt("What second pitch?");
		double f2 = 440.0*Math.pow(2, p2/12.0);
		
		double r = f2/f1;
		
		
		System.out.println("For pitch "+p1+" We get a frequency of "+f1+" A diationic fifth of "+f2+" A ratio of "+r);
		System.out.println("We get a ratio of "+r);
		
		
	}

}
