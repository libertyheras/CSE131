package studio2;

import cse131.ArgsProcessor;
import java.util.*;

public class pi {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		Random random = new Random();
		
		double darts=0, inside=0;
		double x=0, y=0, x2=0, y2=0, sum=0;
		double pi = 0;
		
		darts = ap.nextDouble("How many darts would you like to use to estiamte pi?");
		
		for (int i=0; i<darts; i++) {
			
			x = random.nextDouble();
			y = random.nextDouble();
			
			x2 = x*x;
			y2 = y*y;
			sum = x2+y2;
			
			if (sum<1)
				inside++;

		}
		
		pi = (inside/darts)*4;
		System.out.println(pi);
		
		
	}
}
