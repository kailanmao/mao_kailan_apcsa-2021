//(c) A+ Computer Science
//www.apluscompsci.com

public class Word
{
	private String word;

	public Word()
	{
		setString("");
	}

	public Word(String s)
	{
		setString(s);
	}

	public void setString(String s)
	{
		word = s;
	}

	public char getFirstChar()
	{
		return (char) word.charAt(0);
	}

	public char getLastChar()
	{
		return (char) word.charAt( word.length() - 1 );
	}

	public String getBackWards()
	{
		String back= word.substring( word.length() - 1);
		for (int i = word.length() - 1; i > 0; i--)
		{
			back = back + word.substring(i-1, i);
		}
		return back;
	}

 	public String toString()
 	{
 		return getFirstChar() + "\n" + getLastChar() + "\n" + getBackWards() + "\n" + word + "\n";
	}
}