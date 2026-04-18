package loop_pattern_revision.rectanglePattern;

public class AlphabetRectangle {
    public static void main(String[] args) {

        int n = 5;
        int m = 6;


        /*
            A B C D E F
            A B C D E F
            A B C D E F
            A B C D E F
            A B C D E F


        * */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();
        /*
            a b c d e f
            a b c d e f
            a b c d e f
            a b c d e f
        */

        for (int i = 1; i < n; i++) {
            for (int j = 1; j <= m; j++) {
                System.out.print((char) (j + 96) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();



    }
}



