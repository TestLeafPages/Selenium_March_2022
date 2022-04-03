package week3.day1;

public class Employees{
	
	int empId;
	String empName;
	static String companyName;
	
//	Employees() {
//		this(1001, "Haja");
//		empId = 1002;
//		empName = "Hari";
//		System.out.println("Default Constructor");
//	}
	
	Employees(int empId, String empName, String companyName) {
		this.empId = empId;
		this.empName = empName;
		this.companyName = companyName;
		System.out.println("Parametrized Constructor");
//		this.getDetails();
	}
	

	public static void main(String[] args) {
		Employees emp = new Employees(1001, "Haja", "TestLeaf");
		System.out.println(companyName);
		Employees emp2 = new Employees(1002, "Hari", "QEagle");
		
//		System.out.println(emp.empId);
//		System.out.println(emp.empName);
		System.out.println(companyName);
		
//		System.out.println(emp2.empId);
//		System.out.println(emp2.empName);
		System.out.println(companyName);
		
//		Company.getDetails();
		
//		Employees emp2 = new Employees();
//		System.out.println(emp2.empId);
//		System.out.println(emp2.empName);
//		System.out.println(emp2.companyName);
//		
//		Company com = new Company("TestLeaf");
	}

}
