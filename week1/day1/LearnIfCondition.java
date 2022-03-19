package week1.day1;

public class LearnIfCondition {

	public static void main(String[] args) {
		
		int age = -15;
		if (age > 60) {
			System.out.println("Senior Citizen");
		}
		else if(age >= 18 && age <60) {
			System.out.println("Adult");
		}
		
		else if(age > 0) {
			System.out.println("Not Adult");
		}
		else {
			System.out.println("Age not applicable");
		}
	}
}
