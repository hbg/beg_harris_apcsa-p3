//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class NumberSearch
{
	public static int getNextLargest(int[] numArray, int searchNum)
	{
		int index = -1;
		for (int i = 0; i<numArray.length; i++)
			if (numArray[i] == searchNum && index == -1)
				index = i;
			else if (index != -1 && numArray[i] > searchNum)
				return numArray[i];
		return -1;
	}
}