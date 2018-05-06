package bankinterest;

public class interest {

	public static void main(String[] args) {
		System.out.println("day		type		amount		balance");
		double money = 4000;
		String dw;

		double change;
		double interest = 0;
		for (int i = 1; i <= 30; ++i) {
			if (Math.random() < 0.5) {
				change = 200.50;
				money = money + change;
				dw = "deposit";
			} else {
				change = 100.00;
				money = money - change;
				dw = "withdraw";
			}
			System.out.println(i + "		" + dw + "		$" + change + "		$" + money);

		}

		interest = 2 * money;
		interest = (double) Math.round(interest * 10) / 1000;

		System.out.println("interest for month = " + interest);
		money = interest + money;
		System.out.println("money at end of month = " + money);
	}
}
