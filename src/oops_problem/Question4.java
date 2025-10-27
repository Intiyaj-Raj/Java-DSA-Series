package oops_problem;

//Create a class Calculator having methods add(), sub(), mul(), and div(), and call them using an object.
class Calculator {
	void add(double a, double b) {
		System.out.println("Sum: " + (a + b));
	}

	void sub(double a, double b) {
		System.out.println("dif: " + (a - b));
	}

	void mul(double a, double b) {
		System.out.println("mul: " + (a * b));
	}

	void div(double a, double b) {
		System.out.println("div: " + (a / b));
	}

}

public class Question4{
	public static void main(String[] args) {

		Calculator c = new Calculator();
		c.add(10, 5);
		c.sub(12, 5);
		c.mul(10, 5);
		c.div(22, 5);
	}
}