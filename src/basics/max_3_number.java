package basics;

import java.util.Scanner;

public class max_3_number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int n1 = sc.nextInt();
        System.out.print("Enter num2: ");
        int n2 = sc.nextInt();
        System.out.print("Enter num3: ");
        int n3 = sc.nextInt();

        if (n1>n2 && n1>n3){
            System.out.println(n1 + " is greater than " + n2+" and " + n3);
        } else if (n2>n1 && n2>n3) {
            System.out.println(n2 +" is greater than "+ n1+ " and "+ n3);
        }
        else if (n3>n1 && n3>n2){
            System.out.println(n3 + " is greater than " + n1 +" and "+ n2);
        }
        else{
            System.out.println("all numbers are equal");
        }


//        another logic


        int a =11;
        int b = 11;
        int c = 11;

        if ((a>=b) && (a>=c)){
            System.out.println("Largest is A.");
        } else if (b>=c) {
            System.out.println("largest is B.");
        }
        else{
            System.out.println("Largest is C.");
        }
    }
}
