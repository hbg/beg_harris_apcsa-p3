//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*;

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i<amount; i++) {
			for (int x = 0; x<amount-i; x++) {
				for (int y = amount-x-1; y>=0; y--) {
					output+=(char) (letter+(x));
				}
				output+=" ";
				
			}
			output+="\n";
			
		}
		return output;
	}
}