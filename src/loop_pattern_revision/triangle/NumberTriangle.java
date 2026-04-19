package loop_pattern_revision.triangle;

public class NumberTriangle {
    public static void main(String[] args) {

        int n = 5;

         /*
                1
                2 2
                3 3 3
                4 4 4 4
                5 5 5 5 5
`
            */


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

            /*
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
            */
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
                1
                2 1
                3 2 1
                4 3 2 1
                5 4 3 2 1
`
            */

        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        /*
                5 5 5 5 5
                4 4 4 4
                3 3 3
                2 2
                1

        */

        System.out.println();
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }


            /*
                1 2 3 4 5
                1 2 3 4
                1 2 3
                1 2
                1
`
            */
        System.out.println();
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

            /*
                5 4 3 2 1
                4 3 2 1
                3 2 1
                2 1
                1
            */
        System.out.println();
        System.out.println();
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
