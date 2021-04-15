//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class TotalRowRunner
{
	public static void main( String args[] ) throws Exception
	{
		//add code here
		TotalRow test = new TotalRow();
		int[][] matrix = {{1,2,3}, {5,5,5,5}};
		
		System.out.println("Row totals are " + test.getRowTotals(matrix));
		
		int[][] matrix2 = {{1,2,3}, {5}, {1}, {2,2}};
		
		System.out.println("Row totals are " + test.getRowTotals(matrix2));

		int[][] matrix3 = {{1,2}, {5,5}, {5,5}, {4,5,6,7}, {123124, 12312}};
		
		System.out.println("Row totals are " + test.getRowTotals(matrix3));

	}
}



