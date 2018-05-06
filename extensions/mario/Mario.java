package mario;

import cse131.ArgsProcessor;

public class Mario {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int n = ap.nextInt();

		for (int i = n; i >= 0; i--) {
			// System.out.print("#");
			for (int j = n - i; j > 0; j--) {
				System.out.print("#");
			}
			for (int k = i; k >= 0; k--) {
				System.out.print(" ");
			}

			System.out.println();
		}
		System.out.println();
		for (int i = n; i > 0; i--) {
			// System.out.print("#");
			for (int k = i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = n - i; j >= 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			// System.out.print("#");
			for (int k = i; k > 0; k--) {
				System.out.print(" ");
			}
			for (int j = n - i; j > 0; j--) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println();
		for (int i = 0; i < n; i++) {
			// System.out.print("#");
			for (int j = n - i; j > 0; j--) {
				System.out.print("#");
			}
			for (int k = i; k > 0; k--) {
				System.out.print(" ");
			}
			System.out.println();
		}

	}

}
