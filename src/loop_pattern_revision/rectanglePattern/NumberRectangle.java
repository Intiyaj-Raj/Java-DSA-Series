package loop_pattern_revision.rectanglePattern;

public class NumberRectangle {
    public static void main(String[] args) {

        /*
                1 2 3 4 5 6
                1 2 3 4 5 6
                1 2 3 4 5 6
                1 2 3 4 5 6

        */

        int rows = 4;
        int cols = 6;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
            /*
                1 1 1 1 1 1
                2 2 2 2 2 2
                3 3 3 3 3 3
                4 4 4 4 4 4

            */

        System.out.println();
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        System.out.println();
        System.out.println();


        /*
            1 1 1 1 1
            1 2 2 2 1
            1 2 2 2 1
            1 1 1 1 1

        * */
        int n = 4; // rows
        int m = 5; // cols

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }

    }
}
