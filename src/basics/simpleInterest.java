package basics;

import java.util.Scanner;

public class simpleInterest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter price , rate and time ....");
        float p = sc.nextFloat(); // price
        float r = sc.nextFloat(); // rate
        float t = sc.nextFloat();  // time

        double result = (p * r * (t)) / 100;

        System.out.println(result);


    }
}
