//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -


public class MoreAplus
{
   public static String go( String a )
	{
	   int loc = a.indexOf("aplus");
	   int count = 0;
	   while (loc != -1) {
		   a = a.substring(loc+1);
		   count++;
		   loc = a.indexOf("aplus");
	   }
	   return (count > 1 ? "yes" : "no");
	}
}
