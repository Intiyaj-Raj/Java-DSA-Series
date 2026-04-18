package loop_pattern_revision.square;

public class numberSquare {
    public static void main(String[] args) {
        int n = 4;
            /*
                1 1 1 1
                2 2 2 2
                3 3 3 3
                4 4 4 4
            */

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

 /*
        1 2 3 4
        1 2 3 4
        1 2 3 4
        1 2 3 4

        */
        System.out.println();
        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        /*
            1 1 1 1
            1 2 2 1
            1 2 2 1
            1 1 1 1
        */
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == 1 || j == 1 || i == n || j == n) {
                    System.out.print("1 ");
                } else {
                    System.out.print("2 ");
                }
            }
            System.out.println();
        }
        /*
            1 1 1 1
            2 2 2 2
            1 1 1 1
            2 2 2 2
        */

        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    System.out.print("2 ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}
