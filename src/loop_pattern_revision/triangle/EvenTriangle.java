package loop_pattern_revision.triangle;

public class EvenTriangle {
    public static void main(String[] args) {

        int n = 5;
        int a = 0;
/*
        0
        2 4
        6 8 10
        12 14 16 18
        20 22 24 26 28
            */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(a + " ");
                a += 2;
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
/*
        1
        1 3
        1 3 5
        1 3 5 7
        1 3 5 7 9

            */

        for (int i = 1; i <= n; i++) {
            int b = 1;
            for (int j = 1; j <= i; j++) {
                System.out.print(b + " ");
                b += 2;
            }
            System.out.println();
        }
/*

        0
        0 2
        0 2 4
        0 2 4 6
        0 2 4 6 8

*/

        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            int b = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(b + " ");
                b += 2;
            }
            System.out.println();
        }
    }
}
