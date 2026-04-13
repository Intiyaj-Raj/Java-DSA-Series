package function;

public class findFactorial {

    static int calculateFact(int n){
        int fact = 1;

        for (int i = 1; i <= n; i++){
            fact = fact * i;
        }

        return fact;
    }

    public static void main(String[] args) {

        int result = calculateFact(0);
        System.out.println("Factorial = " + result);


         result = calculateFact(5);
        System.out.println("Factorial = " + result);
    }
}