package week1.day2;

public class SumOfDigits {

	public static void main(String[] args) {
		int input = 246;
		int sum = 0;
		
		while(input > 0) {
			int rem = input%10; // 3
			sum = sum + rem;
			input = input/ 10; // 12
		}
		System.out.println(sum);
	}

}
