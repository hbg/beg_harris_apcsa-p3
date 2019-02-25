//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date - 
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class StringRunner
{
	public static void main ( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		StringOddOrEven s = new StringOddOrEven(str);
		out.print(s);
		
	}
}