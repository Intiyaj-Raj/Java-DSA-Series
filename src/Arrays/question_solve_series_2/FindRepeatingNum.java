package Arrays.question_solve_series_2;

/*
*   Given an array 'a' consisting  of integers.Return the first value that is repeating in this array. if no value is beign repeated return -1
*
* */
public class FindRepeatingNum {
    static int FirstRepeatingNum(int[]arr){
        int n = arr.length;

        for (int i=0;i<n;i++){ //  first number
            for (int j=i+1;j<n;j++){ // second number
               if(arr[i] == arr[j]){
                   return arr[i];
               }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] =  {1,2,3,4,3,2,1};
        int arr2[] =  {1,2,3,4};
        System.out.println("Repeating Number: "+FirstRepeatingNum(arr));
        System.out.println("Repeating Number: "+FirstRepeatingNum(arr2));
    }
}
