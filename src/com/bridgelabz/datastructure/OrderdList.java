package com.bridgelabz.datastructure;

/******************************************************************************  
 *  Purpose: Orderd list for searching number from list
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   08-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;
public class OrderdList 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		String filepath="/home/bridgeit/Documents/MADHURI/number";
		String words[] = Utility.readFile(filepath);
		for(int i=0;i<words.length;i++)
		{
			System.out.print(Integer.parseInt(words[i])+ " ");
		}
		OrderListStructure<Integer> orderlist = new OrderListStructure<>();
		for(int i=0;i<words.length;i++)
		{
			orderlist.add(Integer.parseInt(words[i]));
		}
		System.out.println("\nYour list size:==>>" +orderlist.size()); 
		orderlist.sortList(orderlist);  		
		System.out.println("\nEnter the value to search: ");
		int search = utility.inputInteger();
		if(orderlist.search(search))
		{
			System.out.println("Integer is present");
			orderlist.remove(search);
			Utility.writeFileinteger(orderlist);
			System.out.println("Your list size:==>>" +orderlist.size());
	
		}
		else
		{
			orderlist.insert( search,0);
			System.out.println("Integer added");
			System.out.println("Your list size:==>>" +orderlist.size());
			Utility.writeFileinteger(orderlist);
			orderlist.printlist();
		}
		
	
		
	}
}
