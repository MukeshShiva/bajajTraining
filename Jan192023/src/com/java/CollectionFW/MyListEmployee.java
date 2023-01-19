package com.java.CollectionFW;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class MyListEmployee {

	public static void main(String[] args) {
		mySort();
	}
	
	public static void mySort()
	{
		Employee emp[] = new Employee[3];
		emp[0] = new Employee(1,"Asha",40);
		emp[1] = new Employee(2,"Nisha",90);
		emp[2] = new Employee(3,"Jisha",55);
		
		List<Employee> list = new ArrayList<Employee>();
		list.add(emp[0]);
		list.add(emp[1]);
		list.add(emp[2]);
		
		Collections.sort(list,new MySalaryComparator());
		
		for(Employee e:list)
			System.out.println(e.eID+" "+e.name+" "+e.salary);
	}

}
