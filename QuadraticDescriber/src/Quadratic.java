/* calculates description of graph
 * @author Annabel Sun
 * @version October 13 2018
 */

public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {
		/*Description of the graph of: 
		 *y = [a] x^2 + [b] x + [c]

		 *Opens: Up
		 *Axis of Symmetry: 0.0
		 *Vertex: (0.0, 0.0)
		 *x-intercept(s): 0.0
		 *y-intercept: 0.0
		 */
		
		String intro = "Description of the graph of:";
		String graphDesc = "y = " + a + " x^2 + " + b + " x + " + c;

		String opens;
		if (a <= 0) {
			opens = "Opens: Down";
		} else {
			opens = "Opens: Up";
		}
		
		double vertexX = (-1 * b) / (2 * a);
		if (vertexX == 0) {
			vertexX = 0;
		}
		String symmetry = "Axis of Symmetry: " + vertexX;
		
		double vertexY = (a * vertexX * vertexX) + (b * vertexX) + c;
		String vertex = "Vertex: (" + vertexX + ", " + vertexY + ")";

		
		String xintercept = "x-intercept(s): " + quadForm(a, b, c);
		
		String yintercept = "y-intercept: " + c;
		
		return(intro + "\n" + graphDesc + "\n \n" + opens + "\n" + symmetry + "\n" + vertex + "\n" + xintercept + "\n" + yintercept + "\n \n");
		
		
	}
	//copy-paste methods from Calculate into Quadratic

	//returns the absolute value of a double
	public static double absValue (double number) {
		if (number < 0) {
			return number * -1;
		} else {
			return number;
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
	
	//finds the discriminant (in the quadratic equation) for inputting a, b, and c
	public static double discriminant (double a, double b, double c) {
		return (b*b) - (4*a*c);
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
	public static String quadForm(double a, double b, double c) {
		double discrim = discriminant(a, b, c); 
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
			return (xplus + " and " + xminus);
		}
	}
	
}
