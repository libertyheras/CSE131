package lab6;

import sedgewick.StdDraw;

public class Triangles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		triangle(0.,0.,1.);
	}
	
	public static void triangle(double x, double y, double size) {
		double r = (Math.sqrt(3))/2;
		if (size < 0.001) {
			return;
		} else {
			StdDraw.line(x, y, x+size, y);
			StdDraw.line(x, y, x+size/2, y + (size*r));
			StdDraw.line(x+size/2, y + (size*r), x+size, y);
			
			triangle(x, y, size/2);
			triangle(x+size/2, y, size/2);
			triangle(x+size/4, y + (size*r)/2, size/2);
		}
	}

}
