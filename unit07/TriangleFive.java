//(c) A+ Computer Science
//www.apluscompsci.com

public class TriangleFive
{
   private char letter;
   private int amount;

	public TriangleFive()
	{
		setLetter('x');
		setAmount(0);
	}

	public TriangleFive(char c, int amt)
	{
		setLetter(c);
		setAmount(amt);
	}

	public void setLetter(char c)
	{
		letter = c;
	}

	public void setAmount(int amt)
	{
		amount = amt;
	}

	public String toString()
	{
		String output="";
		char original = letter;
		for(int h = amount; h>0; h--)
		{
			for (int i = 0; i<h; i++)
			{
				for(int j = amount; j>i; j--)
				{
					output += letter;
				}
				output += " ";
				if (letter =='Z')
				{
					letter = 'A';
				}
				else
				{
					letter = (char)(letter+1);
				}
			}
			output+= "\n";
			letter = original;
		}
		
		return output;
	}
}