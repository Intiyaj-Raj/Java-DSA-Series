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

        System.out.println();
        System.out.println("--------------------------------------------------");

        /*
        *
        *           +
                   + +
                  +++++
                 +     +
                +       +


        * */
        // for rows 1 to 5
        for (int i=1;i<=5;i++)
        {
            // for cols 1 to 9
            for (int j=1;j<=9;j++)
            {
                /*
                        j == 6 - i
                        Draws a left diagonal line

                        j == 4 + i
                        Draws a right diagonal line

                        i == 3 && j >= 3 && j <= 7
                        When i = 3, it draws a horizontal line from column 3 to 7.
                */
                if (j == 6 - i || j == 4 + i || (i == 3 && j >= 3 && j <= 7)) {
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
