//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ToyStore
{
	private ArrayList<Toy> toyList;

	public ToyStore()
	{
		toyList = new ArrayList<Toy>();
	}
	
	public ToyStore(String toys)
	{
		loadToys(toys);
	}

	public void loadToys( String toys )
	{
		ArrayList<String> toysList = new ArrayList<>(Arrays.asList(toys.split(" ")));
		int index = 0;
		int count = 0;
		int total = 0;
		String toyName = "";
		while ( total < toysList.size())
		{
			toyName = toysList.get(index);
			for (int i=0; i<toysList.size();i++)
			{
				if (toysList.get(i)== toysList.get(index))
				{
					count++;
					toysList.set(index,  "");
				}
			}
			Toy e = new Toy(toyName, count);
			toyList.add(e);
			total = total+count;
			for (int i=0; i<toysList.size(); i++)
			{
				if (toysList.get(i) != "")
				{
					count = i;
					break;
				}
			}
			
		}
		
	}
  
  	public Toy getThatToy( String nm )
  	{
  		for (int i=0; i<toyList.size(); i++)
  		{
  			if (toyList.get(i).getName().equals(nm))
  			{
  				return toyList.get(i);
  			}
  		}
  		return null;
  	}
  
  	public String getMostFrequentToy()
  	{
  		int max = 1;
  		String toy = "";
  		for (int i=0; i<toyList.size(); i++)
  		{
  			if (toyList.get(i).getCount()>max)
  			{
  				max = toyList.get(i).getCount();
  				toy = toyList.get(i).getName();
  			}
  		}
  		return toy;
  	}  
  
  	public void sortToysByCount()
  	{
  		int[] list = new int[toyList.size()];
  		for (int i=0; i<toyList.size(); i++)
  		{
  			list[i] = toyList.get(i).getCount();
  		}
  		Arrays.sort(list);
  		ArrayList<Toy> copyToyList = toyList;
  		for (int i=0; i<toyList.size(); i++)
  		{
  			for (int j=0; j<toyList.size(); j++)
  			{
  				if (list[i] == copyToyList.get(j).getCount())
  				{
  					toyList.set(i, copyToyList.get(j));
  				}
  			}
  		}
  	}  
  	  
	public String toString()
	{
	   return toyList.toString();
	}
}