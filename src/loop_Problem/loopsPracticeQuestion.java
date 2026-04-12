package loop_Problem;

import java.util.Scanner;

public class loopsPracticeQuestion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        Question 1 : How many times 'Hello' is printed?
        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i += 2;
        }


//        Question 2 : Write a program that reads a set of integers, and then prints the sum of the
//        even and odd integers.

        System.out.print("how many numbers: ");
        int n1 = sc.nextInt();
        int oSum = 0;
        int eSum = 0;
        System.out.println("enter " + n1 + " number");
        for (int i = 1; i <= n1; i++) {
            int number = sc.nextInt();

            if (number % 2 == 0) {
                eSum = eSum + number;
            } else {
                oSum = oSum + number;
            }
        }
        System.out.println("even number sum " + eSum);
        System.out.println("odd number sum " + oSum);


//        sum of even or odd number (1 - n)
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                evenSum = evenSum + i;
            } else {
                oddSum = oddSum + i;
            }
        }

        System.out.println("even number sum " + evenSum);
        System.out.println("odd number sum " + oddSum);


//        Question 3 : Write a program to find the factorial of any number entered by the user.
//        (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
//        only. We write factorial as n!
//                So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
//                Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)


//        Question 4 : Write a program to print the multiplication table of a number N, entered by the
//        user.


//                Question 5 :
//        What is wrong in the following program?
    }
}
