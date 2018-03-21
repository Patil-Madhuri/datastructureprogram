package com.bridgelabz.datastructure;

public class Data
{
	String weekday;
	int date;
	Data(String weekday,int date)
	{
		this.weekday = weekday;
		this.date = date;
	}
	public String toString()
	{
		return date +"\t"+ weekday;
	}
}