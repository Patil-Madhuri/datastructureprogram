package com.bridgelabz.utility;
/*************************************************************************
 * @purpose : Utility for data structure program
 * @author  Madhuri Chaudhari
 * @version 1.0
 * @since 05/03/2018
 *************************************************************************/
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

import com.bridgelabz.datastructure.LinkedList1;
import com.bridgelabz.datastructure.OrderListStructure;

public class Utility 
{
	static Scanner scanner=new Scanner(System.in);
	
	public Utility()
	{
		scanner = new Scanner(System.in);
	}
	
	/**
	 * @input string
	 */
	public String inputString()
	{
		try
		{
		return scanner.next();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return "";
	}
	
	/**
	 * @input integer
	 */
	public int inputInteger()
	{
		try
		{
			return scanner.nextInt();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	
	/**
	 * input double
	 */
	public double inputDouble()
	{
		try
		{
			return scanner.nextDouble();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0.0;
	}
	
	public long inputLong()
	{
		try
		{
			scanner.nextLong();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return 0;
	}
	/**
	 * @param starrt
	 * @param limit
	 * @return arraylist integer
	 */
	public static ArrayList<Integer> primeNumbers(int lStart, int lLimit)
	{
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 2; i <= lLimit; i++) 
		{
			boolean prime = true;
			for (int j = 2; j < i; j++) 
			{
				if (i % j == 0)
				{
					prime = false;
					break;
				}
			}
			if (prime == true)
			{
				primeNumbersList.add(i);
			}
		}
		return primeNumbersList;
	}

	/**
	 * @param num
	 * @param num1
	 * @return
	 */
	public static boolean anagramNum(int lNumber, int lNumber1) {
		String lString1 = "";
		String lString2 = "";
		lString1 = String.valueOf(lNumber);
		lString2 = String.valueOf(lNumber1);
		char[] charFromWord = lString1.toCharArray();
		char[] charFromAnagram = lString2.toCharArray();
		Arrays.sort(charFromWord);
		Arrays.sort(charFromAnagram);
		return Arrays.equals(charFromWord, charFromAnagram);

	}
	
	
	public static TreeSet<Integer> anagramInArraylist(ArrayList<Integer> arrayList)
	{
		TreeSet<Integer> treeSet = new TreeSet<>();
		for(int i = 0; i < arrayList.size()-1;i++)
		{
			for(int j = i +1; j< arrayList.size();j++)
			{
				if(anagramNum(arrayList.get(i), arrayList.get(j)))
				{
					treeSet.add(arrayList.get(i));
					treeSet.add(arrayList.get(j));
				}
			}
		}
		return treeSet;
	}
	
	public static void twoDimentionlPrimeAnagramNumber(TreeSet<Integer> treeset)
	{
		
		int lRow=0,lColumn = 0,i,j,lNumber=100;
		Object integerArray[] =treeset.toArray();
		String stringArray[][] = new String[10][25];
		for(i=0;i<10;i++)
		{
			for(j=0;j<25;j++)
			{
				stringArray[i][j]="";
			}
		}
		for(i=0;i<integerArray.length;i++)
		{
			int temperaroy = (int) integerArray[i];
			if(temperaroy > lNumber)
			{
				lNumber = lNumber + 100;
				lRow++;
				lColumn=0;
			}
			stringArray[lRow][lColumn++] = Integer.toString(temperaroy);
		}
		
		System.out.println("Anagram numbers are: ");
		for(i=0;i<10;i++)
		{
			for(j=0;j<25;j++)
			{
				System.out.print(stringArray[i][j]+ "\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * @param string
	 * Balanced parenthisis
	 * @return
	 */
	public static boolean balancedParentheses(String lExpression) 
	{
		int lCount = 0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < lExpression.length(); i++) 
		{
			if (lExpression.charAt(i) == '(')
			{
				stack.push(lExpression.charAt(i));
				lCount++;
			}

			if (lExpression.charAt(i) == ')') 
			{
				if (stack.isEmpty())
				{
					lCount--;
				} else
				{
					stack.pop();
					lCount--;
				}
			}
		}
		if (stack.isEmpty() && lCount == 0) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	static double mbalance =80000;
	/**
	 * @param deposit the amount in account
	 */
	public static void depositeAmount(double lAmount)
	{
		mbalance= mbalance + lAmount;
		System.out.println("Amount of Rs"+lAmount+" Deposited Sucessfully");
		System.out.println("Current Balance is Rs"+mbalance);
		
	}
	
	/**
	 * @param withdraw the amount from account
	 */
	public static void withdrawAmount(double lAmount)
	{
			if(lAmount <= mbalance) 
			{
				mbalance=mbalance-lAmount;
				System.out.println("Amount of Rs"+lAmount+" Withdraws Sucessfully");
				System.out.println("Current Balance is Rs"+mbalance);
			}
			else
			{
				lAmount =  lAmount - mbalance;
				System.out.println("Insufficeint balance You need "+ lAmount);
			}
	}
	
	/**
	 * display the available balance
	 */
	public static void checkbalance()
	{
		System.out.println("Current Balance is Rs "+mbalance);
	}
	
	/**
	 * @param accept the month,day, year from user and print the whole calender of that month
	 * @return
	 */
	public static int dayOfWeek(int lMonth, int lDate, int lYear) //
	{
        int y = lYear - ((14 - lMonth) / 12);
        int x = y + (y/4) -(y/100) + (y/400);
        int m = lMonth + 12 * ((14 - lMonth) / 12) - 2;
        int d = (lDate + x + (31*m)/12) % 7;
        return d;
    }
	
	public static int maxDay(int lMonth,int lYear)
	{
		if(lMonth==1 || lMonth==3 || lMonth==5 || lMonth == 7 || lMonth == 8 || lMonth == 10 || lMonth == 12)
		{
			return 31;
		}
		else if(lMonth ==4 || lMonth == 6|| lMonth == 9|| lMonth ==11)
		{
			return 30;
		}
		else
		{
			if(isLeapYear(lYear))
			{
				return 29;
			}
			else
			{
				return 28;
			}
		}
		
	}
    // return true if the given year is a leap year
    public static boolean isLeapYear(int year) 
    {
        if  ((year % 4 == 0) && (year % 100 != 0))
        	
        	return true;
        	
        if  (year % 400 == 0) 
        	{
        	return true;
        	}
        return false;
    }

    public static void getCalender(int lMonth,int lYear)
    {

        // months[i] = name of month i
        String[] months = {" ","January", "February", "March","April", "May", "June","July", "August", "September","October", "November", "December"};

        // days[i] = number of days in month i
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check for leap year
        if (lMonth == 2 && Utility.isLeapYear(lYear))
        	{
        	days[lMonth] = 29;
        	}

        System.out.println("Java Calender " +lMonth + " "+lYear +" ");
        // print calendar header
        System.out.println(" " + months[lMonth] + " " + lYear);
        System.out.println("====================");
       System.out.println(" S  M Tu  W Th  F  S");
        
        // starting day
        int lD = Utility.dayOfWeek(lMonth, 1, lYear);

        // print the calendar
        for (int i = 0; i < lD; i++)
            System.out.print("   ");
        
        for (int i = 1; i <= days[lMonth]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + lD) % 7 == 0) || (i == days[lMonth])) 
            {
            	System.out.println();
            }
        }
    }

    /**
	 * print month calender with using stack
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void calenderWithStack()
	{
		Utility utility = new Utility();
		Stack month = new Stack();
		Stack day = new Stack();
		System.out.println("Enter the month ");
		int lMonth = utility.inputInteger();
		System.out.println("Enter the year ");
		int lYear = utility.inputInteger();

		String[] months = {"","January", "February", "March","April", "May", "June",
				"July", "August", "September","October", "November", "December"};
		for(int i=0; i<months.length;i++)
		{
			month.push(months[i]);
		}
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (lMonth == 2 && isLeapYear(lYear)) 
		{
			days[lMonth] = 29;
		}
		for(int i=0;i<days.length;i++)
		{
			day.push(days[i]);
		}
		System.out.println("   " + months[lMonth] + " " + lYear);
		System.out.println(" S  M Tu  W Th  F  S");
		int d = dayOfWeek(lMonth, 1, lYear);
		for (int i = 0; i < d; i++)
		{
			System.out.print("   ");
		}
		for (int i = 1; i <= days[lMonth]; i++)
		{
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[lMonth])) 
				System.out.println();
		}

	}

	public static String day(int lDate,int lMonth,int lYear)
	{
		int lD=	Utility.dayOfWeek(lMonth,lDate , lYear);
		String dayName="";
		switch(lD)
		{
		case 0:
			dayName = "sunday";
			break;
		case 1:
			dayName = "Monday";
			break;
		case 2:
			dayName = "tuesday";
			break;
		case 3:
			dayName = "Wednesday";
			break;
		case 4:
			dayName = "Thursday";
			break;
		case 5:
			dayName = "Friday";
			break;
		case 6:
			dayName = "Saturday";
			break;
			
		}
		return dayName;
	}
	
	/**
	 * @param accept the filePath and read the file
	 * @return
	 */
	
	public static String[] readFile(String lFilePath) {
		String words[] = {};
		ArrayList<String> lLines = new ArrayList<String>();
		String line, temp[] = {};
		BufferedReader bufferedReader;
		 
		
		try {
			FileReader file = new FileReader(lFilePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) 
			{
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++)
				{
					lLines.add(temp[i]);

				}
			}
			words = lLines.toArray(new String[lLines.size()]);
			bufferedReader.close();
		} 
		catch (FileNotFoundException e) 
		{
			e.printStackTrace();
		} catch (IOException e) {
		
			e.printStackTrace();
		}
		
		return words;
	}
	
	/**
	 * @param search
	 */
	public static<T> void writeFileinteger(T lSearch) 
	{ 
		String lString = lSearch.toString();
		System.out.println(lString);
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/Documents/MADHURI/wriehashingdata");
			BufferedWriter write = new BufferedWriter(writer);
			write.write(lString);

			write.close();
			
		} catch (IOException e)
		{
			
			e.printStackTrace();
		}


	}
	
	/**
	 * Hashing function
	 * @param array
	 */
	@SuppressWarnings({ "unchecked", "rawtypes",  })
	public static void hashingFunction(String[] array) 
	{
		HashMap<Integer, LinkedList1> hashmap = new HashMap<Integer, LinkedList1 >();
		int lHash = 0;
		int hasharray[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			hasharray[i]=Integer.parseInt(array[i]);
		}
		for(int i=0;i<hasharray.length;i++)
		{
			lHash=hasharray[i]%11;
			if(hashmap.containsKey(lHash))
			{

				LinkedList1 linkedlist=hashmap.get(lHash);
				linkedlist.add(hasharray[i]);
			}
			else
			{
				hashmap.put(lHash, new LinkedList1());
				LinkedList1 linkedlist=hashmap.get(lHash);
				linkedlist.add(hasharray[i]);
			}
		}
		System.out.println("Enter the key to search");
		int search = scanner.nextInt();
		lHash= search % 11;

		if(hashmap.containsKey(lHash))
		{

			LinkedList1 linkedlist=hashmap.get(lHash);
			if(linkedlist.search(search))
			{
				linkedlist.remove(search);
				Utility.writeFileinteger(hashmap);

				System.out.println(search+" Element found and removed from the list");
				
			}
			else
			{
				linkedlist.add(search);
				System.out.println(search+"element Not found and added to the list");
				Utility.writeFileinteger(hashmap);
			}
		}
		else
		{
			hashmap.put(lHash, new LinkedList1());
			LinkedList1 linkedlist=hashmap.get(lHash);
			linkedlist.add(search);
			Utility.writeFileinteger(hashmap);

		}
		Set<Integer> keys = hashmap.keySet(); 
		for(Integer key1: keys)
		{ 
			LinkedList1 value = hashmap.get(key1);
			System.out.print(key1+"->");
			value.display();
			System.out.println();
		}
	}
	
	/**
	 * @param find the number of binary search tree
	 */
	public static void findNumberOfBinarySearchTree(int array[])
	{
		long lFactorial1,lFactorial2,lFactorial3,lCounter = 0;
		for(int i=0;i<array.length;i++)
		{
			lFactorial1 = calculateFactorial((2) * (array[i]));
			lFactorial2 = calculateFactorial((array[i]+1));
			lFactorial3 = calculateFactorial(array[i]);
			try
			{
				lCounter = lFactorial1/(lFactorial2 * lFactorial3);
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			System.out.println(lCounter);
		}
		
	}
	

	/**
	 * @param calculating the factorial of number
	 * @return
	 */
	public static long calculateFactorial(int i)
	{
		long lFactorial = 1;
		while(i > 1)
		{
			lFactorial = lFactorial * i;
			i--;
		}
		return lFactorial;
	}
	
	/**
	 * Purpose: creates 2d array of range of prime numbers
	 * @param range max range of prime numbers
	 * @return 2d array of prime numbers
	 */
	public static void twoDimensionalPrimeNumber()
	{
		int array[][]=new int[10][];
		int lInitial=2,lTemperary=100;
		int i,j,k;
		
		System.out.println("prime numbers are");
		for(i=0; i<10; i++)
		{
			int size=0;
			for(j=lInitial; j<lTemperary; j++)
			{
				boolean flag=true;
				for(k=2; k<j; k++)
				{
					if(j%k==0)
					{
						flag=false;
						break;
					}					
				}
				if(flag==true)
				{
					size++;
				}
			}
			array[i]=new int[size];
			j=0;
			int m;
			for(m=lInitial; m<lTemperary; m++)
			{
				boolean lTemperary1=true;
				for(int q=2; q<m; q++)
				{
					if(m%q==0)
					{
						lTemperary1=false;
						break;
					}
				}
				
				if(lTemperary1==true)
				{
					array[i][j]=m;
					System.out.print(array[i][j]+"  ");
					j++;
				}
			}
			System.out.println();
			lInitial = lTemperary;
			lTemperary =lTemperary + 100;
		}
	
		
	}
	/**
	 * @param Write the data in file for string
	 */
	public static <T> void writeFile(@SuppressWarnings("rawtypes") LinkedList1 list,String filepath)
	{
			String string = list.toString();
			try {
				FileWriter writer = new FileWriter(filepath);
				BufferedWriter write = new BufferedWriter(writer);
				write.write(string);
				
				write.close();
				writer.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
	}
	/**
	 * @param Write the data in file for integer
	 */
	public static <T> void writeFileinteger(OrderListStructure<T> list)
	{
			String lString = list.toString();
			try {
				FileWriter writer = new FileWriter("/home/bridgeit/Documents/MADHURI/number");
				BufferedWriter write = new BufferedWriter(writer);
				write.write(lString);
				
				write.close();
				writer.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
	}
}
