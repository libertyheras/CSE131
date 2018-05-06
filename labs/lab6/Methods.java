package lab6;

public class Methods {
	public static void main(String[] args) {
		System.out.println(function(2));
		//
		// from here, call f or g with the appropriate parameters
		//

		System.out.println(function(10));
	}
	
//	public static int function(int x) {
//		if (x>100)
//			return (x-10);
//		else {
//			return function(function(x+11));
//			}
//	}
	
	public static int function(int x) {
		if (x<=0)
			return (1);
		else {
			return (3*function(x-1)+4);
			}
	}
	
	
	

}
