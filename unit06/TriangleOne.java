//(c) A+ Computer Science
//www.apluscompsci.com

public class TriangleOne
{
	private String word;

	public TriangleOne()
	{
		setWord("");
	}

	public TriangleOne(String s)
	{
		setWord(s);
	}

	public void setWord(String s)
	{
		word = s;
	}

	public void print()
	{
		for (int i = word.length() ; i > 0 ; i--)
		{
			System.out.println(word.substring(0, i));
		}
	}
}