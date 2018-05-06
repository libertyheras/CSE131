package arrays;

import cse131.ArgsProcessor;

public class Birthday {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);

		double num = ap.nextDouble("How many people are there?");
		int count = 0;
		double bdaymon = 0;
		double fraction = 0;
		double bdayday = 0;
		double common =0;

		int[][] cal = new int[12][31];

		for (int i = 0; i < 12; i++) {
			for (int j = 0; j < 31; j++) {
				cal[i][j] = 0;
			}
		}

		for (int i = 0; i < num; i++) {

			int month = (int) (Math.random() * 12);
			int day = (int) (Math.random() * 31);
			cal[month][day] = cal[month][day] + 1;
		}

		for (int i = 0; i < 12; i++) {
			double month = 0;
			for (int j = 0; j < 31; j++) {
				month = month + cal[i][j];
			}
			bdaymon = (double) Math.round(month / num * 100.) / 1.;
			fraction = bdaymon + fraction;
			System.out.println(i + 1 + ": " + bdaymon + "%  " + "people have a birthday on this month");

		}

		fraction = (double) Math.round((double) (fraction / 12) * 100.) / 100.;

		System.out.println("The average of birthdays for each month is " + fraction + "%");
		System.out.println();

		fraction = 0;

		for (int i = 0; i < 31; i++) {
			double day = 0;

			for (int j = 0; j < 12; j++) {
				day = day + cal[j][i];
			}

			bdayday = (double) Math.round(day / num * 100.) / 1.;

			fraction = fraction + bdayday;

			System.out.println(i + 1 + ": " + bdayday + "% " + "of people have birthdays on this day");
		}
		
		fraction = (double) Math.round((double) (fraction / 31) * 100.) / 100.;
		
		System.out.println("The average birthdays on each day is " + fraction + "%");
		System.out.println();

		
		
		for (int j = 0; j < 12; j++) {
			for (int k = 0; k < 31; ++k) {
				if (cal[j][k] > 1) {
					count = count + cal[j][k];
					//System.out.println("same " + cal[j][k]);
				}
				//System.out.println(cal[j][k]);
			}
		}

		common = count / num * 100;

		common = Math.round(common * 10.0) / 10.0;
		System.out.println(common + "% of people have a common birthday.");

	}

}
