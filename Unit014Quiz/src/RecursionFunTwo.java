//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class RecursionFunTwo
{
	public static int countChickens(String word)
	{
		return ((word.indexOf("chicken") == -1) ? 0 : 1 + countChickens(word.substring(0, word.indexOf("chicken")) + word.substring(word.indexOf("chicken") + 7)));
	}
}