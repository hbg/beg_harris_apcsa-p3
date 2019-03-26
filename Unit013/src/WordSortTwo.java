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
		boolean sorted = false;
		while (!sorted) {
			sorted = true;
			for (int i = 0; i<wordRay.length; i++) {
				for (int j = 0; j<wordRay.length; j++) {
					if (wordRay[j].compareTo(wordRay[i]) > 0 && j < i) {
						String temp = wordRay[j];
						wordRay[j] = wordRay[i];
						wordRay[i] = temp;
					}
				}
			}
			for (int i = 0; i<wordRay.length-1; i++)
				if (wordRay[i].compareTo(wordRay[i+1]) > 0) sorted = false;
		}
	}

	public String toString()
	{
		sort();
		String out = "[";
		for (String w : wordRay)
			out+=w+", ";
		return out + "]";
	}
}