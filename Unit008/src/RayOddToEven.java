//(c) A+ Computer Science
//www.apluscompsci.com2
//Name -
//Date -

public class RayOddToEven
{
	/**
	 * @author Harris Beg
	 * @return Span
	 * @param ray An array to be tested for largest span from odd to even
	 * 
	 */
	public static int go(int[] ray)
	{
		int lastindex = -1;
		for (int i = 0; i<ray.length; i++) {
			if (lastindex == -1 & ray[i] % 2 == 1) lastindex = i;
			else if (ray[i] % 2 == 0 && lastindex > -1) return i - lastindex;
		}
		return -1;
	}
	public static void main(String... sTrInG) {
		System.out.println(go(new int[] {1,1,2}));
	}
}