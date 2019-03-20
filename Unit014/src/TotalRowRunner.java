//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here		
		int[][][] testCases = new int[][][]{{{1,2,3},{5,5,5,5}},
		{{1,2,3},{5},{1},{2,2}},
		{{1,2},{5,5},{5,5},{4,5,6,7},{123124,12312}}};
		for (int[][] testCase : testCases) {
			for (int i : TotalRow.getRowTotals(testCase))
				System.out.print(i + " ");
			System.out.println();
		}
			
	}
}



