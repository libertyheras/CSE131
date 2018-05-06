package lab2;

import cse131.ArgsProcessor;

public class Nim {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int input;
		int Stick = (int) (Math.random() * 10 + 5);
		int cpuAnswer = 0;
		int i = 0;

		System.out.println("There Are " + Stick + " Sticks, You Can Only Remove Up To 2 Sticks At A Time");
		System.out.println("Your Goal Is To Remove The Last Stick, Stick 1");
		System.out.println("To Remove A Stick Either Enter 1 or 2");
		System.out.println("");

		while (true) {

			if (Stick == 1) {
				System.out.println("Round: " + i);
				System.out.println("There Is " + Stick + " Stick Currently");

			} else {
				System.out.println("Round: " + i);
				System.out.println("There Are " + Stick + " Sticks Currently");
			}

			input = ap.nextInt("Number of sticks to pick");

			if (input > 2 || input < 1 || input > Stick) {
				System.out.println("You Cannot remove this number of Sticks");
			} else {

				Stick = Stick - input;

				if (Stick == 0) {
					i++;
					System.out.println("Round: " + i);
					System.out.println("There Are No Sticks Remaining, you have Won!!");
					return;
				}

				if (Stick == 1) {
					cpuAnswer = 1;
					i++;
					System.out.println("Round: " + i);
					System.out.println("The Computer Has Removed " + cpuAnswer + " Stick");

				} else if (Stick == 2) {
					cpuAnswer = 2;
					i++;
					System.out.println("Round: " + i);
					System.out.println("The Computer Has Removed " + cpuAnswer + " Stick");
				} else {
					cpuAnswer = (int) (Math.random() * 2 + 1);
					i++;
					System.out.println("Round: " + i);
					System.out.println("The Computer Has Removed " + cpuAnswer + " Stick");
				}

				if (Stick - cpuAnswer == 0) {
					i++;
					System.out.println("Round: " + i);
					System.out.println("There Are No Sticks Remaining, The Computer Has Won!!");

					return;
				}
				if (Stick - input == 0) {
					i++;
					System.out.println("Round: " + i);
					System.out.println("There Are No Sticks Remaining, You Have Won!!");

					return;
				}
				Stick = Stick - cpuAnswer;
				i++;
			}
		}
	}
}
