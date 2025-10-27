package oops_problem;

//Create an abstract class Shape with an abstract method draw(). Create subclasses Circle and Rectangle implementing it.

abstract class Shapee {
	abstract void draw();
}

class Circlee extends Shapee {
	public void draw() {
		System.out.println("Draw Circle");
	}
}

class Rectangle extends Shapee {
	public void draw() {
		System.out.println("Draw Rectangle");
	}
}

public class Question12 {

	public static void main(String[] args) {

		Shapee s1 = new Circlee();
		Shapee s2 = new Rectangle();

		s1.draw();
		s2.draw();
	}
}


