//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}
	public int compareTo( Word rhs )
	{		
		return word.length() > rhs.word.length() ? word.compareTo(rhs.word) : -1;
	}
	public int getSize() {
		return word.length();
	}
	public String toString()
	{
		return word;
	}
}