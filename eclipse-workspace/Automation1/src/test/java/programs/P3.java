package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P3 {
	//how to find duplicate elements in Array
	public static void main(String args[])
	{
		
		String names[]= {"Java","Javascript","Ruby","C","Java","C","C"};
		
		Map<String,Integer> map=new HashMap<String,Integer>();
		
		for(String name:names)
		{
			Integer count=map.get(name);
			if(count==null)
			{
				
				map.put(name,1);
			}
			
			else
			{
				
				map.put(name,++count);
			}
			
			Set<Entry<String, Integer>> entryset=map.entrySet();
			for(Entry<String, Integer> entry:entryset)
			{
				if(entry.getValue()>1)
				{
					
					System.out.println(entry.getKey()+" "+entry.getValue());
				}
				
				
				
			}
			
			
		}
		
		
	}

}
