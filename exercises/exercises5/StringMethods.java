package exercises5;

public class StringMethods {

	//
	// Below are the methods defined for this exercise
	// The names are not prescribed in the assignment, so choose
	// names you like (that are meaningful)
	//

	//
	// First one is completed for you:
	//

	public static String selfConcat(String in) {
		//return s + s;
		return copies(in,2);
	}

	public static String copies(String in, int n) {
		String ans = "";
		for (int i = 0; i < n; i++) {
			ans = ans + in;
		}
		return ans;
		
//		String [] array = new String[n];
//		for (int i=1; i<array.length; i++) {
//			array[i] = in;
//		}
//		return join(array,"");
	}
	
	public static String join(String[] array, String joiner ) {
		if (array.length == 0) {
			return "";
		}
		
		String ans = array[0];
		for (int i=1; i<array.length; i++) {
			ans = ans + joiner + array[i];
		}
		return ans;
	}

	public static void main(String[] args) {

		//
		// Testing the methods
		//
		System.out.println(selfConcat("echo"));
		System.out.println(copies("test", 3));
		
		String s = "Oh god, why me";
		String words[] = s.split(" ");
		for (int i =0;i<words.length;i++) {
			System.out.println("Word: "+words[i]);
		}
		
	}

}
