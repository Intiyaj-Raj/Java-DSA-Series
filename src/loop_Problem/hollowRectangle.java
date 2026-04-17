package loop_Problem;

import java.util.Scanner;

public class hollowRectangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows: ");
        int row = sc.nextInt();
//        int row = 4;

        System.out.print("Enter cols: ");
        int cols = sc.nextInt();
//        int cols = 5;

        System.out.println();

        for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == row || j == 1 || j == cols) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}
