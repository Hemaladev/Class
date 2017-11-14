package org.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.emp.Employee;

public class Solution {

	public static void main(String[] args) throws IOException {
		Employee emp = new Employee();
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhone());
		System.out.println(emp.isGender());
		
		emp.setId(5);
		emp.setName("Bhuvi");
		emp.setEmail("bhuvi@gmail.com");
		emp.setPhone(9876543212l);
		emp.setGender(true);

		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhone());
		System.out.println(emp.isGender());
		
		Employee emp1 = new Employee();
		
		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.isGender());
		
		emp1.setId(7);
		emp1.setName("Hema");
		emp1.setEmail("hema@gmail.com");
		emp1.setPhone(9876556712l);
		emp1.setGender(true);

		System.out.println(emp1.getId());
		System.out.println(emp1.getName());
		System.out.println(emp1.getEmail());
		System.out.println(emp1.getPhone());
		System.out.println(emp1.isGender());
	}

}
