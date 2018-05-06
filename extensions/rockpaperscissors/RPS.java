package rockpaperscissors;

import cse131.ArgsProcessor;

public class RPS {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int user = 5;
		int computer = 5;
		boolean chk = true;
		int wins = 0;
		int draw=0;

		int rounds = ap.nextInt("How many rounds do you want to play?");
		for (int i = 0; i < rounds; i++) {

			while (chk == true) {
				user = ap.nextInt("scissor (0), rock (1), paper (2): ");
				if (user != 0 || user != 1 || user != 2) {
					chk = false;
				}
			}
			chk = true;
					
			computer = (int) (Math.random() * 3);
					
			System.out.print("The computer is ");
			switch (computer) {
			case 0:
				System.out.print("scissor.");
				break;
			case 1:
				System.out.print("rock.");
				break;
			case 2:
				System.out.print("paper.");
			}

			System.out.print(" You are ");
			switch (user) {
			case 0:
				System.out.print("scissor");
				break;
			case 1:
				System.out.print("rock");
				break;
			case 2:
				System.out.print("paper");
			}

			// Display result
			if (computer == user) {
				System.out.println(" too. It is a draw");
			draw++;
			}else {
				boolean win = (user == 0 && computer == 2) || (user == 1 && computer == 0)
						|| (user == 2 && computer == 1);
				if (win) {
					System.out.println(", You won");
				 wins++;
				}else
					System.out.println(", You lose");
			}

		}
		
		System.out.println("Out of "+rounds+" rounds you won "+wins+" games.");
		System.out.println("Out of "+rounds+" rounds the computer won "+(rounds - draw- wins)+" games.");

	}

}
