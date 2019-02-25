//(c) A+ Computer Science
//www.apluscompsci.com

//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringFirstLetterCheck
{
	String wordOne, wordTwo;

	public StringFirstLetterCheck()
	{
		setWords("a","b");
	}

	public StringFirstLetterCheck(String one, String two)
	{
		setWords(one, two);
	}

	public void setWords(String one, String two)
	{
		wordOne = one;
		wordTwo = two;
	}

	public boolean checkFirstLetter( )
	{
		return (wordOne.charAt(0) == wordTwo.charAt(0));
	}

	public String toString()
	{
	   return (checkFirstLetter() ? wordOne + " has the same first letter as " + wordTwo + "\n" : wordOne + " does not have the same first letter as " + wordTwo + "\n");
	}
}