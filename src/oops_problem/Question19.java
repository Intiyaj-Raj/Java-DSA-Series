package oops_problem;

//Write a program to demonstrate runtime polymorphism using parent reference and child object.

class Vehiclee {
	void start() {
		System.out.println("Vehicle is starting");
	}
}

class Carrr extends Vehiclee{
	void start() {
		System.err.println("Car is starting");
	}
}

class Bike extends Vehiclee{
	void start(){
		System.out.println("Bike is starting");
	}
}

public class Question19 {
	public static void main(String[] args) {
		Vehiclee v = new Carrr();
		v.start();
	
		Vehiclee v2 = new Bike();
		v2.start();
		
	}
}
