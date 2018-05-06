package watermelons;

import java.util.Arrays;

public class Watermelons {

	/**
	 * Computes the sum of each distinct pair of entries in the incoming array.
	 * A given pair of entries has its sum computed only once.  So if you
	 * compute the sum for entries 2 and 4, and that sum appears in your answer
	 * array, then you do not also compute the sum of entries 4 and 2.
	 * Depending on the input, the same sum value may appear multiple times in the result.
	 * For example, if all of the incoming values are 0, then so are all of the returned values.
	 * @param nums an array of integers, possibly containing duplicates
	 * @return an array containing the sums of pairs as described above
	 */
	public static int[] allPairSums(int[] nums) {

		int numSums = nums.length*(nums.length-1)/2;
		int[] sums = new int[numSums];
		int i = 0;
		for (int j = 0; j < nums.length-1; j++){
			for (int k = j+1; k < nums.length; k++){
				sums[i] = nums[j]+nums[k];
				i++;
			}
		}
		return sums;
	}

	/**
	 * The method below must COMPUTE and return a solution as described
	 * on the web page for this extension.  
	 * 
	 * You must compute the solution by trying
	 * lots of possibilities, and finding the one that yields the right answer.
	 * 
	 * You can run the provided unit test to see if you are right.
	 * @param pairSums is array of watermelon pairwise sums.  In other words,
	 *    each element of pairSums represents the sum of one pair of watermelons in our puzzle.
	 * @return
	 */
	public static int[] getSolution(int[] pairSums) {
		int sum = 0;
		for (int i = 0; i < pairSums.length; i++) {
			sum = sum + pairSums[i];
		}
		int average = sum / (pairSums.length / 2 - 1);
		int[] ans = new int [pairSums.length / 2];
		for (int a = 0; a <= average; a++) {
			for (int b = 0; b <= average; b++) {
				for (int c = 0; c <= average; c++) {
					for (int d = 0; d <= average; d++) {
						for (int e = 0; e <= average; e++) {
							if ((a + b + c + d + e) == average) {
								ans[0] = a;
								ans[1] = b;
								ans[2] = c;
								ans[3] = d;
								ans[4] = e;
							}
						//	if (sameIntArrays(pairSums, allPairSums(ans))) {
							//	return ans;
							}
						}
					}
				}
			}
		}
		return ans;
	}

	/**
	 * Compare two arrays for equality.  They must first be
	 * sorted, so that Arrays.equals can do its thing element
	 * by element, as is it wants.
	 * 
	 * However, what if the caller doesn't want the arrays to
	 * be disturbed?  We therefore clone the arrays (copies are
	 * made of them) before we do the compare, and we compare the
	 * clones.
	 * @param one: an array, not mutated
	 * @param two: another array, not mutated
	 * @return true iff the arrays' contents are the same
	 */
	public static boolean sameIntArrays(int[] one, int[] two) {
		int[] cone = (int[]) one.clone();
		int[] ctwo = (int[]) two.clone();
		Arrays.sort(cone);
		Arrays.sort(ctwo);
		return Arrays.equals(cone, ctwo);
	}


}
