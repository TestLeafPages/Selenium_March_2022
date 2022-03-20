package week1.day2;

public class LearnJumpStatements {

	public static void main(String[] args) {
		// continue, break
		for (int i = 1; i < 5; i++) {
			// Three
			if(i==3) {
				System.out.println("Three");
				break;
			}
			System.out.println(i);
		}
		System.out.println("End of program");
	}
	
	public void printStatement() {
		System.out.println("Print");
	}
	
	public String getAddress() {
		return "Chennai";
	}

}
