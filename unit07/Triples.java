//(c) A+ Computer Science
// www.apluscompsci.com

public class Triples
{
   private int number;

	public Triples()
	{
		setNum(0);
	}

	public Triples(int num)
	{
		setNum(num);
	}

	public void setNum(int num)
	{
		number = num;
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;
		int gcf = 1;
		if (a==b && b==c)return a;
		if (a>b && a>c)max = a;
		if (b>a && b>c)max = b;
		if (c>a && c>b)max = c;
		for (int i =1; i<max;i++)
		{
			if (a % i == 0 && b % i ==0 && c % i ==0)
			{
				gcf = i;
			}
		}
		return gcf;
	}

	public String toString()
	{
		String output="";
		for (int a = 1; a<number;a++)
		{
			for (int b = a+1; b<number;b++)
				{
					for (int c = b+1; c<number;c++)
					{
						if ((a%2 != b%2) 
							&& a*a + b*b == c*c 
							&& greatestCommonFactor(a, b, c) == 1)
						{
							output = output + a + " " + b + " " + c + "\n";
						}
					}
				}
		}

		return output+"\n";
	}
}