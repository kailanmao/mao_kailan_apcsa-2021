//(c) A+ Computer Science
//www.apluscompsci.com

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s )
	{
		word = s;
	}

	public int compareTo( Word rhs )
	{		
		String other = rhs.toString();
		if (word.compareTo(other)>0) return 1;
		if (word.compareTo(other)<0) return -1;
		return 0;
	}

	public String toString()
	{
		return word;
	}
}