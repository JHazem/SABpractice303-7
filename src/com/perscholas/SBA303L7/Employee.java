package com.perscholas.SBA303L7;

import java.util.ArrayList;
	/*	303.7 Practice SBA
	● Create a class with the name employee.
	● Add three fields of type string. firstName,lastName and department.*/
public class Employee {

	String firstName;
	String lastName;
	String department;

	// ● Create a constructor with all three fields.
	public Employee(String firstName, String lastName, String department) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
	}
	// ● Create Getter and Setter methods.
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	/*
	 ● Override the toString method to print out the employees First name, 
	 Last name and department. 
	 */
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "FirstName: " + this.firstName 
				+ "LastName: " + this.lastName
				+ " Department: " + this.department;
	}

	/*
	 2. Given the three following arrays
		  String[] firstName = {"Harold","Luciano","Tyree","Nyla","Natalie","Quincy","Devyn","Aliana"};
		  String[] lastName = {"Riddle","Zavala","Ho","Saunders","Morgan","Schroeder","Nolan","Orr"};
		  String[] department = {"production","r&d","sales","marketing","human resources","accounting","sales","r&d"}; 
		  */
	
	public static void main(String[] args) {

		String[] firstName = { "Harold", "Luciano", "Tyree", "Nyla", "Natalie", "Quincy", "Devyn", "Aliana" };
		String[] lastName = { "Riddle", "Zavala", "Ho", "Saunders", "Morgan", "Schroeder", "Nolan", "Orr" };
		String[] department = { "production", "r&d", "sales", "marketing", "human resources", "accounting", "sales", "r&d" };

		ArrayList<Employee> emps = addEmployees(firstName, lastName, department);
		System.out.println(emps);
		
	}

	/*	   
	3. Create a method that will add the first name, last name and department to a new employee object. 
	And return an ArrayList of those employees.

	 */
	public static ArrayList<Employee> addEmployees( String[] first, 
													String[] last, 
													String[] department) {

		ArrayList<Employee> employees = new ArrayList<>();
		 
		for (int i = 0; i < first.length; i++) {
			
			Employee employee = new Employee(first[i],last[i], department[i]);
			employees.add(employee);
		}
		return employees;

	}
	
	
}


