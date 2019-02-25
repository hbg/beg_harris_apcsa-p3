//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class VowelCounter
{
	public static String getNumberString( String s)
	{
		String newString = "";
		int j = 0;
		for (int i = 0; i<s.length(); i++) {
			boolean vowel = false;
			for (char c2 : "AEIOUaeiou".toCharArray()) {
				if (s.charAt(i) == c2) {vowel = true;}
			}
			if (vowel) {
				if (j > 9) j = 0;
				newString+= j;
				j+=1;
			}
			else {
				newString+=s.charAt(i);
			}
		}
		return newString;
	}
}


