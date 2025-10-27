package Arrays.question_solve_series3;

// Given 2 integers a and b. Swap tthe 2 given values using temporary variables
//  a = 9 and b = 5
//  a = 5 and b = 9
public class swapTwoValues {


    static void swap(int a, int b) {
        System.out.println("Original value: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        int temp = a;
        a = b;  // a = 5
        b = temp;  // b = 9


        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }


//    swap number without use of third variable
//                    OR

// Given 2 integers a and b.  Swap the 2 given values using sum and difference method

    static void swapMeth2(int a, int b) {
        System.out.println("Original value: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    /*
    *       a = 9;
    *       b = 5;
    * */
        a = a+b;  // a = 9+5 = 14
        b = a-b;  // b = 14-5 = 9
        a = a-b;  // a = 14-9 = 5


        System.out.println("Values after swap: ");
        System.out.println("a: " + a);
        System.out.println("b: " + b);

    }

    public static void main(String[] args) {

        System.out.println("With temp variable");
        swap(9, 5);
        System.out.println("-------------------------------------------");
        System.out.println("Without third variable");
        swapMeth2(9,5);
    }
}
