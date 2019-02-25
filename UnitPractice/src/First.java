//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class First
{
   public  String go( String a )
	{
	   for (int i = 1; i<a.length(); i++)
		   if (a.charAt(i) == a.charAt(0)) return "yes";
	   return "no";
	}
}



/*

EXPECTED RUNNER OUTPUT
 
no
yes
no
no
yes
no
yes
yes
no
no


*/