//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import java.io.File;
import java.io.IOException;
import static java.lang.System.*;

public class FancyWordsRunner
{
	public static void main( String args[] ) throws IOException
	{
		Scanner f = new Scanner(new File("C:\\Users\\legos\\Desktop\\Work\\workspace\\Unit013Quiz\\src\\fancywords2.dat"));
		int size = f.nextInt();
		String[] words = new String[size];
		for (int i = 0; i<size; i++)
			words[i] = f.next();
		System.out.println(new FancyWords(f.next()));
	}
}