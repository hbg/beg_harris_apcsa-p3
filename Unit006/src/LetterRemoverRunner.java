//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		LetterRemover lr = new LetterRemover();
		lr.setRemover("ssssssssxssssesssssesss", 's');
		out.println(lr.toString());
		out.println(lr.removeLetters());
	}
}