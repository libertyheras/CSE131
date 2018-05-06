package studio1;

import org.hamcrest.core.Is;

import cse131.ArgsProcessor;

public class Grading {
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		
		Double d1 = ap.nextDouble("Enter Participation percent");
		Double d2 = ap.nextDouble("Enter Quizes precent");
		Double d3 = ap.nextDouble("Enter Studios percent");
		Double d4 = ap.nextDouble("Enter Labs percent");
		Double d5 = ap.nextDouble("Enter Extensions percent");
		Double d6 = ap.nextDouble("Enter Exam 1 percent");
		Double d7 = ap.nextDouble("Enter Exam 2 percent");
		Double d8 = ap.nextDouble("Enter Exam 3 percent");
		
		double total = ((d1*.1) + (d2*.02) + (d3*.08) +(d4*.25)+(d5*.25)+(d6*.1)+(d7*.1)+(d8*.1));
		int finalgrade = (int)total;
		
		int chk = finalgrade % 10;
		
		boolean minus = (chk >= 0) && (chk <= 3);
		boolean plus = (chk >= 7);
	
		System.out.println("The raw score is "+total);
		System.out.println("The grade for this score is " + finalgrade);
		System.out.println("Final grade has a plus " + plus);
		System.out.println("Final grade has a minus " + minus);
		
		
		
		
		
		
		
		
		
		
	}
}
