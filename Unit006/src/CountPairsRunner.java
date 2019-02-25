//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException; 

public class CountPairsRunner
{
	public static void main( String[] args )
	{
		String[] testCases = new String[] {"ddogccatppig",
		"dogcatpig",
		"xxyyzz",
		"a",
		"abc",
		"aabb",
		"dogcatpigaabbcc",
		"aabbccdogcatpig",
		"dogabbcccatpig",
		"aaaa",
		"AAAAAAAAA"};
		Cases c = new Cases();
		
		try {
			c.createCaseFile("test.txt");
			c.createDialog();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		out.println(c);
		//add in all of the provided test cases from the lab handout	
	}
}