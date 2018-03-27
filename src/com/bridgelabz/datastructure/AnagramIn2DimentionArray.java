package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose:Storing the anagram number in 2D array
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   12-03-2018
 ******************************************************************************/
import java.util.ArrayList;
import java.util.TreeSet;
import com.bridgelabz.utility.Utility;

public class AnagramIn2DimentionArray 
{
	public static void main(String[] args) 
	{
		ArrayList<Integer> arrayList = Utility.primeNumbers(0,1000);
		TreeSet<Integer> treeSet = Utility.anagramInArraylist(arrayList);
		Utility.twoDimentionlPrimeAnagramNumber(treeSet);

	}
}
