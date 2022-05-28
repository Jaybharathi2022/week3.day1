package week3.day1.assignment.org.department;

import week3.day1.assignment.org.college.College;

public class Department extends College {
	
	String deptName;

	protected Department() {
		//super();
		deptName = "BIOT";
		
		// TODO Auto-generated constructor stub
	}

	public void deptName() {
		System.out.println("Department Name "+deptName);
	}
}
