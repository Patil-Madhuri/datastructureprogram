package com.bridgelabz.datastructure;

import java.util.ArrayList;

import com.bridgelabz.utility.Utility;

/******************************************************************************  
 *  Purpose:Storing the anagram number in stack
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
public class AnagramStack
{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Stack ls = new Stack();  
		ArrayList<Integer> arr = Utility.primeNumbers(0,1000); 
		ArrayList<Integer> anagram = new ArrayList<Integer>();
		for(int element : arr)
		{
			int temp = element;
			int sum=0;
			while(temp!=0)
			{
				int rem = temp%10;
				sum =(sum*10)+rem;
				temp = temp/10;
			}
			if(arr.contains(sum))
			{
				anagram.add(sum);
				anagram.sort(null);
			}
		}
		for(int element:anagram)
		{
			ls.push(element);
		}
		ls.display();
	}
	
}
