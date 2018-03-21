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
	public static ArrayList<Integer> primeNumbers(int start, int limit)
	{
		ArrayList<Integer> primeNumbersList = new ArrayList<Integer>();
		for (int i = 2; i <= limit; i++) 
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
	public static boolean anagramNum(int num, int num1) {
		String str1 = "";
		String str2 = "";
		str1 = String.valueOf(num);
		str2 = String.valueOf(num1);
		char[] charFromWord = str1.toCharArray();
		char[] charFromAnagram = str2.toCharArray();
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
		
		int row=0,column = 0,i,j,number=100;
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
			if(temperaroy > number)
			{
				number = number + 100;
				row++;
				column=0;
			}
			stringArray[row][column++] = Integer.toString(temperaroy);
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
	public static boolean balancedParentheses(String expression) 
	{
		int count = 0;
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < expression.length(); i++) 
		{
			if (expression.charAt(i) == '(')
			{
				stack.push(expression.charAt(i));
				count++;
			}

			if (expression.charAt(i) == ')') 
			{
				if (stack.isEmpty())
				{
					count--;
				} else
				{
					stack.pop();
					count--;
				}
			}
		}
		if (stack.isEmpty() && count == 0) 
		{
			return true;
		} 
		else 
		{
			return false;
		}
	}
	static double balance =80000;
	/**
	 * @param deposit the amount in account
	 */
	public static void depositeAmount(double amt)
	{
		balance=balance+amt;
		System.out.println("Amount of Rs"+amt+" Deposited Sucessfully");
		System.out.println("Current Balance is Rs"+balance);
		
	}
	
	/**
	 * @param withdraw the amount from account
	 */
	public static void withdrawAmount(double amount)
	{
			if(amount <= balance) 
			{
				balance=balance-amount;
				System.out.println("Amount of Rs"+amount+" Withdraws Sucessfully");
				System.out.println("Current Balance is Rs"+balance);
			}
			else
			{
				amount =  amount - balance;
				System.out.println("Insufficeint balance You need "+ amount);
			}
	}
	
	/**
	 * display the available balance
	 */
	public static void checkbalance()
	{
		System.out.println("Current Balance is Rs "+balance);
	}
	
	/**
	 * @param accept the month,day, year from user and print the whole calender of that month
	 * @return
	 */
	public static int dayOfWeek(int month, int date, int year) //
	{
        int y = year - ((14 - month) / 12);
        int x = y + (y/4) -(y/100) + (y/400);
        int m = month + 12 * ((14 - month) / 12) - 2;
        int d = (date + x + (31*m)/12) % 7;
        return d;
    }
	
	public static int maxDay(int month,int year)
	{
		if(month==1 || month==3 || month==5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
			return 31;
		}
		else if(month ==4 || month == 6|| month == 9|| month ==11)
		{
			return 30;
		}
		else
		{
			if(isLeapYear(year))
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

    public static void getCalender(int month,int year)
    {

        // months[i] = name of month i
        String[] months = {" ","January", "February", "March","April", "May", "June","July", "August", "September","October", "November", "December"};

        // days[i] = number of days in month i
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // check for leap year
        if (month == 2 && Utility.isLeapYear(year))
        	{
        	days[month] = 29;
        	}

        System.out.println("Java Calender " +month + " "+year +" ");
        // print calendar header
        System.out.println(" " + months[month] + " " + year);
        System.out.println("====================");
       System.out.println(" S  M Tu  W Th  F  S");
        
        // starting day
        int d = Utility.dayOfWeek(month, 1, year);

        // print the calendar
        for (int i = 0; i < d; i++)
            System.out.print("   ");
        
        for (int i = 1; i <= days[month]; i++)
        {
            System.out.printf("%2d ", i);
            if (((i + d) % 7 == 0) || (i == days[month])) 
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
		int mon = utility.inputInteger();
		System.out.println("Enter the year ");
		int year = utility.inputInteger();

		String[] months = {"","January", "February", "March","April", "May", "June",
				"July", "August", "September","October", "November", "December"};
		for(int i=0; i<months.length;i++)
		{
			month.push(months[i]);
		}
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (mon == 2 && isLeapYear(year)) 
		{
			days[mon] = 29;
		}
		for(int i=0;i<days.length;i++)
		{
			day.push(days[i]);
		}
		System.out.println("   " + months[mon] + " " + year);
		System.out.println(" S  M Tu  W Th  F  S");
		int d = dayOfWeek(mon, 1, year);
		for (int i = 0; i < d; i++)
		{
			System.out.print("   ");
		}
		for (int i = 1; i <= days[mon]; i++)
		{
			System.out.printf("%2d ", i);
			if (((i + d) % 7 == 0) || (i == days[mon])) 
				System.out.println();
		}

	}

	public static String day(int date,int month,int year)
	{
	 int d=	Utility.dayOfWeek(month,date , year);
		String dayName="";
		switch(d)
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
	@SuppressWarnings("unused")
	public static String[] readFile(String filePath) {
		String words[] = {};
		ArrayList<String> lines = new ArrayList<String>();
		String line, temp[] = {};
		BufferedReader bufferedReader;
		FileReader file;
		int index = 0;
		try {
			file = new FileReader(filePath);
			bufferedReader = new BufferedReader(file);
			while ((line = bufferedReader.readLine()) != null) 
			{
				temp = line.split(" ");
				for (int i = 0; i < temp.length; i++)
				{
					lines.add(temp[i]);

				}
			}
			words = lines.toArray(new String[lines.size()]);
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
	public static<T> void writeFileinteger(T search) 
	{ 
		String string = search.toString();
		System.out.println(string);
		try {
			FileWriter writer = new FileWriter("/home/bridgeit/Documents/MADHURI/wriehashingdata");
			BufferedWriter write = new BufferedWriter(writer);
			write.write(string);

			write.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
	
	/**
	 * Hashing function
	 * @param array
	 */
	@SuppressWarnings({ "unchecked", "rawtypes", "unused" })
	public static void hashingFunction(String[] array) 
	{
		HashMap<Integer, LinkedList1> hashmap = new HashMap<Integer, LinkedList1 >();
		int hash = 0;
		int hasharray[]=new int[array.length];
		for(int i=0;i<array.length;i++)
		{
			hasharray[i]=Integer.parseInt(array[i]);
		}
		for(int i=0;i<hasharray.length;i++)
		{
			hash=hasharray[i]%11;
			if(hashmap.containsKey(hash))
			{

				LinkedList1 linkedlist=hashmap.get(hash);
				linkedlist.add(hasharray[i]);
			}
			else
			{
				hashmap.put(hash, new LinkedList1());
				LinkedList1 linkedlist=hashmap.get(hash);
				linkedlist.add(hasharray[i]);
			}
		}
		System.out.println("Enter the key to search");
		int search = scanner.nextInt();
        hash= search % 11;

		if(hashmap.containsKey(hash))
		{

			LinkedList1 linkedlist=hashmap.get(hash);
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
			hashmap.put(hash, new LinkedList1());
			LinkedList1 linkedlist=hashmap.get(hash);
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
		long fact1,fact2,fact3,counter = 0;
		for(int i=0;i<array.length;i++)
		{
			fact1 = factorial((2) * (array[i]));
			fact2 = factorial((array[i]+1));
			fact3 = factorial(array[i]);
			try
			{
			counter = fact1/(fact2*fact3);
			}
			catch (Exception e) {
				e.printStackTrace();
				
			}
			System.out.println(counter);
		}
		
	}
	

	/**
	 * @param calculating the factorial of number
	 * @return
	 */
	public static long factorial(int i)
	{
		long fact = 1;
		while(i > 1)
		{
			fact = fact * i;
			i--;
		}
		return fact;
	}
	
	/**
	 * Purpose: creates 2d array of range of prime numbers
	 * @param range max range of prime numbers
	 * @return 2d array of prime numbers
	 */
	public static void twoDimensionalPrimeNumber()
	{
		int array[][]=new int[10][];
		int initial=2,temp=100;
		int i,j,k;
		
		System.out.println("prime numbers are");
		for(i=0; i<10; i++)
		{
			int size=0;
			for(j=initial; j<temp; j++)
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
			for(m=initial; m<temp; m++)
			{
				boolean temp1=true;
				for(int q=2; q<m; q++)
				{
					if(m%q==0)
					{
						temp1=false;
						break;
					}
				}
				
				if(temp1==true)
				{
					array[i][j]=m;
					System.out.print(array[i][j]+"  ");
					j++;
				}
			}
			System.out.println();
			initial=temp;
			temp=temp+100;
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
			String string = list.toString();
			try {
				FileWriter writer = new FileWriter("/home/bridgeit/Documents/MADHURI/number");
				BufferedWriter write = new BufferedWriter(writer);
				write.write(string);
				
				write.close();
				writer.close();
			} catch (IOException e) {
			
				e.printStackTrace();
			}
			
	}
}
