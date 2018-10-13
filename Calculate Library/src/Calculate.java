/* contains various methods to do math calculations
 * @author Annabel Sun
 * @version October 2 2018
 */

public class Calculate {
	//returns the square of an int
	public static int square (int number) {
		return number*number; 
	}
	
	//returns the cube of an int
	public static int cube (int number) {
		return number*number*number; 
	}
	
	//returns the average of two doubles
	public static double average (double num1, double num2) {
		return (num1+num2)/2;
	}
	
	//overloads average; returns the average of three doubles
	public static double average (double num1, double num2, double num3) {
		return (num1+num2+num3)/3;
	}
	
	//converts a double from radians to degrees
	public static double toDegrees (double number) {
		return (number*180)/3.14159;
	}
	
	//converts a double from degrees to radians
	public static double toRadians (double number) {
		return (number*3.14159)/180;
	}
	
	//finds the discriminant (in the quadratic equation) for inputting a, b, and c
	public static double discriminant (double a, double b, double c) {
		return (b*b) - (4*a*c);
	}
	
	//changes a mixed number to an improper fraction
	public static String toImproperFrac (int whole, int numerator, int denominator) {
		int x = whole*denominator + numerator;
		return (x+"/"+denominator);
	}
	
	//changes an improper fraction to a mixed number
	public static String toMixedNum (int numerator, int denominator) {
		int x = numerator/denominator;
		int y = numerator%denominator;
		return (x+"_"+y+"/"+denominator);
	}
	
	//multiplies using FOIL 
	public static String foil (int a, int b, int c, int d, String var) {
		int x = a*c; //ax^2
		int y = a*d + b*c; //bx
		int z = b*d; //c
		return (x + var + "^2 + " + y + var + " + " + z);
	}
	
	//checks for divisibility of two ints
	public static boolean isDivisibleBy (int num1, int num2) {
		if (num1 == 0 || num2 == 0) {
			throw new IllegalArgumentException("can't divide by 0!");
		}
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
		} else { //if both numbers are the same
			return true;
		}
	}
	
	//returns the absolute value of a double
	public static double absValue (double number) {
		if (number < 0) {
			return number * -1;
		} else {
			return number;
		}
	}
	
	//returns the larger of two doubles
	public static double max (double num1, double num2) {
		if (num1 > num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//returns the largest of three doubles; overloads max
	public static double max (double num1, double num2, double num3) {
		return  max(num1, max(num2, num3));
	}
	
	//returns the smallest of two numbers
	public static int min (int num1, int num2) {
		if (num1 < num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//rounds a double to the hundredths place
	//extra note: breaks with 1.005 because of java being weird
	public static double round2(double number) {
		double a = number * 1000; //convert to whole number so we can %
		double b = a % 10; 
		if (b >= 5) { 
			int c = (int) (a+5)/10; 
			return c/100.0; 
		} else {
			int d = (int) a/10;
			return d/100.0;
		}
	}
	
	//raises num1 to the num2th power
	public static double exponent(double num1, int num2) {
		if (num2 < 0) {
			throw new IllegalArgumentException("exponent can't be negative!");
		}
		double num3 = 1.0;
		for (int i = 1; i <=num2; i++) {
			num3 = num3*num1;
		}
		return num3;
	}
	
	//returns the factorial of an int
	public static int factorial(int number) {
		if (number < 0) {
			throw new IllegalArgumentException("factorial can't be negative!");
		}
		int num2 = 1;
		for (int i = number; i >= 2; i--) {
			num2 = num2*i;
		}
		return num2;
	}
	
	//checks if an int is a prime number
	public static boolean isPrime(int number) {
		for (int i = 2; i < number/2; i++) {
			if(isDivisibleBy(number, i)) {
				return false;
			}
		}
		return true;
	}
	
	//returns the greatest common factor of two ints
	public static int gcf(int num1, int num2) {
		int guess = 1;
		for (int i = 1; i <= num1; i++) {
			if (isDivisibleBy(num1, i) && isDivisibleBy(num2, i) ) {
				guess = i;
			}
		}
		return guess;
	}
	
	//returns the square root of a number
	public static double sqrt(double number) { 
		if (number < 0) {
			throw new IllegalArgumentException("can't sqrt a negative number!");
		}
		double guess = 0.1;
		while (absValue(number - guess*guess) > 0.005) { 
			guess = (number/guess + guess)/2; 
		}
		return round2(guess);
	}
	
	//finds the x intercepts using quadratic formula
	public static String quadForm(int a, int b, int c) {
		double discrim = discriminant((double) a, (double) b, (double) c); 
		if (discrim < 0) {
			return ("no real roots");
		} else if (discrim == 0) {
			double x = (-1.0*b) / (2.0*a);
			if (x == 0) {
				x = 0;
			}
			return (x+"");
		} else {
			double xplus = ((-1*b) + sqrt(discrim))/(2*a);
			double xminus = ((-1*b) - sqrt(discrim))/(2*a);
			return (xminus + " and " + xplus);
		}
	}
	
}
