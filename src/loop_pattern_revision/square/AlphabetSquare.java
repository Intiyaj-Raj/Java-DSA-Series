package loop_pattern_revision.square;

public class AlphabetSquare {
    public static void main(String[] args) {

        int n = 4;
        /*
            A A A A
            B B B B
            C C C C
            D D D D
        */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


                /*
                    a a a a
                    B B B B
                    c c c c
                    D D D D
                */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (i + 64) + " ");
                } else {
                    System.out.print((char) (i + 96) + " ");
                }
            }
            System.out.println();
        }

    }
}
