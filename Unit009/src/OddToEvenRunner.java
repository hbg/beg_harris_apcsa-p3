import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class OddToEvenRunner
{
	public static void main( String args[] )
	{
		ArrayList<Integer> ar = new ArrayList<Integer>();
		int[] cases = {7,1,5,3,11,5,6,7,8,9,10,12345,11};
		for (int i : cases) ar.add(i);
		System.out.println(ListOddToEven.go(ar));
	}
}