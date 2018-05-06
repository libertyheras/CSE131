package studio5;

import java.lang.reflect.Array;

public class Methods {
	
	/**
	 * Implemented correctly
	 * @param x one thing to add
	 * @param y the other thing to add
	 * @return the sum
	 */
	public static int sum(int x, int y) {
		return x+y;
	}
	
	/**
	 * 
	 * @param x one factor
	 * @param y another factor
	 * @return the product of the factors
	 */
	public static int mpy(int x, int y) {
		return x*y;  // FIXME
	}
	
	/**
	 * 
	 * @param x one integer
	 * @param y second integer
	 * @param z third integer
	 * @return the sum divided by the number of integers
	 */
	public static double avg3 (int x, int y, int z) {
		return ((double)(x + y + z))/3.0;
	}
	
	/**
	 * 
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	
	/**
	 * 
	 * @param array input array
	 * @return sum of all values in array
	 */
	public static double sumArray (double[]array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {	
			sum = sum + array[i];
		}
		return sum;
	}
	
	/**
	 * 
	 * @param array input array
	 * @return sum of all values in array divided by number of values
	 */
	public static double average (double[]array) {
		double sum = 0;
		for (int i = 0; i < array.length; i++) {	
			sum = sum + array[i];
		}
		return sum/array.length;
	}
	
	/**
	 * 
	 * @param array input array
	 * @return the largest value that appears in the array
	 */
	public static double largest (double[]array) {
		double largest = 0;
		for (int i = 0; i < array.length; i++) {	
			if (array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
	
	public static String pig (String s) {
		return s.substring(1) + s.substring(0, 1) + "ay";
	}


}
