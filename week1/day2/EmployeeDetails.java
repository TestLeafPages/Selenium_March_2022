package week1.day2;

public class EmployeeDetails {
	
	public void printAddress() {
		System.out.println("Chennai");
	}
	
	public String getAddress() {
		return "Chennai";
	}
	
	public int getHouseNo() {
		return 25;
	}
	
	public void getEmployeeDetails(String empName, int empId) {
		// Haja-1001n(concatenation)
		System.out.println(empName + "-" + empId);
		System.out.println(empName);
		System.out.println(empId);
	}

	public static void main(String[] args) {
		EmployeeDetails ed = new EmployeeDetails();
		// control+2, L
//		String address = ed.getAddress();
//		System.out.println(address);
		System.out.println(ed.getAddress());
		int houseNo = ed.getHouseNo();
		ed.getEmployeeDetails("Haja", 1001);
	}

}
