package basic_questions;

import java.util.Scanner;

class QuestionSeris2 {
//	Write a program to print the multiplication table of any number entered by the user.
	void multiplicationTable(int num) {
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}

//	Write a program to count the number of digits in a given integer using a while loop.
	void countDigits(int num) {

		System.out.println("original number = "+ num);
		int count = 0;
		int i = 0;
		while (i < num) {
			num = num / 10;
			count++;
		}
		System.out.println("total digits: " + count);
	}
//	Write a program that checks whether a character is a vowel or a consonant using a switch statement.

	void checkVowel(char c) {
		switch (c) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println(c + " is a vowel");
			break;
		default:
			System.out.println(c + " is a consonant");
		}
	}
	
	
//	Write a program to find the factorial of a number using a loop.

	void findFact(int n) {
		int fact = 1;
		
		if(n>=0) {
			for(int i=1;i<=n;i++) {
				fact*= i;
			}
			
			System.out.println("factorial " + n +" = "+ fact);
		}
		
		else {
			System.out.println("please enter a valid number");
		}
	}
	
//	Write a program to reverse an integer number using a while loop.
	
	void reverseNum(int n)
	{
		int i=0;
		int rev = 0;
		System.out.println("Original number = "+ n);
		while (n!=0) {
			int rem = n%10;
			rev = rev*10+rem;
			n /=10;
		}
		System.out.println("Reversed Number = " + rev);
	}
}

public class ProblemOnIfElse2 {

	public static void main(String[] args) {
		QuestionSeris2 ob = new QuestionSeris2();
		
		ob.multiplicationTable(3);
		System.out.println("-------------------------------------");
		
		ob.countDigits(12344);
		System.out.println("-------------------------------------");
		ob.checkVowel('a');
		ob.checkVowel('A');
		ob.checkVowel('b');
System.out.println("-------------------------------------");
		ob.findFact(6);
		ob.findFact(1);
		ob.findFact(-5);
		System.out.println("-------------------------------------");
		ob.reverseNum(1234);
	}
}
