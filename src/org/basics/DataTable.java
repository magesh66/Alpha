package org.basics;

import java.util.ArrayList;
import java.util.List;

public class DataTable 
{
public static void main(String[] args) 
{
	List<String>emp=new ArrayList<String>();
	emp.add("Ramesh");
	emp.add("Ramesh@gmail");
	emp.add("Java");
	String s = emp.get(1);
	System.out.println(s);
	
}
}
