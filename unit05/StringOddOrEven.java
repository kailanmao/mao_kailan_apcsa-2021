//(c) A+ Computer Science
//www.apluscompsci.com

public class StringOddOrEven
{
	private String word;
	
	public StringOddOrEven()
	{
		word = "";

	}
		

	public StringOddOrEven(String s)
	{
		setString(s);
	}


	public void setString(String s)
	{
		word = s;
	}

 	public boolean isEven()
 	{
		if ( word.length() % 2 == 0) {
			return true;
		}
 		return false;
	}

 	public String toString()
 	{
 		if (isEven()) {
 			return word + "is even";
 		}
 		return word + " is odd";
 		
	}
}