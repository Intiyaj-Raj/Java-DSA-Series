package oops_problem;

//Create a class MathOperation having multiple add() methods with different parameters.

class MathOperation {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

   
}

public class Question9 {

	 public static void main(String[] args) {
	        MathOperation m = new MathOperation();
	        System.out.println(m.add(5, 10));
	        System.out.println(m.add(2.5, 3.7));
	        System.out.println(m.add(1, 2, 3));
	    }
}
