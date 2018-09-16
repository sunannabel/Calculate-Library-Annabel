/* client code to call various methods in the Calculate library
 * @author Annabel Sun
 * @version September 12, 2018
 */


public class DoMath {
	public static void main(String[] args) {
		System.out.println(Calculate.square(-3)); 	
		System.out.println(Calculate.cube(-3));
		System.out.println(Calculate.average(2.0, 4.0));
		System.out.println(Calculate.average(1.0, 3.0, 5.0));
		System.out.println(Calculate.toDegrees(2.0));
		System.out.println(Calculate.toRadians(180));
		System.out.println(Calculate.discriminant(2.0, 3.0, 4.0));
		System.out.println(Calculate.toImproperFrac(4, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(5, 10));
		System.out.println(Calculate.absValue(-9.0));
		System.out.println(Calculate.max(3.0, 2.0));
		System.out.println(Calculate.max(7.0, 9.0, 8.0)); //num2;  9.0
		System.out.println(Calculate.min(1, 2)); //return 1
		System.out.println(Calculate.round2(1.235));
		System.out.println(Calculate.exponent(2.0, 4));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(223));
		System.out.println(Calculate.gcf(18,24));
		System.out.println(Calculate.sqrt(1.5625));
	}
}
	