package Arrays.question_solve_series3;

//Rotate the given array 'a' by k steps where k is non negative without using extra space
//       Note: k > n as well.

public class RotateArray {

static int[] rotate(int[] arr, int k){
    int n = arr.length;
    k = k %n;
    int [] ans = new int[n];
    int j =0;

    for (int i=n-k; i<n; i++){
        ans[j++] = arr[i];
    }
    for (int i=0;i<n-k;i++){
        ans[j++] = arr[i];
    }
    return ans;
}
    public static void main(String[] args) {

    int arr[] = {1,2,3,4,5};
    int k = 102;
    int ans[] = rotate(arr,k);

//    print array

        System.out.println("Original Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(arr[i]+ " ");
        }

        System.out.println("Rotate Array: ");
        for (int i=0;i<arr.length;i++){
            System.out.print(ans[i]+ " ");
        }

    }
}
