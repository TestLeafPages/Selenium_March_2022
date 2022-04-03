package week3.day1;

public class MyCar extends Car{
	
	public String carName = "BMW";

	public static void main(String[] args) {
		Vehicle veh = new Vehicle();
		veh.applyBrake();
		veh.soundHorn();
		
		Car car = new Car();
		car.driveCar();
		car.applyBrake();
		car.soundHorn();
		
//		Bike bike = new Bike();
//		bike.applyBrake();
//		bike.soundHorn();
	}

}
