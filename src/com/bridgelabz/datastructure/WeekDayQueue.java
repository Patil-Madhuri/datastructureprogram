package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Print the month calender accepting the month and year from user
 *  		using queue
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import java.util.LinkedList;
import java.util.Queue;
import com.bridgelabz.utility.Utility;

public class WeekDayQueue 
{
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the month");
		int lMonth = utility.inputInteger();
		System.out.println("Enter the year");
		int lYear = utility.inputInteger();
		int lStartDay = Utility.dayOfWeek(lMonth,1, lYear);
		Queue week  = new LinkedList<>();
		int lmaxDay = Utility.maxDay(lMonth, lYear);
		int lNumberOfObject;
		int date = 0;
		if (lmaxDay + lStartDay > 35) {
			lNumberOfObject = 6;
		} else {
			lNumberOfObject = 5;
		}
		for (int i = 0; i < lNumberOfObject; i++) {
			week.add(new LinkedList<>());
		}
		for (int i = 0; i < lNumberOfObject; i++) {
			Queue queue = (Queue) week.poll();
			if (i == 0) {
				for (int j = 0; j < lStartDay; j++)
				{
					queue.add(" ");
				}
				for(int j = lStartDay;j<7;j++)
				{
					queue.add(++date);
				}
			}
			else
			{
				for(int j = 0; j <7;j++)
				{
					queue.add(++date);
					if(date == lmaxDay)
					{
						break;
					}
				}
				
			}
			week.add(queue);
		}
		System.out.println("SUN"+"\t"+"M"+"\t"+"TU"+"\t"+"WED"+"\t"+"TH"+"\t"+"FRI"+"\t"+"SAT");
		for(int i = 0; i < lNumberOfObject; i++)
		{
			Queue queue = (Queue) week.poll();
			int lLength = queue.size();
			for(int j = 0; j <lLength; j++)
			{
				System.out.print(queue.poll());
				System.out.print("\t");
			}
			System.out.println();
		}
	}

}
