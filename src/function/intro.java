package function;

import java.util.Scanner;

public class intro {
    public static void greet() {
        System.out.println("Good Morning");
        System.out.println("Hii, How are you?");
    }

    public static void calculateSum() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        System.out.println("sum = " + sum);
    }

    public static void main(String[] args) {
        greet();
        calculateSum();
    }


}
