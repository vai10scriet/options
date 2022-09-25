package programs;

import java.util.HashSet;
import java.util.Set;

public class P4 {
	
	public static void main(String args[])
	{
		
		String names[]= {"Ram","Sita","Geeta","Ram","Ram"};
		
		Set<String> set=new HashSet<String>();
		for(String name:names)
		{
			if(set.add(name)==false)
			{
				System.out.println("Duplicate element is "+name);
				
			}
		}
		
	}

}
