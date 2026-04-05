package staticKeywordProblem;
//Create a class MathHelper that contains the following static methods:
//
//add(int a, int b) → returns sum
//
//multiply(int a, int b) → returns product
//
//isEven(int n) → returns true if number is even

//Then, write a Main class to test these methods without creating an object of MathHelper.
class MathHelper {


    public static int add(int a, int b) {
        return a + b;
    }


    public static int multiply(int a, int b) {
        return a * b;
    }

    // static method to check if a number is even
    public static boolean isEven(int n) {
//       if (n%2 == 0) {
//            System.out.println(n + " is even");
//        }
        return n % 2 == 0;
    }
}
public class Question2 {
    public static void main(String[] args) {
        System.out.println(MathHelper.add(5, 10));
        System.out.println( MathHelper.multiply(5, 10));
        System.out.println("Even "+  MathHelper.isEven(4));

    }
}
