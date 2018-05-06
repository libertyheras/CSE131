package lab5;

public class Lab5Methods {

	/**
	 * 
	 * @param n
	 * @return n + (n-2) + (n-4) + ...
	 */

	public static int sumDownBy2(int n) {
		int sum = 0;
		for (int i = n; i >= 0; i -= 2) {
			sum = sum + i;
		}
		return sum;
	}

	/**
	 * 
	 * @param n
	 * @return 1 + 1/2 + 1/3 + ... + 1/(n-1) + 1/n
	 */

	public static double harmonicSum(int n) {
		double sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (1. / (double) i);
		}
		return sum;
	}

	/**
	 * 
	 * @param n
	 * @return the sum 1 + 1/2 + 1/4 + 1/8 + ... + 1/Math.pow(2,k)
	 */

	public static double geometricSum(int n) {
		double sum = 0;
		for (int i = 0; i <= n; i++) {
			sum = sum + (1. / Math.pow(2, i));
		}
		return sum;
	}

	/**
	 * 
	 * @param j
	 * @param k
	 * @return the product j*k
	 */

	public static int multPos(int j, int k) {
		int ans = 0;
		for (int i = 1; i <= k; i++) {
			ans = ans + j;
		}
		return ans;
	}

	/**
	 * 
	 * @param j
	 * @param k
	 * @return the product j*k
	 */

	public static int mult(int n, int k) {
		int J = Math.abs(n);
		int K = Math.abs(k);
		int ans = multPos(J, K);
		if (n == 0) {
			ans = 0;
		}
		if (k == 0) {
			ans = 0;
		}
		if (n < 0) {
			ans = -1 * ans;
		}
		if (k < 0) {
			ans = -1 * ans;
		}
		return ans;
	}

	/**
	 * 
	 * @param n
	 * @param k
	 * @return the value of n to the power k
	 */

	public static int expt(int n, int k) {
		int N = Math.abs(n);
		int ans = 1;
		for (double i = 1; i <= k; i++) {
			ans = ans * N;
		}
		if (n < 0 && k % 2 != 0) {
			ans = -1 * ans;
		}
		return ans;
	}
}
