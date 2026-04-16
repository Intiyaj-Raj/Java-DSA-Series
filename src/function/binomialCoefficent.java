package function;

public class binomialCoefficent {

    static int findFact(int n){
        int fact = 1;
        for (int i=1;i<=n;i++){
            fact = fact*i;
        }
       return fact;
    }


    static void findBinomialCoefficient(int n,int r){
        int nFact = findFact(n);
        int rFact = findFact(r);
        int n_rFact = findFact(n-r);
        int binomialCoff = nFact/(rFact*n_rFact);
        System.out.println("nCr = " + binomialCoff);
    }


    public static void main(String[] args) {
//        findFact(5);
//        findFact(1);
//        findFact(0);

//        nCr = n! / r! (n-r)

        findBinomialCoefficient(5,2);
        findBinomialCoefficient(12,5);

    }
}
