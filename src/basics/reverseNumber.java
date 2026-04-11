package basics;

import java.util.Scanner;

public class reverseNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 10899;
        System.out.println("Original Number = "+ n);
        System.out.print("Reverse Number = ");
        while(n>0){
            int lastDigit = n%10;
            System.out.print(lastDigit);
            n = n/10;
        }

//        reverse number given by user


        System.out.println();
        System.out.print("Enter number: ");
        int n2 = sc.nextInt();
        System.out.print("Reverse Number: ");
        while(n2>0){
            int lastDigit = n2%10;
            System.out.print(lastDigit);
            n2 = n2/10;
        }


    }
}
