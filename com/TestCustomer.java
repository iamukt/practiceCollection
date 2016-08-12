package com;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class TestCustomer 
{
	public static void main(String[] args) 
	{
		//Set<Customer> set = new TreeSet<>(new Customer());
		Set<Customer> set = new TreeSet<>(new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) 
			{
				if(o1.getRollno() < o2.getRollno())
					return -1;
				else if(o1.getRollno() > o2.getRollno())
					return 1;
				return 0;
			}
		});
		set.add(new Customer("monk",5));
		set.add(new Customer("hari",10));
		set.add(new Customer("safari",6));
		set.add(new Customer("ram",7));
		set.add(new Customer("ganshyam",8));
		System.out.println(set);
		System.out.println(set.iterator().next().getRollno());
		
			
	}
}
