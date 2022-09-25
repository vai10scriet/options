package programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class P1 {
	
	//Print duplicate character in String
	public static void main(String args[])
	{
		//String str= "A";
		printDuplicateCharacter("JAVATAT");
	}
	
	
	public static void printDuplicateCharacter(String str)
	{
		
		if(str==null)
		{
			System.out.println("Null String");
			return;
			
		}
		
		if(str.isEmpty())
		{
			
			System.out.println("Empty string");
			
		}
		
		if(str.length()==1)
		{
			
			System.out.println("Single Char String");
		}
		
		
		char[] words=str.toCharArray();
		
		Map<Character, Integer> charMap=new HashMap<Character, Integer>();
		
		for(Character ch :words)
		{
			
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
				
			}
			
			else {
				
				charMap.put(ch, 1);
			}
			
		}
		
		Set <Map.Entry<Character, Integer>> entryset=charMap.entrySet();
		
		for(Map.Entry<Character, Integer> entry:entryset)
		{
			
			if(entry.getValue()>1)
			{
				
				System.out.println(entry.getKey()+ ":"+ entry.getValue());
			}
			
			else
			{
				
				
			}
		}
		
		
	}
	
	

}
