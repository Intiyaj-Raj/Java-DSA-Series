package basics;

import java.util.Scanner;

public class forLoop {
    public static void main(String[] args) {

//        print 10 times helloWorld
        for (int i=1;i<10;i++){
            System.out.println("helloWorld");
        }

//        pritn 1 to 10 number

        for (int i = 1;i<=10;i++){
            System.out.println(i);
        }

//        print number from 1 to n
        System.out.println("Enter range: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1;i<=n;i++){
            System.out.println(i);
        }
    }
}
