package basic_questions;
class Question {
//	Write a program to check whether a given number is even or odd using if-else.

	void evenOdd(int num) {
		if (num % 2 == 0) {
			System.out.println(num + " is an even number");
		} else {
			System.out.println(num + " is an odd number");
		}
	}

//
//	Write a program to find the largest of two numbers using if-else.

	void largestNum(int num1, int num2) {
		if (num1 > num2) {
			System.out.println(num1 + " is greater than " + num2);
		} else if (num1 == num2) {
			System.out.println("both the numbers are equal");
		} else {
			System.out.println(num2 + " is greater than " + num1);
		}
	}

//	Write a program to check whether a year is a leap year or not.

//	logic 
//	A year is a leap year if it is divisible by 4 and not divisible by 100, or it is divisible by 400.
	void CheckYear(int y) {
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0) {
			System.out.println(y + " leap year");
		}

		else {
			System.out.println(y + " not a leap year ");
		}
	}

//	Write a program to print numbers from 1 to 10 using a for loop.
	void printNum(int num) {
		for (int i = 1; i <= num; i++) {
			System.out.println(i);
		}
	}

//
//	Write a program to calculate the sum of the first N natural numbers using a loop.
	void sumOfNaturalNum(int n) {
		int sum = 0;
		for (int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println("Sum of natural number = " + sum);
	}
}

public class ProblemOnIfElse {
	public static void main(String[] args) {
		Question ob = new Question();

		ob.evenOdd(70);
		ob.largestNum(11, 14);
		ob.CheckYear(1900);
		ob.printNum(5);
		ob.sumOfNaturalNum(5);

	}
}
