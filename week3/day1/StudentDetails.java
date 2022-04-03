package week3.day1;

public class StudentDetails {
	
	public void getStudentDetails() {
		System.out.println("Haja");
	}
	
	public void getStudentDetails(int studentId) {
		System.out.println("Haja");
	}
	
	public void getStudentDetails(int studentId, int phno) {
		System.out.println("Haja");
	}
	
	public void getStudentDetails(String studentName) {
		System.out.println("Haja");
	}
	
	public void getStudentDetails(int studentId, String studentName) {
		System.out.println("Haja");
	}
	
	public void getStudentDetails(String studentName, int studentId) {
		System.out.println(true);
	}
	
	public static void main(String[] args) {
		StudentDetails details = new StudentDetails();
		details.getStudentDetails();
		details.getStudentDetails(101);
		details.getStudentDetails("Haja");
		details.getStudentDetails(101, "Haja");
		details.getStudentDetails("Haja", 101);
	}

}
