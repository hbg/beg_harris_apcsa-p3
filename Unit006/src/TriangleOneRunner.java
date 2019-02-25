//(c) A+ Computer Science
//www.apluscompsci.com
//Name

import static java.lang.System.*;

public class TriangleOneRunner
{
	public static void main ( String[] args )
	{
		String[] testCases = new String[] {
				"hippo",
				"abcd",
				"it",
				"a",
				"chicken"
		};
		for (String CASE : testCases) {
			TriangleOne t = new TriangleOne(CASE);
			t.print();
		}
		//add test cases		
	}
}