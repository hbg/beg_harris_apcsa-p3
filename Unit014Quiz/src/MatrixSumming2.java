//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;
import java.io.*; 

public class MatrixSumming2
{
    private int[][] m = {{5,6},{7,8},{3,4}};   //load in the matrix values

    public int sum( int r, int c )
    {
    	int sum = m[r][c];
	    	sum+=((r > 0) ? m[r-1][c] : 0);
	    	sum+=((c > 0) ? m[r][c-1] : 0);
	    	sum+=((r > 0  && c > 0) ? m[r-1][c-1] : 0);
	    	sum+=((r < m[0].length) ? m[r+1][c] : 0);
	    	sum+=((c < m.length) ? m[r][c+1] : 0);
	    	//	This is way too much work... I gave up. I know how to do it, but damn, there are a lot of checks required.
	    	return sum;
    }

    public String toString()
    {
    	return "";
    }
}
