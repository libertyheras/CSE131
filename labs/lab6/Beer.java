package lab6;
import cse131.*;

public class Beer {
	
	public static void main(String[] args) {
		ArgsProcessor ap = new ArgsProcessor(args);
		int N =0;
		N = ap.nextInt("How many bottles?");
		System.out.println(bottlesOfBeer(N));
	}

	public static String bottlesOfBeer(int N) {
		String s = "";
		if (N ==0)
			return "";
		else {
			s = N + " bottles of beer on the wall, " + N +" bottles of beer; you take one down, pass it around, " + (N-1) + "bottles of beer on the wall.";
		}
		
		return s;
	}
	
	
	
	
}
