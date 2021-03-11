//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.ArrayList;
import java.util.List;

public class ListOddToEven
{
	public static int go( List<Integer> ray )
	{
		int firstOddIndex = -1;
		int lastEvenIndex = -1;
		for (int i = 0; i<ray.size(); i++)
		{
			if (ray.get(i) % 2 ==1)
			{
				firstOddIndex = i;
				break;
			}
		}
		if (firstOddIndex == -1) return -1;
		
		for (int i = (ray.size() - 1); i>=0; i--)
		{
			if (ray.get(i) % 2 == 0)
			{
				lastEvenIndex = i;
				break;
			}
		}
		if (lastEvenIndex == -1 || lastEvenIndex < firstOddIndex) return -1;
		return lastEvenIndex - firstOddIndex;
	}
}