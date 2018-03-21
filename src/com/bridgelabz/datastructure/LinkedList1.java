package com.bridgelabz.datastructure;

/******************************************************************************  
 *  Purpose: Linked list structure
 * @author  Madhuri Chaudhari
 *  @version 1.0
 *  @since   05-03-2018
 ******************************************************************************/
class ListNode<T>
{
	T value;
	ListNode<T> pointer;


	public ListNode(T value, ListNode<T> pointer) 
	{
		this.value = value;
		this.pointer = pointer;
	}

	public T getValue() 
	{
		return value;
	}

	public void setValue(T value) 
	{
		this.value = value;
	}

	public ListNode<T> getPointer() 
	{
		return pointer;
	}

	public void setPointer(ListNode<T> pointer) 
	{
		this.pointer = pointer;
	}	
	
	@Override
	public String toString() 
	{
		return "Node [value=" + value + ", pointer=" + pointer + "]";
	}

}

public class LinkedList1<T>
{
	ListNode<T> start;
	ListNode<T> end;
	int size;
	
	public ListNode<T> emptyList()
	{
		start=null;
		end=null;
		size=0;
		return start; 
	}
	
	public void add(T value)
	{
		ListNode<T> newnode=new ListNode<T>(value, null);
		size++;
		if(start==null)
		{
			start=newnode;
			end=start;
		}
		else
		{
			newnode.setPointer(start);
			start=newnode;
		}
	}
	public T getLastItem()
	{
		return end.getValue();
	}
	public T getFirstItem()
	{
		return start.getValue();
	}
	public void removeFirst()
	{
		ListNode<T> temp=start;
		start.setPointer(start.getPointer());
		temp.setPointer(null);
	}
	public void remove(T value)
	{
		ListNode<T> temp=start;
		ListNode<T> prevpointer;
		size--;
		if(temp==end)
		{
			start=null;
			end=start;
		}
		else if(value.equals(start.getValue()))
		{
			start=temp.getPointer();
			temp.setPointer(null);
		}
		else if(value.equals(end.getValue()))
		{
			do
			{
				prevpointer=temp;
				temp=temp.getPointer();
			}
			while(temp!=end);
			end=prevpointer;
			prevpointer.setPointer(null);
		}
		else
		{
			do
			{
				prevpointer=temp;
				temp=temp.getPointer();
				if(temp.getValue().equals(value))
				{
					prevpointer.setPointer(temp.getPointer());
					temp.setPointer(null);
				}	
			}
			while(temp.getPointer()!=null);
		}
	}
	
	
	public boolean search(T value)
	{
		ListNode<T> temp=start;
		do
		{
			if(temp.getValue().equals(value))
			{
				return true;
			}
			temp=temp.getPointer();
		}
		while(temp!=null);
		return false;
	}
	
	public int size()
	{
		return size;
	}
	public void append(T value)
	{
		ListNode<T> newnode=new ListNode<T>(value, null);
		size++;
		if(start==null)
		{
			start=newnode;
			end=start;
		}
		else
		{
			end.setPointer(newnode);
			end=newnode;
			newnode.setPointer(null);
		}
	}
	public void display()
	{
		ListNode<T> temp=start;
		if(size==0)
		{
			System.out.println("Empty");
		}
		else if(size==1)
		{
			System.out.println(start.getValue()+"  ");
		}
		else
		{
			do
			{
				System.out.println(temp.getValue());
				temp=temp.getPointer();
			}
			while(temp!=null);
		}
	}
	@Override
	public String toString()
	{
		ListNode<T> temp=start;
		String tostring="";
		if(start==null)
		{
			return "";
		}
		else if(start==end)
		{
			return ""+start.getValue();
		}
		else
		{
			do
			{
				tostring=""+tostring+""+temp.getValue()+" ";
				temp=temp.getPointer();
			}
			while(temp!=null);
		}
		return tostring;
	}
	public void order()
	{
		 T temp=null;
		 int a,b;
		 for(ListNode<T> i=start;i!=null;i=i.getPointer())
		 {
			 for(ListNode<T> j=i.getPointer();j!=null;j=j.getPointer())
			 {
				 a=(int)i.getValue();
				 b=(int)j.getValue();
				 if(a>b)
				 {
					 temp=i.getValue();
					 i.setValue(j.getValue());
					 j.setValue(temp);
				 }
			 }
		 }
	}
	public void reverseStack()
	{
		LinkedList1<T> list=new LinkedList1<T>();
		for(ListNode<T> i=start;i!=null;i=i.getPointer())
		{
			list.add(i.getValue());
		}
		start=null;
		end=null;
		size=0;
		int capacity=list.size;
		for(int i=0;i<capacity;i++)
		{
			add(list.getLastItem());
			list.remove(list.getLastItem());
		}
	}

	 
		public void printlist()
		{
			ListNode<T> temp = start;
			
			while(temp != null)
			{
				System.out.print(temp.value+" ");
				temp = temp.pointer;
			}
		}
	
}
