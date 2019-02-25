//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover()
	{
		//call set
		setRemover("",'a');
	}
	public LetterRemover(String s, char c) {
		setRemover(s, c);
	}
	//add in second constructor
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		int l = cleaned.indexOf(lookFor);
		while (l != -1) {
			cleaned = cleaned.substring(0, l) + cleaned.substring(l+1, cleaned.length());
			l = cleaned.indexOf(lookFor);
		}
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}