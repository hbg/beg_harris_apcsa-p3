//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class GridRunner
{
	public static void main( String args[] ) throws IOException
	{
		Grid g = new Grid(20, 20, "abcdefghijklmnopqrstuvwxyz123456789".split(""));
		System.out.println(g);
		System.out.println(g.findMax("abcdefghijklmnopqrstuvwxyz123456789".split("")));
	}
}