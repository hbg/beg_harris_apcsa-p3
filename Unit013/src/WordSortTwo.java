//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import static java.lang.System.*;

public class WordSortTwo
{
	private String[] wordRay;

	public WordSortTwo(String sentence)
	{
		wordRay = sentence.split(" ");
		sort();
	}

	public void sort()
	{
		Arrays.sort(this.wordRay);
	}

	public String toString()
	{
		sort();
		return Arrays.toString(wordRay)+"\n\n";
	}
}