package Arrays.question_solve_series1;

import java.util.Arrays;

public class BasicProblem {
//    Question count x;
    static int countOf(int[] arr, int x){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                count++;
            }
        }
        return count;
    }

//    find the last occurrence of an element x in a given array
    static int lastOccurence(int []arr, int x){
        int lastIndex = -1;
        for (int i=0;i<arr.length;i++){
            if (arr[i] == x){
                lastIndex = i;
            }
        }
        return lastIndex;
    }

    static void countGreaterNum(int []arr, int x){
        int count = 0;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>x){
                count++;
            }
        }
        System.out.println(count+" number is greater than "+ x);
    }
    static void isSorted(int arr[]){
        boolean check = true;
        for (int i = 1; i<arr.length;i++){
            /*
            * i = 0;
            * arr[0] < arr[-1]
            * so we check 2 element not first element
            * */
            if (arr[i]<arr[i-1]){
                // not sorted
                check = false;
                break;
            }
        }
        System.out.println("Is Sorted: "+ check);
    }

//    find smallest and largest element
    static int[] smallestAndLargestElement(int[]arr){
        Arrays.sort(arr);
        int[] ans = {arr[0], arr[arr.length-1]};
        return ans;
    }
    public static void main(String[] args) {
        int arr[] = {13,12,11,12,9};
        int arr2[] = {10,10,20,30};
        int x1  = 12  ;
        int x2  = 2;
        System.out.println("count of x1: "+countOf(arr,x1));
        System.out.println("count of x2: "+countOf(arr,x2));
        System.out.println("last occurrence of x1: "+lastOccurence(arr,x1));
        countGreaterNum(arr,x1);
        isSorted(arr);
        isSorted(arr2);
        int[] ans = smallestAndLargestElement(arr);
        System.out.println("Smallest: "+ ans[0]+"\nLargest: "+ans[1]);
    }
}
