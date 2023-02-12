package com.ranushan;

import java.util.List;

public class TestEmployees {

	public static void main(String[] args) {
		
		Employees employees = new Employees();
		
		employees.loadData();
		
		System.out.println(employees.getEmpList());
		
		try {
			
			Employees employees2 = (Employees) employees.clone();
			employees2.getEmpList().add("Jean");
			System.out.println(employees2.getEmpList());
			
			Employees employees3 = (Employees) employees2.clone();
			List<String> liste = employees3.getEmpList();
			liste.remove("Lise");
			
			System.out.println(liste);
			
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		/*
		 
		try {
			Employees employees3 = (Employees) employees.clone();
			employees3.getEmpList().remove(4);
			System.out.println(employees3.getEmpList());
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		
		*/
		
	}

}
