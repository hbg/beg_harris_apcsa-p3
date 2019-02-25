//(c) A+ Computer Science
// www.apluscompsci.com
//Name -  

import static java.lang.System.*;

import java.util.ArrayList;

public class Triples
{
   private int number;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		setNum(num);

	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int gcf = 0;
		for (int i = 1; i<=a; i++) {
			if (a % i == 0 && b % i == 0 && c % i == 0) {
				gcf = i;
			}
		}
		return gcf;
	}
	
	

	public String toString()
	{
		String output="";
		ArrayList<Integer> cs = new ArrayList<Integer>();
		for (int a = 1; a<number; a++) {
			for (int b = 1; b<=number; b++) {
				for (int c = 1; c<=number; c++) {
					if (Math.pow(c, 2) == Math.pow(b,2) + Math.pow(a, 2)) {
						if (!cs.contains(c) && (a%2 == 0 && b%2==1 && c%2==1 && greatestCommonFactor(a,b,c) == 1) || (a%2 == 1 && b%2==0 && c%2==1 && greatestCommonFactor(a,b,c) == 1)) {
							output+= String.format("%s, %s, %s \n", a,b,c);
							cs.add(c);
						}
					}
				}
			}
		}
		return output+"\n";
	}
}