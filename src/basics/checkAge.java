package basics;

import java.util.Scanner;

public class checkAge {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your age: ");
        int age = sc.nextInt();

        if (age>0 && age<=5){
            System.out.println("Baby");
        } else if (age>5 && age<=10) {
            System.out.println("child");
        } else if (age>10 && age<18) {
            System.out.println("teen");
        }
        else{
            System.out.println("Adult, you can vote or drive");
        }
    }
}
