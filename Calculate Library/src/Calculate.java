/* contains various methods to do math calculations
 * @author Annabel Sun
 * @version September 12 2018
 */
public class Calculate {
	public static int square (int number) {
		return number*number; //returns the square of an int
	}
	
	public static int cube (int number) {
		return number*number*number; //returns the cube of an int
	}
	
	public static double average (double num1, double num2) {
		return (num1+num2)/2;
	}
	
	public static double average (double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	
	public static double toDegrees (double number) {
		return (number*180)/3.14159;
	}
	
	public static double toRadians (double number) {
		return (number*3.14159)/180;
	}
	
	public static double discriminant (double a, double b, double c) {
		return (b*b) - (4*a*c);
	}
	
	public static String toImproperFrac (int whole, int numerator, int denominator) {
		int x = whole*denominator + numerator;
		return (x+"/"+denominator);
	}
	
	public static String toMixedNum (int numerator, int denominator) {
		int x = numerator/denominator;
		int y = numerator%denominator;
		return (x+"_"+y+"/"+denominator);
	}
	
	public static String foil (int a, int b, int c, int d, String var) {
		int x = a*c; //ax^2
		int y = a*d + b*c; //bx
		int z = b*d; //c
		return (x + var + "^2 + " + y + var + " + " + z);
	}
	
}
