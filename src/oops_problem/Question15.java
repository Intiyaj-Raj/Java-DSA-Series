package oops_problem;
//Create classes A and B (B extends A), and show how A obj = new B(); calls overridden methods.

class A{
	void show() {
		System.err.println("i am class A");
	}
}

class B extends A{
	void show() {
		System.err.println("i am class B");
	}
}
public class Question15 {
	
	public static void main(String[] args) {
		A a = new B();
		a.show();
	}

}
