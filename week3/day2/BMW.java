package week3.day2;

import week3.day1.Car;
import week3.day1.Vehicle;

public class BMW extends Car{
	
	public void abs() {
		System.out.println("ABS");
	}

	public static void main(String[] args) {
		BMW bmw = new BMW();
		bmw.applyBrake();
		bmw.driveCar();
		bmw.soundHorn();
		bmw.abs();
		
		Car car = new Car();
		car.applyBrake();
//		car.soundHorn();
		car.driveCar();
	}

}
