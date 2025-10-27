package oops_problem;
//Create a class Animal and a subclass Dog which extends Animal. Print a message using method overriding.

class Animal {
	void sound() {
		System.out.println("Animal makes a sound");
	}
}

class Dog extends Animal {
	@Override
	void sound() {
		System.out.println("Dog barks");
	}

	void color() {
		System.out.println("Dog color is brown");
	}
}

public class Question7 {
	public static void main(String[] args) {
		Dog d = new Dog();
		d.sound();
		d.color();
	}
}
