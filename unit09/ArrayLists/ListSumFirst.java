//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

import java.util.List;
import java.util.ArrayList;

public class ListSumFirst
{
	public static int go(List<Integer> ray)
	{
		if (ray.size() == 0) return -1;
		int firstVal = ray.get(0);
		int sum = 0;
		for (int i = 0; i<ray.size(); i++)
		{
			if (ray.get(i) > firstVal) sum = sum + ray.get(i);
		}
		if (sum==0) return -1;
		return sum;
	}
}