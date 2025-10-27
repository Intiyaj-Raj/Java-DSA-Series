package oops_problem;
//Create a class Car with a parameterized constructor to initialize companyName and model.

class Car{
	String companyName;
	String model;
	
	Car(String companyName, String  model){
		this.companyName = companyName;
		this.model = model;
	}
	
	void printDetails() {
		System.out.println("Company Name: "+ companyName);
		System.out.println("model: "+ model);
	}
}
public class Question2 {
public static void main(String[] args) {
	Car c = new Car("BMW", "SUV X5");
	c.printDetails();
	
}
}
