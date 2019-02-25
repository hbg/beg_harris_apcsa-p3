/**
 * A program to allow students to try out different 
 * String methods. 
 * @author Laurie White
 * @version April 2012
 */
import static java.lang.System.*; 

public class StringExplorer
{

	public static void main(String[] args)
	{
		String sample = "the quick brown fox jumped over the lazy dog.";
		
		//  Demonstrate the indexOf method.
		int position = sample.indexOf("quick");
		int pos = sample.indexOf("slow");
		if(pos != -1)
			   System.out.println("slow is found at position " + pos);
			else
			   System.out.println("slow is not found");
		System.out.println ("sample.indexOf(\"quick\") = " + position);
		
		//  Demonstrate the toLowerCase method.
		String lowerCase = sample.toLowerCase();
		System.out.println ("sample.toLowerCase() = " + lowerCase);
		System.out.println ("After toLowerCase(), sample = " + sample);
		int index = sample.indexOf("the");
		//  Try other methods here:
		while (index != -1) {
			out.println(index);
			sample = sample.replaceFirst("the", "");
			index = sample.indexOf("the");
		}
	}

}
