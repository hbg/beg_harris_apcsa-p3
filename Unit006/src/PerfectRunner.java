//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import static java.lang.System.*; 

public class PerfectRunner
{
	public static void main( String args[] )
	{
		//add test cases
		Perfect p = new Perfect();
		p.setNumber(496);
		out.println(p.toString());
		p.setNumber(45);
		out.println(p.toString());
		p.setNumber(6);
		out.println(p.toString());
	}
}