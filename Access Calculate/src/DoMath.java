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
	}
}
	