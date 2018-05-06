package studio6;

public class Methods {

	// Your methods go below this line

	/**
	 * Factorial
	 * @param n any integer
	 * @return the factorial of n
	 */
	public static int fact(int n) {
		if (n <= 0) {
			return 1;
		} else {
			return n * fact(n - 1);
		}
	}

	/**
	 * Fibonacci
	 * @param n any integer
	 * @return the fibonacci sum of n
	 */
	public static int fib(int n) {
		if (n <= 1) {
			return n;
		} else {
			return fib(n - 1) + fib(n - 2);
		}
	}

	/**
	 * Determining odd
	 * @param n any integer
	 * @return if n is odd or not
	 */
	public static boolean isOdd(int n) {
		if (n <= 0) {
			return false;
		} else {
			return !isOdd(n - 1);
		}
	}

	/**
	 * Sum
	 * @param a integer and b integer
	 * @return the sum of a + a+1 until b = 0
	 */
	public static int sum(int a, int b) {
		if (b <= 0) {
			return a;
		} else {
			return sum(a + 1, b - 1);
		}
	}

	/**
	 * Sum Down by Two
	 * @param n integer
	 * @return the sum of n + n-2
	 */
	public static int sumDownBy2(int n) {
		if (n == 1) {
			return 1;
		}
		if (n == 0) {
			return 0;
		} else {
			return n + sumDownBy2(n - 2);
		}
	}
	
	/**
	 * Harmonic Sum
	 * @param n integer
	 * @return the sum of 1/n + 1/n-1
	 */
	public static double harmonicSum(int n) {
		if (n == 1) {
			return 1;
		}
		else {
			return (1.0/n) + harmonicSum(n-1);
		}
	}
	
	/**
	 * Multiplication
	 * @param a integer, b integer
	 * @return the multiplication of a and b
	 */
	public static int mult(int a, int b) {
		if (b <= 0) {
			return 0;
		} else {
			return a + mult(a, b-1);
		}
	}

}
