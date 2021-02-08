//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class AddSubMult
{
	public static double check( double a, double b )
	{
		if (a>b) {
			return a-b;
		}
		if (a<b) {
			return b-a;
		}
		else return b*a;
	}
}