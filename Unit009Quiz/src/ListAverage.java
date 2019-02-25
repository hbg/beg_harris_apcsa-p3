//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListAverage
{
	public static double go( List<Integer> ray)
	{
		int sum = 0;
		for (int i : ray) {
			sum+=i;
		}
		return (double)sum/ray.size();
	}
}