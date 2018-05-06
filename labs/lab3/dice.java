package lab3;

import cse131.ArgsProcessor;

public class dice {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int dice = ap.nextInt("Number of dice");
		int Throws = ap.nextInt("Number of throws");
		int sum = 0;

		int Sum[] = new int[dice + 1];
		int Val[] = new int[7];
		int ValT[] = new int[7];
		int[][] SumT = new int[Throws][2];
		boolean check = false;

		int Counter = 0;
		int count = 0;

		for (int i = 0; i < 7; i++) {
			ValT[i] = 0;
		}

		for (int i = 0; i < Throws; i++) {
			for (int j = 0; j < 2; j++) {
				SumT[i][j] = 0;
			}
		}

		for (int l = 0; l < Throws; l++) {
			for (int i = 0; i < 7; i++) {
				Val[i] = 0;
			}
			count++;

			System.out.print("Dice: ");

			for (int i = 1; i <= dice; i++) {
				System.out.print(i + "  ");
			}

			System.out.println();
			System.out.print("Face: ");

			for (int j = 0; j < dice; j++) {
				int k = (int) Math.round(Math.random() * 5) + 1;
				Sum[j] = k;
				Val[k] = Val[k] + 1;
				System.out.print(k + "  ");
			}

			System.out.println();
			for (int j = 0; j < dice; j++) {
				sum = Sum[j] + sum;
			}

			for (int i = 0; i < Throws; i++) {
				if (SumT[i][0] == sum) {
					check = true;
					Counter = i;
				}
			}

			if (check == true) {
				SumT[Counter][1] = SumT[Counter][1] + 1;
			} else {
				SumT[count - 1][0] = sum;
				SumT[count - 1][1] = 1;
			}

			check = false;
			System.out.println("Sum of Dice Faces: " + sum);
			sum = 0;

			for (int j = 1; j < 7; j++) {
				ValT[j] = Val[j] + ValT[j];
				double percentage = ((double) Val[j]) / dice ;
				double percentageT = ((double) ValT[j]) / ((dice * count));
				System.out.println("Number of " + j + ": " + Val[j] + "; Percentage: " + percentage+ "; Percentage Overall: " + percentageT);

			}
			System.out.println();
		}
		System.out.println("Sum   " + "Number of Appearences");
		for (int i = 0; i < Throws; i++) {
			for (int j = 0; j < 2; j++) {
				if (SumT[i][0] != 0) {
					System.out.print(SumT[i][j] + "     ");
				}
			}
			if (SumT[i][0] != 0) {
				System.out.println();
			}
		}

		System.out.println();

		for (int j = 0; j < SumT.length; j++) {
			if (SumT[j][0] != 0) {
				double percentage = ((double) SumT[j][1]) / Throws ;
				System.out.println("Number of sum " + SumT[j][0] + ": " + SumT[j][1] + "; Percentage: " + percentage);
			}

		}

	}

}