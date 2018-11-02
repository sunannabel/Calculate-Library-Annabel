import java.util.*;

/* describes a quadratic function using user input
 * @author Annabel Sun
 * @version October 13 2018
 */

public class QuadraticClient 
	{
	public static void main(String[] args) 
		{
		//handle interactions with the user (take input)
		//call quadrDescriber with the appropriate arguments
		
		boolean done = false;
		while (!done) {
			Scanner console = new Scanner(System.in);
		
			System.out.println("Welcome to the Quadratic Describer");
			System.out.println("Provide values for coefficients a, b, and c");
			System.out.println("");
		
			System.out.print("a: ");
			double a = console.nextDouble();
		
			System.out.print("b: ");
			double b = console.nextDouble();
		
			System.out.print("c: ");
			double c = console.nextDouble();
		
			System.out.println("");
			System.out.println(Quadratic.quadrDescriber(a, b, c));
		
			System.out.println("Do you want to keep going? (Type \"quit\" to end)"); 
			
			String quit = console.next();
			if (quit.equals("quit")) 
			{
				done = true;
			}
		}
	}
}
