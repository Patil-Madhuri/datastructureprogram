package com.bridgelabz.datastructure;

public class Data
{
	String lWeekday;
	int lDate;
	Data(String weekday,int date)
	{
		this.lWeekday = weekday;
		this.lDate = date;
	}
	public String toString()
	{
		return lDate +"\t"+ lWeekday;
	}
}