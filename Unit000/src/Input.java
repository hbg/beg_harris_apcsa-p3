//(c) A+ Computer Science
//www.apluscompsci.com
//Name - Harris Beg
//Date - 1/31
//Class - AP CSA
//Lab  - Input
import static java.lang.System.*;
import java.util.Scanner;

public class Input
{
	public static void main (String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int intOne, intTwo;
		double doubleOne, doubleTwo;
		float floatOne, floatTwo;
		short shortOne, shortTwo;


		System.out.print("Enter an integer :: ");
		intOne = keyboard.nextInt();


		System.out.print("Enter an integer :: ");
		intTwo = keyboard.nextInt();
		System.out.print("Emter a double:: ");
		doubleOne = keyboard.nextDouble();

		System.out.print("Emter a double:: ");
		doubleTwo = keyboard.nextDouble();

		System.out.print("Emter a float:: ");
		floatOne = keyboard.nextFloat();
		System.out.print("Emter a float:: ");
		floatTwo = keyboard.nextFloat();
		System.out.print("Emter a short:: ");
		shortOne = keyboard.nextShort();
		System.out.print("Emter a short:: ");
		shortTwo = keyboard.nextShort();
		//add in input for all variables


		System.out.println();
		System.out.println("integer one = " + intOne );
		System.out.println("integer two = " + intTwo );

		//add in output for all variables


	}
}