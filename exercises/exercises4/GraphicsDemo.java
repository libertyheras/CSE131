package exercises4;

import java.awt.Color;

import sedgewick.StdDraw;

public class GraphicsDemo {

	public static void main(String[] args) {
		// blue point (look carefully, will be very small on your screen)
		StdDraw.setPenColor(Color.blue);
		StdDraw.point(.5, .5);
		// larger green point
		StdDraw.setPenColor(Color.green);
		StdDraw.setPenRadius(.05);
		StdDraw.point(.25, .25);
		// unfilled red triangle
		StdDraw.setPenColor(Color.red);
		StdDraw.setPenRadius(.02);
		StdDraw.line(0,0,0,1);
		StdDraw.line(0,1,.5,0);
		StdDraw.line(.5,0,0,0);
		// yellow circle, filled
		StdDraw.setPenColor(Color.yellow);
		StdDraw.filledCircle(.75, .75, .15);
		// filled blue rectangle
		StdDraw.setPenColor(Color.blue);
		StdDraw.filledRectangle(.75, .25, .2, .1);

		
		
	}

}
