//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class FirstLastVowel
{
   public static String go( String a )
	{
	   	String vowels = "aeiouAEIOU";
		for (char c : vowels.toCharArray()) {
			if (a.charAt(0) == c) {
				return "yes";
			}
			if (a.charAt(a.length()-1) == c) {
				return "yes";
			}
		}
	   	return "no";
	}
}