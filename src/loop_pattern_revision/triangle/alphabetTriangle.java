package loop_pattern_revision.triangle;

public class alphabetTriangle {
    public static void main(String[] args) {
        int n = 5;
/*
        A
        B B
        C C C
        D D D D
        E E E E E
        */
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (i + 64) + " ");
            }
            System.out.println();
        }
/*
        A
        A B
        A B C
        A B C D
        A B C D E
    */

        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char) (j + 64) + " ");
            }
            System.out.println();
        }

        /*
            a
            B B
            c c c
            D D D D
            e e e e e

        * */

        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (i + 64) + " ");
                } else {
                    System.out.print((char) (i + 96) + " ");
                }
            }
            System.out.println();
        }


        /*
            a
            A B
            a b c
            A B C D
            a b c d e

        * */

        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print((char) (j + 64) + " ");
                } else {
                    System.out.print((char) (j + 96) + " ");
                }
            }
            System.out.println();
        }
    }
}
