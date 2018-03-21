package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Number of binary search tree
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
import com.bridgelabz.utility.Utility;

public class NumberOFBinarySearchTree 
{
	public static void main(String[] args) 
	{
		Utility utility = new Utility();
		System.out.println("Enter the number of node: ");
		int node = utility.inputInteger();
		int array[] = new int[node];
		for(int i=0;i<array.length;i++)
		{
			array[i] = utility.inputInteger();
		}
		System.out.println("Number of binary search tree");
		Utility.findNumberOfBinarySearchTree(array);
		
	}
}
