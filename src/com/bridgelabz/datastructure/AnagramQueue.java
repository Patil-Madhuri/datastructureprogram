package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose:Storing the anagram number in queue
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
public class AnagramQueue 
{
	public static void main(String[] args) {
		Queue queue = new Queue();
		int count=0,i;
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
				count++;
			}
		}
		
		int arr1[]=new int[count];
		int arr2[]=new int[count];
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
				arr1[index]=i;
				int number=i;
				int sum=0,remender;
				while(number>0)
				{
					remender=number%10;
					sum=(sum*10)+remender;
					number=number/10;
				}
				arr2[index]=sum;
				index++;
			}
		}
		
		System.out.println("Anagram numbers are : ");
		for(i=0; i<arr1.length; i++)
		{
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					int digit=arr1[i];
					queue.enqueue(digit);
					
				}
			}
		}
		queue.print();
	}
}
