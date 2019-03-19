//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberShifterRunner
{
	public static void main( String args[] ) throws IOException
	{
		//add test cases
		NumberShifter n = new NumberShifter();
		int[] i = n.makeLucky7Array(10);
		System.out.println(Arrays.toString(i));
		System.out.println(Arrays.toString(n.shiftEm(i)));

	}
}



