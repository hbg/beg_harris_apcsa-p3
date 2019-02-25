import java.util.ArrayList;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class SumFirstRunner
{
	public static void main( String args[] )
	{		
		ArrayList<Integer> cases = new ArrayList<Integer>();
		int[] x = {-99,1,2,3,4,5,6,7,8,9,10,5}; // Tested all labs on all test cases
		for (int x1 : x) {
			cases.add(x1);
		}
		System.out.println(ListSumFirst.go(cases));
	}
}