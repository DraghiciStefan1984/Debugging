package bugs;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.ls.LSInput;

public class ListBugApp
{
	public static void main(String[] args)
	{
		List listOfNumbers=new ArrayList<>();
		
		listOfNumbers.add(54);
		listOfNumbers.add(86);
		listOfNumbers.add("dsa");
		
		List newListOfNumbers=new ArrayList<>();
		
		for(int i=0; i<listOfNumbers.size(); i++)
		{
			System.out.println(listOfNumbers.get(i));
			newListOfNumbers.add(((Integer)listOfNumbers.get(i)).intValue());
		}
	}
}
