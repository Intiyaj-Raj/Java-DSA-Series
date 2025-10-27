package Arrays.question_solve_series3;

//Reverse Array Without Another Variable

public class ReverseArray2 {

    static void swapInArray(int[] arr,  int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void reverseArrayInplace (int []arr){

        int i = 0;
        int j = arr.length-1;

        while(i<j){
            swapInArray(arr, i,j);
            i++;
            j--;
        }
    }
    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6};

        reverseArrayInplace(arr);;

//        print array
        System.out.println("Reverse Array Inplace:");

        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}

