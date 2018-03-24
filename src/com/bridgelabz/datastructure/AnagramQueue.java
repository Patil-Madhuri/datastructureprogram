package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose:Storing the anagram number in queue
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
public class AnagramQueue 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Queue queue = new Queue();
		int lCount=0,i;
		for( i=11; i<1000; i++)
		{
			boolean temp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp=false;
					break;
				}
			}
			if(temp==true)
			{
				lCount++;
			}
		}
		
		int intArray1[]=new int[lCount];
		int intArray2[]=new int[lCount];
		int index=0;
		for( i=11; i<1000; i++)
		{
			boolean temp=true;
			for(int j=2; j<i; j++)
			{
				if(i%j==0)
				{
					temp=false;
					break;
				}
			}
			if(temp==true)
			{
				intArray1[index]=i;
				int number=i;
				int sum=0,remender;
				while(number>0)
				{
					remender = number % 10;
					sum = (sum*10) + remender;
					number = number/10;
				}
				intArray2[index]=sum;
				index++;
			}
		}
		
		System.out.println("Anagram numbers are : ");
		for(i=0; i<intArray1.length; i++)
		{
			for(int j=0; j<intArray2.length; j++)
			{
				if(intArray1[i]==intArray2[j])
				{
					int digit=intArray2[i];
					queue.enqueue(digit);
					
				}
			}
		}
		queue.print();
	}
}
