package loopProblem.alphabetPattern;

public class PatternA {

    public static void main(String[] args) {
        int n = 6;

        /*
        *        ******
                 *    *
                 *    *
                 ******
                 *    *
                 *    *
         * */
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i==n/2 || j==0 || j==n-1 ) {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }



        /*
        *
        *           +
                   + +
                  +++++
                 +     +
                +       +


        * */
        for (int i=1;i<=5;i++)
        {
            for (int j=1;j<=9;j++)
            {
                if(j==6-i || i==3 && j>=3 && j<=7 || j==4+i){
                    System.out.print("+");
                }
                else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
