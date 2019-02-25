//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListLast
{
	public static boolean go(List<Integer> ray)
	{
		for (int i : ray) {
			if (i == ray.get(ray.size()-1)) return true;
		}
		return false;
	}
}