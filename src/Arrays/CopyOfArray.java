package Arrays;

import java.util.Arrays;

public class CopyOfArray {

//    print array element
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    static void changeArray(int [] arr){
        for (int i=0;i<arr.length;i++){
            arr[i] = 0;
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 11;
        arr[1] = 22;
        arr[2] = 33;
        arr[3] = 44;
        System.out.println("Original Arrays");
        printArray(arr);

//        trying to copy arr to arr2
//        int [] arr2 = arr; // shallow copy of array
//        Here, both array arr and arr2 point same address

//        method 1
//        int [] arr2 = arr.clone(); // deep copy of array
//        Here, both array arr and arr2 point two different address
//      Here, both array arr and arr2 point same address

//        method 2:
        int [] arr2 = Arrays.copyOf(arr, arr.length);
        System.out.println("Copied Array: ");
        printArray(arr2);

//        changing some values of arr2
        arr2[0] = 2;
        arr2[1] = 23;
        System.out.println("original arr after changing value arr2");
        printArray(arr);
        System.out.println("copied arr2 after changing arr2");
        printArray(arr2);

//        changeArray(arr);
//        printArray(arr);
    }
}
