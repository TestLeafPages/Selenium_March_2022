package week1.day2;

public class Calculator {
	
	public int add(int num1, int num2) {
		int sum = num1+num2;
		return sum;
	}
	
	public double sub(double number1, double num2) {
		double sub = number1-num2;
		return sub;
	}
	
	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.add(3,4));
		System.out.println(cal.sub(2.5, 3.5));
	}

}
