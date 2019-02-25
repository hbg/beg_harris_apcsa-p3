//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListGetNums
{
	//method go will return an array
	//containing the first 3 numbers
	//greater than 11
	public static List<Integer> go( List<Integer> ray )
	{
		int count = 0;
		ArrayList<Integer> returned = new ArrayList<Integer>();
		for (int i : ray) {
			if (count < 3 && i > 11) {
				count++;
				returned.add(i);
			}
		}
		return returned;
	}
}