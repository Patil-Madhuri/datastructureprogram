package com.bridgelabz.datastructure;

import com.bridgelabz.utility.Utility;

public class Banking 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		Queue depositeQueue = new Queue();
		Queue withdrawQueue = new Queue();
		Queue mainQueue = new Queue();
		int choice = 0,numberOfPerson,depositperson,withdrawperson;
		double depositAmount,withdrawamount;
		System.out.println("How many person bank serve: ");
		numberOfPerson = utility.inputInteger();
		for(int i=1;i<=numberOfPerson;i++)
		{
			System.out.println("1.Deposite queue \n2.Withdraw queue \n3.Deposite amount \n4.withdraw amount \n5.Check Balanace");
			System.out.println("Enter your choice: ");
			choice = utility.inputInteger();
			switch(choice)
			{
			case 1: 
				System.out.println("Enter the number of person who want to deposit: ");
				depositperson = utility.inputInteger();
				for(i=0;i<depositperson;i++)
				{
					depositeQueue.enqueue(depositperson);
				}
				System.out.println("Size of deposite queue: "+depositeQueue.getSize());
				break;
			case 2:
				System.out.println("Enter the number of person who want to withdraw: ");
				withdrawperson = utility.inputInteger();
				for(i=0;i<withdrawperson;i++)
				{
					withdrawQueue.enqueue(withdrawperson);
				}
				System.out.println("Size of withdraw queue: "+withdrawQueue.getSize());
				break;
			
			case 3: 
				System.out.println("Enter the amount to deposit: ");
				depositAmount = utility.inputDouble();
				Utility.depositeAmount(depositAmount);
				depositeQueue.dequeue();
				System.out.println("Size of deposite queue: "+depositeQueue.getSize());
				break;
			case 4:
				System.out.println("Enter the amount to withdraw: ");
				withdrawamount = utility.inputDouble();
				Utility.withdrawAmount(withdrawamount);
				withdrawQueue.dequeue();
				System.out.println("Size of withdraw queue: "+withdrawQueue.getSize());
				break;
			case 5:
				Utility.checkbalance();
			}
		}
		
		
	}	
	
}
