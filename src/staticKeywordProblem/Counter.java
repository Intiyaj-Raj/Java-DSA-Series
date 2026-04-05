package staticKeywordProblem;
//Write a Java program to count how many objects of a class have been created using a static variable.
//Each time an object is created, increase the count and display the total number of objects created so far

public class Counter {

    static int count = 0;

    Counter(){
        count++;
        System.out.println(count);
    }

    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c4 = new Counter();
        Counter c5 = new Counter();
        Counter c6 = new Counter();
        Counter c7 = new Counter();

    }
}
//Create a class MathHelper that contains the following static methods:
//
//add(int a, int b) → returns sum
//
//multiply(int a, int b) → returns product
//
//isEven(int n) → returns true if number is even
//
//
//Then, write a Main class to test these methods without creating an object of MathHelper.