package Arrays;

public class CopyOfArray {

//    print array element
    static void printArray(int[] arr){
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println("Original Arrays");
        printArray(arr);

//        trying to copy arr to arr2
        int [] arr2 = arr;
        System.out.println("Copied Array: ");
        printArray(arr2);

//        changing some values of arr2
        arr2[0] = 2;
        arr2[1] = 23;
        System.out.println("original arr after changing value arr2");
        printArray(arr);
        System.out.println("copied arr2 after changing arr2");
        printArray(arr2);
    }
}
