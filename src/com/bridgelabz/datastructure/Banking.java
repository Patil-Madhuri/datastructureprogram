package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Banking cash counter
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   19-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class Banking 
{
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		Queue depositeQueue = new Queue();
		Queue withdrawQueue = new Queue();
		
		int lChoice = 0,lNumberOfPerson,lDepositperson,lWithdrawperson;
		double lDepositAmount,lWithdrawamount;
		System.out.println("How many person bank serve: ");
		lNumberOfPerson = utility.inputInteger();
		for(int i=1;i<=lNumberOfPerson;i++)
		{
			System.out.println("1.Deposite queue \n2.Withdraw queue \n3.Deposite amount \n4.withdraw amount \n5.Check Balanace");
			System.out.println("Enter your choice: ");
			lChoice = utility.inputInteger();
			switch(lChoice)
			{
			case 1: 
				System.out.println("Enter the number of person who want to deposit: ");
				lDepositperson = utility.inputInteger();
				for(i=0;i<lDepositperson;i++)
				{
					depositeQueue.enqueue(lDepositperson);
				}
				System.out.println("Size of deposite queue: "+depositeQueue.getSize());
				break;
			case 2:
				System.out.println("Enter the number of person who want to withdraw: ");
				lWithdrawperson = utility.inputInteger();
				for(i=0;i<lWithdrawperson;i++)
				{
					withdrawQueue.enqueue(lWithdrawperson);
				}
				System.out.println("Size of withdraw queue: "+withdrawQueue.getSize());
				break;
			
			case 3: 
				System.out.println("Enter the amount to deposit: ");
				lDepositAmount = utility.inputDouble();
				Utility.depositeAmount(lDepositAmount);
				depositeQueue.dequeue();
				System.out.println("Size of deposite queue: "+depositeQueue.getSize());
				break;
			case 4:
				System.out.println("Enter the amount to withdraw: ");
				lWithdrawamount = utility.inputDouble();
				Utility.withdrawAmount(lWithdrawamount);
				withdrawQueue.dequeue();
				System.out.println("Size of withdraw queue: "+withdrawQueue.getSize());
				break;
			case 5:
				Utility.checkbalance();
			}
		}
		
		
	}	
	
	
}
