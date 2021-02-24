//(c) A+ Computer Science
//www.apluscompsci.com

public class RayOddToEven
{
	public static int go(int[] ray)
	{
		int firstOddIndex = -1;
		int firstEvenIndex = -1;
		
		for (int a = 0; a<ray.length; a++)
		{
			if (ray[a] % 2 == 1)
			{
				firstOddIndex = a;
				break;
			}
		}
		if (firstOddIndex == -1) return -1;
		for (int b = firstOddIndex; b<ray.length; b++)
		{
			if (ray[b] % 2 == 0)
			{
				firstEvenIndex = b;
				break;
			}
		}
		
		if (firstEvenIndex == -1) return -1;
		
		
		return firstEvenIndex - firstOddIndex;
	}
}