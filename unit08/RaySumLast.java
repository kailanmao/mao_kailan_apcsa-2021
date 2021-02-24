//(c) A+ Computer Science
//www.apluscompsci.com

public class RaySumLast
{
	public static int go(int[] ray)
	{
		if (ray.length<1)return -1;
		int max = ray[0];
		int sum = 0;
		
		
		for (int i = 0; i< ray.length; i++)
		{
			if (ray[i]>max)max = ray[i];
		}
		if (max == ray[ray.length-1]) return -1;

		for (int j = 0; j<ray.length; j++)
		{
			if (ray[j]>ray[ray.length-1])sum += ray[j];
		}
		return sum;
	}
}