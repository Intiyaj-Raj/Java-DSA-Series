package loop_Problem.alphabetPattern;

public class PatternD {
    public static void main(String[] args) {
        int n = 5;

        for (int i = 0; i < n; i++) {          // rows
            for (int j = 0; j < n; j++) {      // columns

                // simple condition for D shape
                if (j == 0 ||                   // left line
                        (i == 0 && j < n - 1) ||    // top line
//                        j < n - 1 helps to avoid an extra star on the last column in the top and bottom rows.
                        (i == n - 1 && j < n - 1) ||// bottom line
//                        i > 0 && i < n - 1 means “don’t draw the right-side line on the top and bottom rows.”
                        (j == n - 1 && i > 0 && i < n - 1)) { // right line

                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(); // next line
        }
    }
}
