package basics;

import java.util.Scanner;

public class swapNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers: ");

        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        System.out.println("num1 = " + n1);
        System.out.println("num2 = " + n2);

        int n3 = n1;
        n1 = n2;
        n2 = n3;
        System.out.println("num1 = "+ n1);
        System.out.println("num2 = "+ n2);


        System.out.println();
        System.out.println();
        System.out.println();
        /* another method */


        int a = 10;
        int b = 20;

        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("num1 = " + a);
        System.out.println("num2 = " + b);

    }
}
