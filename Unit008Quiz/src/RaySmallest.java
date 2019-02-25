//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RaySmallest
{
	public static int go(int[] ray)
	{
		int min = 100000000;
		for (int i : ray) {
			if (i < min)
				min = i;
		}
		return min;
	}
}