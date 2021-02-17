//(c) A+ Computer Science
//www.apluscompsci.com

public class WordRunner
{
	public static void main ( String[] args )
	{
		//add test cases
		Word test = new Word("Hello");
		System.out.println(test);
		
		test.setString("World");
		System.out.println(test);
		
		test.setString("JukeBox");
		System.out.println(test);
		
		test.setString("TCEA");
		System.out.println(test);
		
		test.setString("UIL");
		System.out.println(test);
	}
}