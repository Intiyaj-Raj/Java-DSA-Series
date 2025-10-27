package oops_problem;

//Create an abstract class Animal and an interface Pet. Class Dog extends Animal and implements Pet.
//

//28. Create an abstract class Animal and an interface Pet. Class Dog extends Animal and implements Pet.
abstract class Animl {
	abstract void sound();
}

interface Pet {
	void friendly();
}

class Dog1 extends Animl implements Pet {
	void sound() {
		System.out.println("Dog barks");
	}

	public void friendly() {
		System.out.println("Dog is friendly");
	}
}

public class Question28 {
	public static void main(String[] args) {
		Dog1 d = new Dog1();
		d.sound();
		d.friendly();
	}
}

//Create a class with a final variable, final method, and final class to demonstrate restrictions.
//
//Design an abstract class Database with abstract methods connect() and disconnect(). Implement it for MySQLDatabase and OracleDatabase.