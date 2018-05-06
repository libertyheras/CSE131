package homeowning;

import cse131.ArgsProcessor;

public class HomeOwning {

	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		String name = ap.nextString("What is the name of the property?");
		String zip = ap.nextString("What is the zip code of the property?");
		double rent = ap.nextInt("What is the monthly rent of the property?");
		double interest = ap.nextDouble("Daily interest or the property");

		System.out.println(name + " is located in the zip code " + zip);
		System.out.println("Rent per year is " + ((double)Math.round((rent*12) * 100d) / 100d));
		System.out.println("Rent per week is " + ((double)Math.round((rent/4.334) * 100d) / 100d));
		System.out.println();
		System.out.println("Interest paid per year is " + ((double)Math.round((interest*365) * 100d) / 100d));
		System.out.println("Interest paid per week is " + ((double)Math.round((interest*7) * 100d) / 100d));

		if ((interest * 7 * 4 * 12) > (rent * 12)) {
			System.out.println("I should rent");
		} else {
			System.out.println("I should Buy");
		}

	}

}
