//(c) A+ Computer Science

class Rational implements Comparable<Rational>
{
	//add two instance variables
	int numerator;
	int denominator;

	//write two constructors
	public Rational()
	{
		setRational(1,1);
	}

	public Rational(int num, int den)
	{
		setRational(num,den);
	}
	//write a setRational method
	public void setRational(int num, int den)
	{
		setNumerator(num);
		setDenominator(den);
	}

	//write  a set method for numerator and denominator
	public void setNumerator(int num)
	{
		numerator = num;
	}

	public void setDenominator(int den)
	{
		denominator = den;
	}
	
	public void add(Rational  other)
	{
		//num1/den1 + num2/den2 
		//new numerator = (num1 * den2 + num2 * den1)
		//new denominator = (den1 * den2)
		setNumerator(numerator * other.getDenominator() + other.getNumerator() * denominator);
		setDenominator(denominator * other.getDenominator());
		reduce();
	}

	private void reduce()
	{
		int div = gcd(numerator,denominator);
		numerator = numerator / div;
		denominator = denominator / div;
	}

	private int gcd(int numOne, int numTwo)
	{
		int gcd = 1;
		for (int i=1; i<=numOne; i++)
		{
			if (numOne%i==0 && numTwo%i==0) gcd = i;
		}

		return gcd;
	}

	public Object clone ()
	{
		Rational x = new Rational(numerator, denominator);
		return x;
	}


	//ACCESSORS

	//write get methods for numerator and denominator
	public int getNumerator()
	{
		return numerator;
	}
	public int getDenominator()
	{
		return denominator;
	}
	
	
	public boolean equals( Object obj)
	{

		if ((double)obj == (double)(numerator/denominator)) return true;

		return false;
	}
	
	public boolean equals(Rational r)
	{
		if ((double)(numerator/denominator) == (double)(r.getNumerator()/r.getDenominator()))
		{
			return true;
		}
		return false;
	}

	public int compareTo(Rational other)
	{
		if ((double)(numerator/denominator)> (double)(other.getNumerator()/other.getDenominator())) return 1;

		return -1;
	}



	
	//write  toString() method
	public String toString()
	{
		if (getDenominator()==1) return ""+ getNumerator();
		return getNumerator() + "/" + getDenominator();
	}
	
	
}
