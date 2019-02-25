//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class Social
{
   public static String go( String a )
	{
	   if (a.charAt(3) == '-' && a.charAt(6) == '-') return a.substring(7, a.length());
	   return "bad";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
good
bad
good
bad
good
good
bad
bad




*/