package basics;

import java.util.Scanner;

public class checkPositiveNegative {
    public static void main(String[] args) {
//question 1
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (n >= 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }


//        Question 2

        double num = 120.5;

        if (num > 100) {
            System.out.println("You have a fever.");
        } else {
            System.out.println("You don't have a fever.");
        }


//        question 3

        int a = 63;
        int b = 36;

        boolean x = (a < b) ? true : false;
        System.out.println("value of x = " + x);

        int y = (a > b) ? a : b;
        System.out.println("value of y = " + y);
    }
}
