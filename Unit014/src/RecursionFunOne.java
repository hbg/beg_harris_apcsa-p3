//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunOne
{
	public static int countOddDigits(int num)
	{
		return (num == 0 ? 0 : (num % 2) + countOddDigits(num/10));
	}
}