package com.bridgelabz.datastructure;

import java.util.NoSuchElementException;

public class Stack<T>
{
    protected Node1 top ;
    protected int size ;
 
    /*  Constructor  */
    public void linkedStack()
    {
        top = null;
        size = 0;
    }    
    /*  Function to check if stack is empty */
    public boolean isEmpty()
    {
        return top == null;
    }    
       
    /*  Function to push an element to the stack */
    @SuppressWarnings("hiding")
	public <T>void push(T days)
    {
    	Node1 nptr = new Node1 (days, null);
        if (top == null)
            top = nptr;
        else
        {
            nptr.setLink(top);
            top = nptr;
        }
        size++ ;
    }    
    /*  Function to pop an element from the stack */
    public Object pop()
    {
        if (isEmpty() )
            throw new NoSuchElementException("Underflow Exception") ;
        Node1 ptr = top;
        top = ptr.getLink();
        size-- ;
        return ptr.getData();
    }    
     
    /*  Function to display the status of the stack */
    @SuppressWarnings("hiding")
	public <T>void display()
    {
        System.out.print("\nStack = ");
        if (size == 0) 
        {
            System.out.print("Empty\n");
            return ;
        }
        Node1 ptr = top;
        while (ptr != null)
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getLink();
        }
        System.out.println();        
    }


}
