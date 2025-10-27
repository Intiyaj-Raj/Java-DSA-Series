package Arrays.question_solve_series3;

public class ReverseArray {

    static int[] revArr(int [] arr) {
        int n = arr.length;

        int [] ans = new  int[n];
//        int j =0;
//
//  0      // traverse original array in reverse direction
//        for (int i = n-1; i >=0; i--) {
//            ans[j++] = arr[i];
//        }
//        return ans;
//

        int i =n-1, j =0;
        while(i>=0){
            ans[j++] = arr[i];
            i--;
        }
        return ans;
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6};
        int [] ans = revArr(arr);
//        print array
        System.out.println("Reverse Array: ");
        for (int i=0;i< arr.length;i++){
            System.out.print(ans[i] + " ");
        }
    }
}
