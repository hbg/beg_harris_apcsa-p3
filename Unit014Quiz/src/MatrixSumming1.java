import java.util.*;
import java.io.*; 

public class MatrixSumming1
{
    private static int[][] m = {{ 1, 2, 3, 4, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 6, 7, 1, 2, 5},
    										{ 6, 7, 8, 9, 0},
    										{ 5, 4, 3, 2, 1}};

    public static int sum(  )
    {
		//add code here
    	int sum=0;
		for (int[] i1 : m)
			for (int i2 : i1)
				sum+=i2;
		return sum;
    }
}
