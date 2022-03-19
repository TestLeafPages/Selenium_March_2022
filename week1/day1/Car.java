package week1.day1;

// AccessSpecifier Class ClassName
public class Car {
	
	String color = "Red";

	// AccessSpecifier returnType methodName
	public void driveCar() {
		color = "Black";
		System.out.println(color);
		System.out.println("Drive Car");
	}
	
	public void applyBrake() {
		System.out.println(color);
		System.out.println("Apply Brake");
	}
	
	public static void main(String[] args) {
		System.out.println("In main method");
		Car myCar = new Car();
		System.out.println(myCar.color);
		myCar.driveCar();
		myCar.applyBrake();
	}
	
}
