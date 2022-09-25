package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class Example1 {
	
	public static void main(String args[])
	{
		
		String  arr[]= {"Ram","Rahul"};
		
		for(String temp:arr)
		{
			
			System.out.println(temp);
		}
		
		ArrayList list = new ArrayList(Arrays.asList(arr));
		
		System.out.println(list);
		
		
	}

}
