package loop_pattern_revision.specialPattern;

public class TriangleFlippedPattern {
    public static void main(String[] args) {

        int n = 5;

        for (int i=1;i<=n;i++){
            // print spaces
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            // print stars
            for (int j =1;j<=i;j++){
                System.out.print("* ");
            }

            // new line
            System.out.println();
        }
    }
}
