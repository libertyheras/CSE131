package arrays;

import cse131.ArgsProcessor;

public class Sorting {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int s = ap.nextInt("how much data?");
		int[] nums = new int[s];

		for (int i = 0; i < nums.length; i++) {
			nums[i] = ap.nextInt("please enter value");
		}

		int temp = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 1; j < (nums.length - i); j++) {
				if (nums[j - 1] > nums[j]) {
					temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}

		System.out.println("sorted data");
		for (int i = 0; i < nums.length; i++) {
			System.out.println(nums[i] + " ");
		}

		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum = sum + nums[i];
		}
		double mean = sum / s;
		System.out.println("mean = " + mean);

		double median = 0;
		if (s % 2 == 1) {
			median = nums[s / 2];
		} else {
			median = 0.5 * (nums[s / 2 - 1] + nums[s / 2]);
		}
		System.out.println("median = " + median);

		int max = nums[nums.length - 1];
		int minimum = nums[0];
		System.out.println("min = " + minimum);
		System.out.println("max = " + max);

		int range = max - minimum;
		System.out.println("range = " + range);
	}
}