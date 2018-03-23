package com.bridgelabz.datastructure;

/******************************************************************************  
 *  Purpose: Print the month calender accepting the month and year from user
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class Calender
{
	public static void main(String[] args)
	{
		Utility utility = new Utility();
		System.out.println("Enter month");
		 int lMonth =utility.inputInteger();
		 System.out.println("Enter year");
		  int lYear = utility.inputInteger();    // year
		  Utility.getCalender(lMonth, lYear);

}

}
