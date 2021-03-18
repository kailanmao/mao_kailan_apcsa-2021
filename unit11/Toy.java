//(c) A+ Computer Science

public class Toy
{
	private String name;
	private int count;

	public Toy()
	{
		name = "";
		count = 0;
	}

	public Toy( String nm, int cnt )
	{
		setName(nm);
		setCount(cnt);
	}
	
	public int getCount()
	{
		return count;
	}
	
	public void setCount( int cnt )
	{
		count = cnt;
	}
	
	public String getName()
	{
		return name;
	}
	
	public void setName( String nm )
	{
		name = nm;
	}

	public String toString()
	{
	   return getName() + " " + getCount();
	}
}