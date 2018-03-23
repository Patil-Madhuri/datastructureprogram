package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Balanced parenthesis using stack
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   08-03-2018
 *****************************************************************************/
import com.bridgelabz.utility.Utility;
public class BalanceParenthesis 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		boolean lResult;
		System.out.println("Enter the arithmatic expression ");
		String lExpression =utility.inputString();
		if(lExpression.length()==0) 
		{
			System.out.println("Please enter the expression ");
		}
		else
		{	
			lResult = Utility.balancedParentheses(lExpression);
			if(lResult) 
			{
				System.out.println("it is a valid expression ");
			}
			else
			{
				System.out.println("it is not valid expression ");
			}
		}
	}
	
	
}
