package lab1;

import cse131.ArgsProcessor;
import java.util.Random;

public class Nutrition {
	public static void main(String[] args) {
	ArgsProcessor ap = new ArgsProcessor(args);
	Random random = new Random();
	
	
	String name = ap.nextString("Name of the food");
	double carbs = ap.nextDouble("The grams of carbohydrates");
	double fat = ap.nextDouble("The grams of fat");
	double protein = ap.nextDouble("The grams of proteins");
	double calories = ap.nextDouble("The number of calories");
	
	double ccal = carbs*4.;
	double cfat = Math.round((fat*9)*10d)/10d;
	double cpro = protein*4.;
	
	double ecal = Math.round(((ccal+cfat+cpro) - calories) * 100.0) / 100.0;
	double fgram = ecal/4;
	
	double cper = Math.round((ccal/calories)*100 * 100.0) / 100.0;
	double fper = Math.round((cfat/calories)*100 * 100.0) / 100.0;
	double pper = Math.round((cpro/calories)*100 * 100.0) / 100.0;
	
	//double cper = (ccal/calories)*100;
	//double fper = (cfat/calories)*100;
	//double ppro = (cpro/calories)*100;
	
	boolean lc = cper<=25;
	boolean lf = fper<=15;
	
	int result = random.nextInt(2);
	boolean flip = (1==0);
	
	System.out.println(name + " has:");
	System.out.println("Grams of " + carbs + ", which equals " + ccal + " calories.");
	System.out.println("Grams of " + fat + ", which equals " + cfat + " calories.");
	System.out.println("Grams of " + protein + ", which equals " + cpro + " calories.");
	
	System.out.println("");
	System.out.println("This food is said to have (available) "+calories);
	System.out.println("With " +ecal+ " unavailable calories, this food has " + fgram + " grams of fiber");
	
	System.out.println("");
	System.out.println("Approximately:");
	System.out.println(cper + " percent of your food is Carbohydrates");
	System.out.println(fper + " percent of your food is Fat");
	System.out.println(pper + " percent of your food is Protein");
	
	System.out.println("");
	System.out.println("Is this food acceptable for a low-carb diet? " + lc);
	System.out.println("Is this food acceptable for a low-fat diet? " + lf);
	System.out.println("By coin flip, should you eat this food? " + flip);
	

			
	
	}
}
