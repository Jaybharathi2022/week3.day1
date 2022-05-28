package week3.day1.assignment.org.college;

public class College {
	
	String collegeName;
	int collegeCode;
	int collegeRank;
	
	protected College(){
		
		collegeName = "Anna University";
		collegeCode=001;
		collegeRank =1;
		
	}

	public void collegeName() {
		System.out.println("College Name "+collegeName);
	}

	public void collegeCode() {
		System.out.println("College Code "+collegeCode);
	}

	public void collegeRank() {
		System.out.println("College Rank "+collegeRank);
	}

}
