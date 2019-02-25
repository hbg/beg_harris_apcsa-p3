//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		out.println(new Word("Hello").getFirstChar());
		out.println(new Word("Hello").getLastChar());
		out.print(new Word("Hello").getBackWards());
	}
}