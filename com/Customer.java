package com;

import java.util.Comparator;
import java.util.Map.Entry;

public class Customer /*implements Comparator<Customer>*/
{
	private String name;
	private Integer rollno;
	public Customer() 
	{
		
	}
	
	
	public Customer(String name, int rollno) {
		super();
		this.name = name;
		this.rollno = rollno;
	}


	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public Integer getRollno() 
	{
		return rollno;
	}
	
	public void setRollno(int rollno) 
	{
		this.rollno = rollno;
	}
	
	
	@Override
	public String toString() {
		return "Customer [name=" + name + ", rollno=" + rollno + "]";
	}


	/*@Override
	public int compareTo(Customer o) 
	{
		if(rollno < o.getRollno())
			return -1;
		else if(rollno > o.getRollno())
			return 1;
		return 0;
	}*/
	
	/*@Override
	public int compare(Customer o1, Customer o2) 
	{
		return o1.getRollno().compareTo(o2.getRollno());
	}*/
}
