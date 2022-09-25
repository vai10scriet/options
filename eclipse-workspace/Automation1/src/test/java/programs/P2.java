package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P2 {
	
	public static void main(String args[])
	{
		
		duplicateElements("JavaTar");
		
	}
	
	
	public static void duplicateElements(String str)
	{
		
		if(str==null)
		{
			
			System.out.println("String is null");
			
		}
		
		if(str=="")
		{
			System.out.println("String is blank");
			
		}
		
		if(str.length()==1)
		{
			
			
			System.out.println("Single Char Array");
		}
		
		
		char[] words=str.toCharArray();
		Map<Character,Integer> Charmap=new HashMap<Character,Integer>();
		for(Character ch:words)
		{
			
			if(Charmap.containsKey(ch))
			{
				Charmap.put(ch, Charmap.get(ch)+1);
				
			}
				
			else
			{
				Charmap.put(ch, 1);
				
			}
			
		}
		
		Set<Map.Entry<Character, Integer>> entryset= Charmap.entrySet();
		
		for(Map.Entry<Character, Integer> entry:entryset)
		{
			
			if(entry.getValue()>1)
			{
				
				System.out.println(entry.getKey()+""+entry.getValue());
			}
		}
	}

}
