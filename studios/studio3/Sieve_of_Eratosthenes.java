package studio3;

import cse131.ArgsProcessor;

public class Sieve_of_Eratosthenes {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		int n = ap.nextInt("Max value for table?");
		String c = ap.nextString("What method would you like? Type I for integer, and B for Boolean");
		while (true) {
			if (c.equals("I")) {

				int[] table = new int[n + 1];
				System.out.println("Using the Integer Array Method:");
				System.out.println("Initial Values");
				for (int i = 2; i <= n; i++) {
					table[i] = i;
					System.out.print(table[i] + " ");
				}

				for (int f = 2; f * f <= n; f++) {
					if (table[f] != 0) {
						for (int j = f; f * j <= n; j++) {
							table[f * j] = 0;
						}
					}
				}
				System.out.println();
				System.out.println("Primes under " +n+":");
				for (int i = 2; i <= n; i++) {
					if (table[i] != 0) {
						System.out.print(table[i] + " ");
					}
				}
				return;
			}

			else if (c.equals("B")) {
				System.out.println("Using the Boolean Array Method:");
				boolean[] prime = new boolean[n + 1];
				for (int i = 2; i <= n; i++) {
					prime[i] = true;
				}

				for (int f = 2; f * f <= n; f++) {
					if (prime[f]) {
						for (int j = f; f * j <= n; j++) {
							prime[f * j] = false;
						}
					}
				}

				System.out.println();
				System.out.println("Primes under " +n+":");
				for (int i = 2; i <= n; i++) {
					if (prime[i]) {
						System.out.print(i + " ");

					}
				}
				return;
			} 
			
			else {
				c = ap.nextString("That choice was not valid. What method would you like? Type I for integer, and B for Boolean");
			}
		}
	}
}
