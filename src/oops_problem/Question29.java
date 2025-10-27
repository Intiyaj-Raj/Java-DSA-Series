package oops_problem;

// Create a class with final variable, final method, and final class to demonstrate restrictions.
final class Final {
	final int v = 100;

	final void display() {
		System.out.println("Final method called");
	}
}

public class Question29 {
	public static void main(String[] args) {
		Final f = new Final();
		System.out.println("Final variable : " + f.v);
		f.display();
	}
}
