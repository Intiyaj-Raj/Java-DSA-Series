package Arrays.question_solve_series_2;

import java.util.Scanner;

public class CountPariSum {
    // find the total number of pairs in the Array whose sum  is equal  to the given value x.
    // for example targeted value =  7;

    static int pairSum(int[]arr ,int target){
        int n = arr.length;
        int ans =0;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]+arr[j] == target){
                    ans++;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt(); // size of the length;
        System.out.println("Enter Array Element");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter target Sum: ");
        int target = sc.nextInt();
        System.out.println(pairSum(arr,target));
    }
}
