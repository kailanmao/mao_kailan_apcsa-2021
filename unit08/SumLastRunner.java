//(c) A+ Computer Science
//www.apluscompsci.com

public class SumLastRunner
{
	public static void main( String args[] )
	{
		RaySumLast test = new RaySumLast();
		int[] a = {-99,1,2,3,4,5,6,7,8,9,10,5};
		System.out.println(test.go(a));
		
		int[] b = {10,9,8,7,6,5,4,3,2,1,-99};
		System.out.println(test.go(b));
		
		int[] c = {10,20,30,40,50,-11818,40,30,20,10};
		System.out.println(test.go(c));
		
		int[] d = {32767};
		System.out.println(test.go(d));
		
		int[] e = {255, 255};
		System.out.println(test.go(e));
		
	}
}