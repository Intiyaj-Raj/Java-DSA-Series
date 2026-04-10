package basics;

import java.util.Scanner;

public class print1to10 {
    public static void main(String[] args) {
        int n = 1;

        while (n <= 10) {
            System.out.println(n);
            n++;
        }

//        print number 1 to n

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter last value: ");
        int lastValue = sc.nextInt();
        while (n <= lastValue) {
            System.out.println(n);
            n++;
        }


    }
}
