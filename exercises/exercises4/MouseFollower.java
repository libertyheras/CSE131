package exercises4;

import java.awt.Color;

import cse131.ArgsProcessor;
import sedgewick.StdDraw;

public class MouseFollower {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N = ap.nextInt("How much history do you want?");
		
		StdDraw.setPenColor(Color.BLUE);
		
		double[] histx = new double[N];
		double[] histy = new double[N];
		
		int count =0;
		
		while (true) {
			StdDraw.clear();
			//
			// Render one frame of your animation below here
			//
			double x = StdDraw.mouseX();
			double y = StdDraw.mouseY();
			histx[count] =x;
			histy[count] =y;
			
			
			count ++;
			if (count >= histx.length) {
				count =0;
			}
			 int oldest = count;
			
			 
			 StdDraw.filledCircle(histx[oldest], histy[oldest], .01);
			//  
			// End of your frame
			//
			// Stdraw.show(..) achieves double buffering and
			//   avoids the tight spinning loop
			StdDraw.show(10);
		}

	}

}
