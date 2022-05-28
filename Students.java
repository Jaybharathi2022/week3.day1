package week3.day1.assignment.org.overloading;

public class Students {

	int studentId;
	String studentName;
	String email;
	long phoneNumber;

	public void getStudentInfo(int studentId) {
		// TODO Auto-generated method stub
		System.out.println("Student id " + studentId);
	}

	public void getStudentInfo(int studentId, String studentName) {
		System.out.println("Student id " + studentId + " " + " Student name " + studentName);
	}

	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("email " + email + " " + " phoneNumber " + phoneNumber);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students newStu = new Students();
		newStu.getStudentInfo(1);
		newStu.getStudentInfo(1, "Vidhyu");
		newStu.getStudentInfo("vidhyu@gmail.com", 775646469l);

	}

}
