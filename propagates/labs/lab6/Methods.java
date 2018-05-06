package lab6;

public class Methods {

	//
	// In this class, implement the f and g functions described on the lab page
	//

	/**
	 * @param args
	 */
	
	/**
	 * Function f
	 * @param x input integer
	 * @return f(x)
	 */
	public static int f(int x) {
		if (x > 100) {
			return (x - 10);
		} else {
			return f(f(x + 11));
		}
	}
	
	/**
	 * Function g
	 * @param x, y input integers
	 * @return g(x,y)
	 */
	public static int g(int x, int y) {
		if (x == 0) {
			return (y + 1);
		} else if (x > 0 && y == 0) {
			return g(x - 1, 1);
		} else {
			return g(x - 1, g(x, y - 1));
		}
	}

	public static void main(String[] args) {
		System.out.println(f(87));
		System.out.println(f(23));
		System.out.println(f(123));
		// Function f(x)
		// Will this function terminate for all positive integers supplied as arguments.
		// yes
		// What do you expect this function to do for values of x > 100?
		// subtract 10 if value is greater than 111, equal 91 if x < 111
		// How will it behave for values <= 100?
		// equals 91

		System.out.println(g(1, 0));
		System.out.println(g(1, 2));
		System.out.println(g(2, 2));
		System.out.println(g(4, 0));
		// System.out.println(g(4, 1));
		// System.out.println(g(4, 2));

		// Will this function terminate for all positive integers supplied as arguments?
		// no
		// How do you expect this function behave with respect to x and y?
		// Implement it and try it out for values of x < 4 and various values of y.
		// Now try it for x = 4 and various values of y.
		// What do you see?
		// error
		// Why does the function behave this way?
	}

}
