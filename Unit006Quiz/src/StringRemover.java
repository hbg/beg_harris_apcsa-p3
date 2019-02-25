//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

class StringRemover
{
   private String sentence;
   private String remove;

	//add in constructors
	
   public StringRemover(String s, String rem) {
	   setRemover(s,rem);
   }
	public void setRemover(String s, String rem)
	{
		sentence = s;
		remove = rem;
	}

	public String removeStrings()
	{
		String cleaned = sentence;
		int loc = cleaned.indexOf(remove);
		while (loc != -1) {
			cleaned = cleaned.substring(0, loc-1) + cleaned.substring(loc + remove.length());
			loc = cleaned.indexOf(remove);
		}
		return cleaned;
	}

	public String toString()
	{
		return removeStrings();
	}
}