/* client code to call various methods in the Calculate library
 * @author Annabel Sun
 * @version October 2, 2018
 */


public class DoMath {
	public static void main(String[] args) {
		System.out.println("square: " + Calculate.square(-3)); 	
		System.out.println("cube: " + Calculate.cube(-3));
		System.out.println("average (2): " + Calculate.average(2.0, 4.0));
		System.out.println("average (3) : "+ Calculate.average(1.0, 3.0, 5.0));
		System.out.println("toDegrees: " + Calculate.toDegrees(2.0));
		System.out.println("toRadians: " + Calculate.toRadians(180));
		System.out.println("discriminant: " + Calculate.discriminant(4.0, 12.0, 9.0));
		System.out.println("toImproperFrac: " + Calculate.toImproperFrac(4, 1, 2));
		System.out.println("toMixedNum: " + Calculate.toMixedNum(7, 2));
		System.out.println("foil: " + Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println("isDivisibleBy: " + Calculate.isDivisibleBy(-5, 10));
		System.out.println("absValue: " + Calculate.absValue(-9.0));
		System.out.println("max(2): " + Calculate.max(3.0, 2.0));
		System.out.println("max(3): " + Calculate.max(7.0, 6.0, 8.0)); //num2;  6.0
		System.out.println("min: " + Calculate.min(1, 2)); //return 1
		System.out.println("round2: " + Calculate.round2(1.235));
		System.out.println("exponent: " + Calculate.exponent(2.0, 4));
		System.out.println("factorial: " + Calculate.factorial(4));
		System.out.println("isPrime: " + Calculate.isPrime(223));
		System.out.println("gcf: " + Calculate.gcf(-4,6));
		System.out.println("sqrt: " + Calculate.sqrt(1.5625));
		System.out.println("quadform: " + Calculate.quadForm(4, 12, 9));
	}
}
	