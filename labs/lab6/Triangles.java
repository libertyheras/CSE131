package lab6;

import sedgewick.StdDraw;

public class Triangles {

	public static void main(String[] args) {
		triangle(0., 0., 1.);
	}

	public static int triangle(double x, double y, double size) {
		double f = (Math.pow(3, .5)) / 2;
		
		if (size < .01)
			return 1;
		else {
			// Lines of triangle
			StdDraw.line(x, y, x + size, y);							//bottom line
			StdDraw.line(x, y, x + size / 2, y + (size * f));		    //left line
			StdDraw.line(x + size / 2, y + (size * f), x + size, y); //right line
			
			//Recursive call to redraw triangels in new places
			triangle(x,y,size/2); 					//right line
			triangle(x+size/2,y,size/2); 			//left line
			triangle(x+size/4,y+(size*f)/2,size/2); //bottom line
		}
		return 0;

	}

}
