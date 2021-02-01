//(c) A+ Computer Science
//www.apluscompsci.com

//Name - Kailan Mao
//Date - 1/31/21
//Class - AP CSA
//Lab  - Variables

public class Variables
{
	public static void main ( String[] args )
	{
		//define 1 variable of each of the
		//following data types
		//byte		short		int 		long
		//float		double
		//char      boolean		String

		//integer variables
		byte byteOne = 127;
		short shortOne = 20000;
		int intOne = 1000000;
		long longOne = 87777777;

		//decimal variables

		float floatOne = .96f;
		double doubleOne = .983d;
		
		//other integer types
		char charOne = 'T';

		//other types

		boolean booleanOne = true;
		String stringOne = "hello";

		//output your information here
		System.out.println("////////////////////////////////////");
		System.out.println("*                                  *");
		System.out.println("*        integer types             *");
		System.out.println("*                                  *");
		System.out.println("*8 bit - byteOne = "+byteOne+"             *");
		System.out.println("*16 bit - shortOne = "+shortOne+"         *");
		System.out.println("*32 bit - intOne = "+intOne+"         *");
		System.out.println("*64 bit - longOne = "+longOne+"       *");

		
		System.out.println("*                                  *");
		System.out.println("*        real types                *");
		System.out.println("*                                  *");
		System.out.println("*32 bit - floatOne = "+floatOne+"          *");
		System.out.println("*64 bit - doubleOne = "+doubleOne+"        *");


		System.out.println("*                                  *");
		System.out.println("*      other integer types         *");
		System.out.println("*                                  *");
		System.out.println("*16 bit - charOne = "+charOne+"              *");


		System.out.println("*                                  *");
		System.out.println("*          other types             *");
		System.out.println("*                                  *");
		System.out.println("*booleanOne = "+booleanOne+"                 *");
		System.out.println("*stringOne = "+stringOne+"                 *");

		System.out.println("////////////////////////////////////");


	}
}