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
		@SuppressWarnings("rawtypes")
		public static void main(String[] args) 
		{
			Queue queue = new Queue();
			Utility utility = new Utility();
			System.out.println("Enter month: ");
			int lMonth = utility.inputInteger();
			System.out.println("Enter year");
			int lYear = utility.inputInteger();
			for(int i=1;i<=Utility.maxDay(lMonth, lYear);i++)
			{
			
				Data data= new Data(Utility.day(i,lMonth, lYear), i);
				queue.enqueue(data);
			}
			
			for(int i=1;i<=Utility.maxDay(lMonth, lYear);i++)
			{
				System.out.println(queue.dequeueString());
			}
		}
	
}

