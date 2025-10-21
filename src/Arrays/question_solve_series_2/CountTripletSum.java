package Arrays.question_solve_series_2;

import java.util.Scanner;

public class CountTripletSum {
//    Count the number of triplet whose sum is equal to the given value x.

    static int countTriplet(int arr[], int target){
        int n = arr.length;
        int ans =0;
        for (int  i=0;i<n;i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == target) {
                        ans++;
                    }
                }
            }

        }
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Size of the Array: ");
        int n = sc.nextInt();
        System.out.println("Enter Array Element: ");
        int[] arr = new int[n];
        for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter Target Element: ");
        int x = sc.nextInt();
        System.out.println("Your Answer is : ");
        System.out.print(countTriplet(arr,x));
    }
}
