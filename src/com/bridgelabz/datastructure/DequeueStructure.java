package com.bridgelabz.datastructure;

public class DequeueStructure
{
	@SuppressWarnings("unused")
	private int front;
	private int rare;
	private int maxSize;
	private char[]array;

	DequeueStructure(int n)
	{
		maxSize=n;
		front =-1;
		rare=-1;
		array=new char[maxSize-1];
	}

	public void addFront(char c)
	{
		for(int i=rare+1;i>0;i--)
		{
			array[i]=array[i-1];
		}

		++rare;
		array[0]=c;
	}

	public void addRare(char c)
	{
		++rare;
		array[rare]=c;
	}

	public char removeFront()
	{
		char c=array[0];

		for(int i=0;i<=rare;i++)
			{
				array[i]=array[i+1];
			}
		rare--;
		return c;
	}

	public char removeRare()
	{
		char c=array[rare];
		rare--;

		return c;

	}

	public int size()
	{
		return rare+1;
	}
}
