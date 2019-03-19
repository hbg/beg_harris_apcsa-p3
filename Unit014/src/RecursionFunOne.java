//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		int count = 0;
		while (num > 0) {
			if ((num % 10) % 2 == 0) count++;
			num /= 10;
		}
		return count;
	}
}