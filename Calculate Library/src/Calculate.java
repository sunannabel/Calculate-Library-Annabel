/* contains various methods to do math calculations
 * @author Annabel Sun
 * @version September 16 2018
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
	
	public static boolean isDivisibleBy (int num1, int num2) {
		if (num1 > num2) {
			if (num1 % num2 == 0) {
				return true;
			} else {
				return false;
			} 
		} else if (num2 > num1) {
			if (num2 % num1 == 0) {
				return true;
			} else {
				return false;
			}
		} else {
			return true;
		}
	}
	
	public static double absValue (double number) {
		if (number < 0) {
			return number * -1;
		} else {
			return number;
		}
	}
	
	public static double max (double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double max (double num1, double num2, double num3) {
		double x = max(num1, max(num2, num3));
		return x;
	}
	
	public static int min (int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	public static double round2(double number) {
		double a = number * 1000; // example: 1.235 -> 1235
		double b = a % 10; //5
		if (b >= 5) { //true
			int c = (int) (a+5)/10; //124
			return c/100.0; //1.24
		} else {
			int d = (int) a/10;
			return d/100.0;
		}
	}
	
	public static double exponent(double num1, int num2) {
		double num3 = 1.0;
		for (int i = 1; i <=num2; i++) {
			num3 = num3*num1;
		}
		return num3;
	}
	
	public static int factorial(int number) {
		int num2 = 1;
		for (int i = number; i >= 2; i--) {
			num2 = num2*i;
		}
		return num2;
	}
	
	public static boolean isPrime(int number) {
		for (int i = 2; i < number/2; i++) {
			if(isDivisibleBy(number, i)) {
				return false;
			}
		}
		return true;
	}
	
	public static int gcf(int num1, int num2) {
		int x = 1;
		for (int i = 1; i < num1; i++) {
			if (isDivisibleBy(num1, i) && isDivisibleBy(num2, i) ) {
				x = i;
			}
		}
		return x;
	}
	
	public static double sqrt(double number) { 
		double guess = 0.1;
		while (absValue(number - guess*guess) > 0.005) { 
			guess = (number/guess + guess)/2; 
		}
		return round2(guess);
	}
	
}
