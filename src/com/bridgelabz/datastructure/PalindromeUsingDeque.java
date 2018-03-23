package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: String palindrome checker using dequeue
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   09-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class PalindromeUsingDeque 
{
		
		public static void  main(String[]args)
		{	
			Utility utility = new Utility();
			
			System.out.println("Enter to check palindrome or not");
			String lString = utility.inputString();
			char[] charArray=lString.toCharArray();
			int n=charArray.length-1;
			DequeueStructure dequeue=new DequeueStructure(10);
	
			for(int i=0;i<charArray.length;i++)
			{
				dequeue.addFront(charArray[i]);
			}
	
			int dequeueSize = dequeue.size();
			System.out.println("Size= "+dequeueSize);
	
			String lString1="";
	
			for(int i=0;i<=n;i++)
			{
				char c=dequeue.removeFront();
				lString1 =lString1 + c;
			}
			System.out.println("Reversed - "+lString1);
			if(lString.equals(lString1))
			{
				System.out.println("Sttring is Palindrome ");
			}
			else
			{
				System.out.println("String is not a palindrome ");
			}
		
		}
			
		
}
