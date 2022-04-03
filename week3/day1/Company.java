package week3.day1;

public class Company {

	Company() {
		System.out.println("Company Constructor");
	}
	
	Company(String name) {
		System.out.println("Company Constructor with arg");
	}
	
	public static void getDetails() {
		System.out.println("Details");
	}
	
	public void details() {
		getDetails();
	}
}
