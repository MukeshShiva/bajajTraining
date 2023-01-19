package com.java.CollectionFW;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListExample {

	public static void main(String[] args) {
		Employee emp[] = new Employee[3];
		emp[0] = new Employee(1,"Asha",40);
		emp[1] = new Employee(2,"Nisha",90);
		emp[2] = new Employee(3,"Jisha",55);
		
		HashSet<Employee> list = new HashSet<>();
		list.add(emp[0]);
		list.add(emp[1]);
		list.add(emp[2]);
		
		for(Employee e:list)
			System.out.println(e.eID+"");
	}

}
