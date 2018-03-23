package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Hashing function
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   18-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class HashingFunction
{	
	public static void main(String[] args)
	{
		String filepath="/home/bridgeit/Documents/MADHURI/readhashingdata";
		String words[] = Utility.readFile(filepath);
		for(int i=0;i<words.length;i++)
		{
			System.out.print(Integer.parseInt(words[i])+" ");
		}
			System.out.println();
			Utility.hashingFunction(words);
			
		
	}
}
