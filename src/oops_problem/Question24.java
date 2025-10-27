package oops_problem;

//Create class Person, subclass Teacher, and another subclass Student. Print their roles using inheritance.
class Person {
	void role() {
		System.out.println("I am a Person");
	}
}

class Teacher extends Person {
	void role() {
		System.out.println("I am a Teacher");
	}
}

class Studentt extends Person {
	void role() {
		System.out.println("I am a Student");
	}
}

public class Question24 {
	public static void main(String[] args) {
		Person t = new Teacher();
		Person s = new Studentt();

		t.role();
		s.role();
	}
}
