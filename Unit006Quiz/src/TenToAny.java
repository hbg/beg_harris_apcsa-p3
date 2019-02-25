//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TenToAny
{
   private int base10;
   private int newBase;

	//add constructors
   public TenToAny(int base10, int newBase) {
	   setNums(base10, newBase);
   }
	//add a set method
   public void setNums(int base10, int newBase) {
	   this.base10 = base10;
	   this.newBase = newBase;
   }

	public String getNewNum()
	{
		String newnum = "";
		while (base10 > 0) {
			 newnum = (base10 % newBase) + newnum;
			 base10 = (base10)/ newBase;
		}
		return newnum;
	}

	//add a toString method	
	public String toString()
	{
		return base10 + " in base 10 is " + getNewNum() + " in base " + newBase;
	}
	
}