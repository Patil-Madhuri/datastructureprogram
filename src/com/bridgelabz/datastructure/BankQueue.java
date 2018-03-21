package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: queue structure for bank cash counter
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   09-03-2018
 ******************************************************************************/
public class BankQueue 
{
	int[]queueArray=new int[10];
	int front=-1;
	int rare=-1;
	static int count=0;
	
	public void enqueue()
	{
		this.add();
	}
	public void add()
	{
		count++;
		System.out.println("Current queue size= "+count+"\n");
	}
	
	public void exit()
	{
		count--;
	}
	
	public int size()
	{
		return count;
	}
	
	public boolean empty()
	{
		return count==0;
	}
	
	public boolean full()
	{
		return count==10;
	}
}
