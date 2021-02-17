//(c) A+ Computer Science
//www.apluscompsci.com

public class LetterRemoverRunner
{
	public static void main( String args[] )
	{
		//add test cases		
		System.out.println(new LetterRemover("I am Sam I am", 'a'));
		System.out.println(new LetterRemover("ssssssssxssssesssssesss", 's'));
		System.out.println(new LetterRemover("qwertyqwertyqwerty", 'a'));
		System.out.println(new LetterRemover("abababababa", 'b'));
		System.out.println(new LetterRemover("abaababababa", 'x'));
	}
}