package com.bridgelabz.datastructure;

import java.util.ArrayList;
import java.util.TreeSet;

import com.bridgelabz.utility.Utility;

public class AnagramIn2DimentionArray 
{
	public static void main(String[] args) {
		ArrayList<Integer> arrayList = Utility.primeNumbers(0,1000);
		TreeSet<Integer> treeSet = Utility.anagramInArraylist(arrayList);
		Utility.twoDimentionlPrimeAnagramNumber(treeSet);
	}
}
