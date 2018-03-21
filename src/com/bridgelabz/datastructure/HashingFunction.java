package com.bridgelabz.datastructure;
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
