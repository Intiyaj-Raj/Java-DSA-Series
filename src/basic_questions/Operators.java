package basic_questions;
//WriteaJavaprogramtoperformallarithmeticoperations(+,-,*,/,%)

class ArtihermaticOperators {
	int a = 10;
	int b = 20;

	void showResult() {
		System.out.println("Arithematic Operators");
		System.out.println("Addition: " + (a + b));
		System.out.println("Subtraction: " + (a - b));
		System.out.println("Multiplication: " + (a * b));
		System.out.println("Division: " + (a / b));
		System.out.println("Remainder: " + (a % b));
	}

	// Write a Java program using *compound assignment operators (+=, -=, =, /=) to
	// manipulate a number and show the final result.

	void comoundAssign() {

		System.out.println("Compound Assignment: ");

		int num = 20;

		// num = num +10;
		num += 10;
		num -= 10;
		num *= 10;
		num /= 10;

		System.out.println("Final Value of num: " + num);
	}

	// Take an int, float, and double variable, perform an arithmetic operation
	// between them, and observe the final result type.
	// Explain why Java gives that result type.
	void mixedTypeExpression() {
		
		System.out.println("Mixed Type Expression");
		int n1 = 10;
		float n2 = 5.5f;
		double n3 = 9.5543f;

		double res = n1 + n2 + n3;

		System.out.println("Result: " + res);
	}
}

//Write a Java program that checks whether a given number is between 10 and 50 using relational and logical operators.

class RelationalOperator {


	int age = 20;
	void eligbleForVote() {
		System.out.println("Relational Operator");
		
		if (age >= 18 && age <= 120) {
			System.out.println("You are eligible to vote");
			System.out.println("Your age is " + age);
		} else if (age < 18 && age >= 0) {
			System.out.println("You are not eligible to vote");
			System.out.println("Your age is " + age);
		} else {
			System.out.println("Invalid age entered");
		}
	}
}

//Demonstrate the difference between ++i (pre-increment) and i++ (post-increment) using a small example.

class PreNdPostInc {

	int p = 10;
	int ps = 20;

	void print() {

		System.out.println("befor pre-Increment: " + p);
		System.out.println("After pre-Increment: " + ++p);

		System.out.println("befor post-Increment: " + ps++);
		System.out.println("after post-increment: " + ps);
	}
}

public class Operators {
	public static void main(String[] args) {

		ArtihermaticOperators a = new ArtihermaticOperators();
		a.showResult();
		System.out.println("----------------------------------");
		
		a.comoundAssign();
		System.out.println("----------------------------------");
		
		a.mixedTypeExpression();
		System.out.println("----------------------------------");
		
		
		RelationalOperator r = new RelationalOperator();
		
		r.eligbleForVote();

		
		
		PreNdPostInc p = new PreNdPostInc();
		System.out.println("----------------------------------");
		p.print();

	}
}