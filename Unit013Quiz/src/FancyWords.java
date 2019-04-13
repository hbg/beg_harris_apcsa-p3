//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Arrays;
import java.util.Scanner;
import java.util.Collections;
import static java.lang.System.*;

public class FancyWords
{
	private String[] wordRay;

	public FancyWords(String sentence)
	{
		wordRay = sentence.split(" ");
	}
	public int getMax() {
		int max = 0;
		for (String s : wordRay)
			if (s.length() > max) max = s.length();
		return max;
	}

	public String toString()
	{
		String output="";
		for (int i = 0; i<wordRay.length; i++) {
			for (int j = 0; j<getMax(); j++) {
				if (j >= wordRay[i].length()) {
					output+=" ";
				}
				else output+= String.valueOf(wordRay[i].charAt(wordRay[i].length()-j-1));
			}
			output+="\n";
		}
		
		return output+"\n\n";
	}
}