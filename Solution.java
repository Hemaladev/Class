package org.main;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import org.emp.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Solution {

	public static void main(String[] args) throws IOException {
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session session = sf.openSession();
		
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
        System.out.print("Enter Id : ");
		int id = Integer.valueOf(bf.readLine());
		System.out.print("Enter Name : ");
		String name = bf.readLine();
		System.out.print("Enter Email : ");
		String email = bf.readLine();
		System.out.print("Enter Phone : ");
		long phone = Long.valueOf(bf.readLine());
		
		Employee   emp = new Employee(id, name, email, phone);
		
		System.out.println(emp.getId());
		System.out.println(emp.getName());
		System.out.println(emp.getEmail());
		System.out.println(emp.getPhone());
		
		session.close();
	}

}
