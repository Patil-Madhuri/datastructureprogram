package com.bridgelabz.datastructure;
/******************************************************************************  
 *  Purpose: Queue Structure
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   13-03-2018
 ******************************************************************************/
import java.util.NoSuchElementException;

class ListNode1 {

	public int data;
	public Data data1;
	public ListNode1 next;
	
	public ListNode1(int data2)
	{
		this.data = data2;
	
		this.next = null;
	}

	public ListNode1(Data data2)
	{
		this.data1 = data2;
		this.next = null;
	}
}
public class Queue<T>
{
	private ListNode1 front;
	private ListNode1 rear;
	private int length;


	public Queue()
	{
		this.front = null;
		this.rear = null;
		this.length = 0;
	}
	public boolean isEmpty()
	{
		return length == 0;
	}
	
	public void enqueue(int data)
	{
		ListNode1 temp = new ListNode1(data);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next =temp;
		}
		rear = temp;
		length++;
	}
	public void enqueue(Data data)
	{
		ListNode1 temp = new ListNode1(data);
		if(isEmpty())
		{
			front = temp;
		}
		else
		{
			rear.next =temp;
		}
		rear = temp;
		length++;
	}
	
	public int getSize()
	{
		return length;
	}
	public int dequeue()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		int result = front.data;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}
	
	public Data dequeueString()
	{
		if(isEmpty())
		{
			throw new NoSuchElementException();
		}	
		Data result = front.data1;
		front = front.next;
		if(front == null)
		{
			rear = null;
		}
		length--;
		return result;
	}

	public void print(){
		if(isEmpty()){
			return;
		}
		ListNode1 current = front;
		while(current != null)
		{
			System.out.print(current.data+"   ");
			current = current.next;
		}
		
	}
}
