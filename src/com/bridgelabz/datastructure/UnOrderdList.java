package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose:Unorderd list
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   09-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class UnOrderdList
{
	public static void main(String[] args)
	{
		String filepath ="/home/bridgeit/Documents/MADHURI/demo";
		String words[] = Utility.readFile(filepath);
		for(int i=0;i<words.length;i++)
		{
			System.out.println(words[i]);
		}

		LinkedList1<String> linkedlist = new LinkedList1<>();

		for(String s: words)
		{
			linkedlist.add(s);
		}
		
		System.out.println("\nYour list size: "+linkedlist.size());
		
		Utility utility = new Utility();
		System.out.println("Enter the word to search: ");
		String search = utility.inputString();

		if(linkedlist.search(search))
		{
			System.out.println("Word is present in the linked list");
			linkedlist.remove(search);
			System.out.println("\nYour list size: "+linkedlist.size());
			Utility.writeFile(linkedlist,filepath);
			
		}
		else
		{
			linkedlist.append(search);
			System.out.println("Word added");
			System.out.println("\nYour list size: "+linkedlist.size());
			linkedlist.display();
			Utility.writeFile(linkedlist,filepath);
		}
		
	}
}
