package function;

public class primeNumber {

//    static boolean checkPrime(int n) {
//
//        boolean isPrime = true;
//        if (n == 1) {
//            return false;
//        }
//        for (int i = 2; i < n; i++) {
//            if (n % i == 0) {
//                isPrime = false;
//            }
//        }
//        return isPrime;
//    }


//    second method


    static boolean checkPrime(int n) {
        if(n==1) {
            return false;
        }
        if (n == 2) {
            return true;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


/*

        suppose n = 6;
        factor of 6 = 1x2
        factor of 6 = 2x3
        factor of 6 = 3x2
        factor of 6 = 6x1

        here, factor repeat ho raha hai
        so, we use optimized loop to solve this problem


           root(n)

*/


    static boolean checkPrimeNum(int n){
        if (n==1)
            return false;

        if (n==2)
            return true;

        for (int i=2;i<Math.sqrt(n);i++){
            if (n%i==0)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {


//        System.out.println(checkPrime(5));
        System.out.println(checkPrime(1));
        System.out.println(checkPrime(2));
        System.out.println(checkPrime(23));
        System.out.println(checkPrime(22));
        System.out.println(checkPrime(2212));

        System.out.println();
        System.out.println("optimized method");
        System.out.println();
        System.out.println(checkPrimeNum(1));
        System.out.println(checkPrimeNum(2));
        System.out.println(checkPrimeNum(23));
        System.out.println(checkPrimeNum(22));
        System.out.println(checkPrimeNum(2212));


    }
}

