//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class RayFirst
{
	public static boolean go(int[] ray)
	{
		for (int i = 1; i<ray.length; i++) {
			if (ray[i] == ray[0]) return true;
		}
		return false;
	}
}