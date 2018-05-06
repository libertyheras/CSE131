package studio1;

import cse131.ArgsProcessor;

public class Grading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArgsProcessor ap = new ArgsProcessor(args);
		
		String name = ap.nextString("What is your name?");
		int participationPoints = ap.nextInt("Number of Participation Points?");
		double averageQuiz = ap.nextDouble("Average Quiz Score?");
		int studioPoints = ap.nextInt("Number of Studio Points?");
		int labPoints = ap.nextInt("Number of Lab Points?");
		int extensionPoints = ap.nextInt("Number of Extension Points?");
		int examOne = ap.nextInt("Exam One Score?");
		int examTwo = ap.nextInt("Exam Two Score?");
		int examThree = ap.nextInt("Exam Three Score?");
		
		double totalScore = .1 * participationPoints + .02 * averageQuiz + .08 * studioPoints + .25 * labPoints + .25 * extensionPoints + .1 * examOne + .1 * examTwo + .1 * examThree;
		int finalGrade = (int) totalScore;
		
		boolean minus = (finalGrade % 10 >=0) && (finalGrade % 10 < 3) && (finalGrade/10 < 10);
		boolean plus = (finalGrade % 10 >=7) || finalGrade/10 >= 10;
		
		System.out.println(name + "\n \t Total Score: " + totalScore);
		System.out.println("\t Grade for this Course: " + finalGrade);
		System.out.println("\t Final Grade has a ..." );
		System.out.println("\t \t Plus: " + plus);
		System.out.println("\t \t Minus: " + minus);
		
		
		
		
	}

}
