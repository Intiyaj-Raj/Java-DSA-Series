package Arrays;

import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
//        decleration of array
        int arr[] = new int [5];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;
        arr[4] = 50;
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();

//        another way to create array
        int[] ar = {10, 20, 30, 40};

//        Take input in array
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter Size of Array: ");
//        int size = sc.nextInt();
//        int [] a = new int[size];
////        for input
//        for (int i=0;i<a.length;i++){
//            a[i] = sc.nextInt();
//        }
////        print array
//        for (int i=0;i<a.length;i++){
//            System.out.print(a[i]+ " ");
//        }

        int arr2 [] = new int[4];
//        By default, all elements are 0: arr2 => [0, 0, 0, 0].
        System.out.println("Print array without assigning values");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] +" ");
        }
        System.out.println();
        arr2[0] = 14;
//        Set the first element => 14.
//        Index:   0   1  2  3
//        arr2 => [14, 0, 0, 0].
        arr2[2] = 10;
//        Set the third element => 10.
//        Index:   0   1  2   3
//        arr2 => [14, 0, 10, 0].

        System.out.println("array after assign value");
        for (int i=0;i<arr2.length;i++){
            System.out.print(arr2[i] +" ");
        }
    }
}
