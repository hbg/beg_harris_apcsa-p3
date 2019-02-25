//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class MultTens
{
	public static String go(  int x )
	{
		if (x<=0) return "aplus";
		String s = "";
		for (int i = 1; i<=x; i++) {
			s+=i*10;
		}
		return s;
	}
}