package arrays;

import cse131.ArgsProcessor;

public class PascalsTriangle {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int rows = ap.nextInt("How many rows to compute");
		int dim = rows + 1;
		int[][] triangle = new int[dim][dim];

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= rows; ++j) {
				if (j == 0) {
					triangle[i][0] = 1;
				} else if (i == j) {
					triangle[i][j] = 1;
				} else if (i < 0 || j < 0 || j > i) {
					triangle[i][j] = 0;
				} else {
					triangle[i][j] = (triangle[i - 1][j] + triangle[i - 1][j - 1]);
				}
			}
		}

		for (int i = 0; i <= rows; i++) {
			for (int j = 0; j <= rows; ++j) {
				if (triangle[i][j] != 0) {
					System.out.print(triangle[i][j] + " ");
				} else {
					System.out.print("");
				}
			}
			System.out.println();
		}
	}

}
