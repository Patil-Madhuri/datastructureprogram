package com.bridgelabz.datastructure;

public class Node1 
{
	 protected Object data;
	    protected Node1 link;
	 
	    /*  Constructor  */
	    public Node1()
	    {
	        link = null;
	        data = 0;
	    }    
	    /*  Constructor  */
	    public Node1(Object data2,Node1 n)
	    {
	        data = data2;
	        link = n;
	    }    
	    /*  Function to set link to next Node  */
	    public void setLink(Node1 n)
	    {
	        link = n;
	    }    
	    /*  Function to set data to current Node  */
	    public void setData(int d)
	    {
	        data = d;
	    }    
	    /*  Function to get link to next node  */
	    public Node1 getLink()
	    {
	        return link;
	    }    
	    /*  Function to get data from current Node  */
	    public   Object getData() {
	    	return  data;
	    }
	    

}
