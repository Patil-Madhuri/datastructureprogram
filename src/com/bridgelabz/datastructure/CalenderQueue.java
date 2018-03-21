package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Print the month calender accepting the month and year from
 *  			 user using queue
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   21-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class CalenderQueue 
{
		public static void main(String[] args) 
		{
			Queue queue = new Queue();
			Utility utility = new Utility();
			System.out.println("Enter month: ");
			int month = utility.inputInteger();
			System.out.println("Enter year");
			int year = utility.inputInteger();
			for(int i=1;i<=Utility.maxDay(month, year);i++)
			{
			
				Data data= new Data(Utility.day(i,month, year), i);
				queue.enqueue(data);
			}
			
			for(int i=1;i<=Utility.maxDay(month, year);i++)
			{
				System.out.println(queue.dequeueString());
			}
		}
	
}

