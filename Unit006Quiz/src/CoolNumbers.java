//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class CoolNumbers 
{
	/*
	 *method isCoolNumber will return true if
	 *	num % 3-6 all have a remainder of 1
	 *it will return false otherwize
	 */
	public static boolean isCoolNumber( int num )
	{
		 for (int i=3;i<7;i++) {
			 if (!(num % i == 1)) return false;
		 }
		 return true;
	}
	
		/*
	 *method countCoolNumbers will return the count
	 *of the coolNumbers between 6 and stop
	 */
	public static int countCoolNumbers( int stop )
	{
		int counter = 0;
		for (int i = 6; i<stop+1; i++) {
			if (isCoolNumber(i)) counter++;
		}
		return counter;
	}
}