//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int oddFound = -1;
		int even = 0;
		for (int i=0; i<ray.size(); i++) {
			if (ray.get(i) % 2 == 1 && oddFound == -1) {
				oddFound = i;
			}
			if (oddFound != -1 && ray.get(i) % 2 == 0) {
				even = i;
			}
		}
		if (even != 0)
			return even-oddFound;
		return -1;
	}
}