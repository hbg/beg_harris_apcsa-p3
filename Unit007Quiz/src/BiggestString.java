//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

public class BiggestString
{
	private String one,two, three;

	public BiggestString()
	{
		setStrings("","","");
	}

	public BiggestString(String a, String b, String c)
	{
			setStrings(a, b, c);
	}

	public void setStrings(String a, String b, String c)
	{
		one = a;
		two = b;
		three = c;
	}

	public String getBiggest()
	{
		int big = Math.max(one.length(), Math.max(two.length() ,three.length()));
		if (one.length() == big) return one;
		else if (two.length() == big) return two;
		return three;
	}

	public String toString()
	{
	   return getBiggest() + " is the biggest String.";
	}
}