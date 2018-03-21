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
		@SuppressWarnings("unused")
		public static void  main(String[]args)
		{	
			char d='o';
			Utility utility = new Utility();
			
			System.out.println("Enter to check palindrome or not");
			String string = utility.inputString();
			char[]ch=string.toCharArray();
			int n=ch.length-1;
			DequeueStructure dequeue=new DequeueStructure(10);
	
			for(int i=0;i<ch.length;i++)
			{
				dequeue.addFront(ch[i]);
			}
	
			int s=dequeue.size();
			System.out.println("Size= "+s);
	
			String string1="";
	
			for(int i=0;i<=n;i++)
			{
				char c=dequeue.removeFront();
				string1=string1+c;
			}
			System.out.println("Reversed - "+string1);
			if(string.equals(string1))
			{
				System.out.println("Sttring is Palindrome ");
			}
			else
			{
				System.out.println("String is not a palindrome ");
			}
		
		}
			
		
}
