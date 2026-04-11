package basics;

import java.util.Scanner;

public class primeNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        if (count == 2) {
            System.out.println(num + " is prime number.");
        } else {
            System.out.println(num + " is not prime number.");
        }

//        prime number another method


        System.out.println();
        System.out.println();


        System.out.print("Enter a Number: ");
        int n = sc.nextInt();
        boolean isPrime = true; // here we assume number is prime

        if (n == 2) {
            System.out.println(n + " is prime number");
        } else {
            for (int i = 1; i <= Math.sqrt(n); i++) {
                if (n % i == 0) {
                    isPrime = false;
                }
            }

            if (isPrime == true) {
                System.out.println(n + " is not prime");
            } else {
                System.out.println(n + " is not prime");
            }
        }

    }
}