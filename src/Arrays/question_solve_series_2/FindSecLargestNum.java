package Arrays.question_solve_series_2;

/*
 *       Find the second largest element in the given Array
 *
 *          Note:- jab  bhi maximum nikalne jayenge to minus infinity se initialize karenge (i.e. Interege.MIN_Value)
 *          Note:- jab  bhi minimum nikalne jayenge to plus infinity se initialize karenge (i.e. Interege.Max_Value)
 *
 *
 *          Algorithm :-
 *          find maximum
 *          mark all maximum  minus infinity
 *          find maximum
 * */

public class FindSecLargestNum {

//    finding first maximul number
    static int findMax(int[] arr) {
        int mx = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > mx) {
                mx = arr[i];
            }
        }
        return mx;
    }


//    finding second maximum


    static int  findSecondMax(int[]arr){
        int mx = findMax(arr);
        for (int i=0;i<arr.length;i++){
            if (arr[i] == mx)
            {
                arr[i] = Integer.MIN_VALUE;
            }
        }
        int secondMax = findMax(arr);
        return secondMax;
    }
    public static void main(String[] args) {
        int arr[] = {10,10,5,8,3};
        int arr2[] = {0,0,-2,-3,0,-4};

        System.out.println("Second Maximum Number is: "+findSecondMax(arr));
        System.out.println("Second Maximum Number is: "+findSecondMax(arr2));
    }
}
