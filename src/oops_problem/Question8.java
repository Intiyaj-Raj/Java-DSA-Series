package oops_problem;
//Create a class hierarchy: Vehicle → Car → ElectricCar, and demonstrate method inheritance.

class Vehicle{
	void type() {
		System.out.println("Vehicle");
	}
}
class Carr extends Vehicle{
	void brand() {
		System.out.println("Tata");
	}
}
class ElectricCar  extends Carr{
	void electricVeh() {
		System.out.println("Nexon");
	
	}
}
public class Question8 {

	public static void main(String[] args) {
		ElectricCar e = new ElectricCar();
		e.type();
		e.brand();
		e.electricVeh();
				
	}
}

