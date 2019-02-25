//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner; 
import static java.lang.System.*;
import static java.lang.Math.*;

public class DistanceRunner
{
	public static void main( String[] args )
	{
		//add test cases	
		Scanner sc = new Scanner(System.in);
		print("Enter X1: ");
		int x1 = sc.nextInt();
		print("Enter Y1: ");
		int y1 = sc.nextInt();
		print("Enter X2: ");
		int x2 = sc.nextInt();
		print("Enter Y2: ");
		int y2 = sc.nextInt();
		Distance d = new Distance(x1, y1, x2, y2);
		print(d.getDistance());
		
	}
	private static void print(Object o) {
		System.out.println(o);
	}
}