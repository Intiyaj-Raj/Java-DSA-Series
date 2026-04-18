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

        /*
            A A A A
            B B B B
            C C C C
            D D D D
        */
        System.out.println();
        System.out.println();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i % 2 == 0) {
                    int a = i+97;
                    System.out.print((char) (a) + " ");
                    a+=2;
                } else {
                    System.out.print((char) (i + 64) + " ");
                }
            }
            System.out.println();
        }
    }
}
