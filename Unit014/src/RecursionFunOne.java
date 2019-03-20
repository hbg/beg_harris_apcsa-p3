//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		if (num == 0)
			return 0;
		return (num % 2) + countOddDigits(num/10);
	}
}