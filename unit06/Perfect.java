//(c) A+ Computer Science

public class Perfect
{
   private int number;

	//add constructors
   public Perfect()
   {
	   setNumber(0);
   }
   
   public Perfect(int n)
   {
	   setNumber(n);
   }

	//add a set method
   public void setNumber(int n)
   {
	   number = n;
   }

	
   public boolean isPerfect()
	{
	   int divisorSum = 0;
	   for (int i = 1; i < number; i++)
	   {
		 if (number % i ==0)
		 {
			 divisorSum = divisorSum + i;
		 }
	   }
	   if (divisorSum == number)
	   {
		   return true;
	   }
	   return false;
	}

	//add a toString	
	public String toString()
	{
		if (isPerfect())
		{
			return number + " is perfect.";
		}
		return number + " is not perfect.";
	}
}