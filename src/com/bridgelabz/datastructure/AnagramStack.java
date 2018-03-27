package com.bridgelabz.datastructure;

/******************************************************************************  
 *  Purpose:Storing the anagram number in stack
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/

import java.util.ArrayList;
import com.bridgelabz.utility.Utility;

public class AnagramStack
{
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Stack stack = new Stack();  
		ArrayList<Integer> arrayList = Utility.primeNumbers(0,1000); 
		ArrayList<Integer> anagramNumbers = new ArrayList<Integer>();
		for(int element : arrayList)
		{
			int lTemperary = element;
			int lSum=0;
			while(lTemperary!=0)
			{
				int lRemender = lTemperary%10;
				lSum =(lSum*10)+lRemender;
				lTemperary = lTemperary/10;
			}
			if(arrayList.contains(lSum))
			{
				anagramNumbers.add(lSum);
				anagramNumbers.sort(null);
			}
		}
		for(int element:anagramNumbers)
		{
			stack.push(element);
		}
		stack.display();
	}
	
}
