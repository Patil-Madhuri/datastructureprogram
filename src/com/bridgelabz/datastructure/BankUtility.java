package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose:Banking cash counter
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   09-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class BankUtility 
{
	public static void main(String[] args) 
	{

		Utility utility = new Utility();
		BankQueue queue=new BankQueue();
		int option = 1;
		while(option==1 && queue.size()<queue.queueArray.length && queue.size() >= 0)
		{
			System.out.println("First enter into queue\n 1>\tFor enter to Queue\n 2>\tProcede with Transaction\n\tEnter your choice");
			option=utility.inputInteger();
			if(option == 1)
			{
				queue.add();
			}
			if(option ==2 && queue.empty())
			{
				System.out.println("First Enter into Queue");
			}
		}
		
		while(queue.full() || !queue.full() && !queue.empty())
		{
			System.out.println("Select your operation in Bank\n 1>\tFor Deposite\n 2>\tFor WithDraw\n 3>\tFor Check Balance\n "
					+ "4>\tFor Enter into Queue \n5>\tExit\nEnter Your choice!!! ");
			int choice =utility.inputInteger();
			
			switch (choice)
			{
			case 1:
				System.out.println("Enter the amount to deoposite");
				double amtd=utility.inputDouble();
				queue.exit();
				Utility.depositeAmount(amtd);
				break;
			
			case 2:
				queue.add();
				System.out.println("Enter the amount to withdraw");
				double amtw=utility.inputDouble();
				queue.exit();
				Utility.withdrawAmount(amtw);
				break;
			
			case 3:
				Utility.checkbalance();
				break;
			
			case 4:
				while(queue.size() < queue.queueArray.length && queue.queueArray.length > 0)
				{
					System.out.println("First enter into queue\n 1>\tFor enter to Queue\n 2>\tProcede with Transaction\n\tEnter your choice");
					option=utility.inputInteger();
					if(option==1)
					{
						queue.add();
					}
					if(option==2 && queue.empty())
					{
						System.out.println("First Enter into Queue");
					}
				}
			case 5:
					System.out.println("Thanks.....");
					System.exit(0);
			default:
					System.out.println("Invalid choice");
			}
					System.out.println("\n come Next!!!\n");
			}
		}
}
