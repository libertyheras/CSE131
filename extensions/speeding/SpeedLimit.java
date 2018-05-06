package speeding;

import cse131.ArgsProcessor;

public class SpeedLimit {
	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	
	int speed = ap.nextInt("What speed were you going at?");
	int limit = ap.nextInt("What is the speed limit?");
	int fine = 0;
	int diff = speed - limit;
	
	int finecomp = 50 + 10*(diff - 10);
	
	
	fine = (diff > 0) ? 50:0;
	fine = (diff > 10) ? finecomp:fine;

	
	System.out.println("You reported a speed of " + speed + " MPH for a limit of "+limit+" MPH");
	System.out.println("You went "+diff+" over the limit");
	System.out.println("Your fine is "+fine);
	
	
	}
}
