package loop_Problem;

public class butterflyPattern {
    static void butterfly(int n) {

        for (int i = 1; i <= n; i++) {
            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            //for stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = n; i >= 1; i--) {
            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //  print spaces
            for (int j = 1; j <= 2 * (n - i); j++) {
                System.out.print(" ");
            }

            // print stars
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        butterfly(4);

        System.out.println();
        System.out.println();
        butterfly(5);

        System.out.println();
        System.out.println();
        butterfly(6);
    }
}
