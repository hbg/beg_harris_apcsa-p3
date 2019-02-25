import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{				
		ListDown l = new ListDown();
		ArrayList<Integer> x = new ArrayList<Integer>();
		int[] cases = new int[] {1, 2, 3, 4, 5, 6};
		for (int i : cases) {
			x.add(i);
		}
		System.out.println(l.go(x));
	}
}