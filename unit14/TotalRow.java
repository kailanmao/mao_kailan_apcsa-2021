//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
    	//add code here
    	int tempSum = 0;
    	List<Integer> out = new ArrayList<Integer>();
		for (int a = 0; a < m.length; a++)
		{
			for (int b = 0; b < m[a].length; b++)
			{
				tempSum += m[a][b];
			}
			out.add(tempSum);
			tempSum = 0;
		}
		return out;
    }
}
