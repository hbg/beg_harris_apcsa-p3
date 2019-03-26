//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
		int max = Integer.MIN_VALUE;
		for (int[] i1 : m)
			for (int i2 : i1)
				if (i2 > max) max = i2;
		return max;
    }
}
