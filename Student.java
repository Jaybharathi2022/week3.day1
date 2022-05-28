package week3.day1.assignment.org.student;

import week3.day1.assignment.org.department.Department;

public class Student extends Department {

	String studentName;
	String studentDept;
	int studentId;

	public Student(String studentName, String studentDept, int studentId) {
		this.studentName = studentName;
		this.studentDept = studentDept;
		this.studentId = studentId;
	}

	protected Student() {

		studentName = "Shoba";
		studentDept = "Civil";
		studentId = 56342;

	}

	public void studentName() {
		// TODO Auto-generated method stub

		System.out.println("Student name " + studentName);
	}

	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student department " + studentDept);
	}

	public void studentId() {
		// TODO Auto-generated method stub
		System.out.println("Student Id " + studentId);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu1 = new Student();
		Student stu2 = new Student("Kayal", "Mech", 12365);

		stu1.collegeCode();
		stu1.collegeName();
		stu1.collegeRank();
		stu1.deptName();
		stu1.studentDept();
		stu1.studentId();
		stu1.studentName();

		stu2.collegeCode();
		stu2.collegeName();
		stu2.collegeRank();
		stu2.deptName();
		stu2.studentDept();
		stu2.studentId();
		stu2.studentName();

	}

}
