//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	ArrayList<Integer> sums = new ArrayList<Integer>();
    	for (int[] row : m) {
    		int sum = 0;
    		for (int i = 0;i<row.length;i++) sum+=row[i];
    		sums.add(sum);
    	}
		return sums;
    }
}
