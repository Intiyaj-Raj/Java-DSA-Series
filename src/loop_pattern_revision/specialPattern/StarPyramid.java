package loop_pattern_revision.specialPattern;

public class StarPyramid {
    public static void main(String[] args) {
        int n = 5;


//        method 1

                for (int i=1;i<=n;i++){
            // print spaces
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }

            // print stars
            for (int j=1;j<=2*i-1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }


//                method 2


        System.out.println();
        System.out.println();

        n = 8;
        int nst = 1; // number of stars
        for (int i=1;i<=n;i++){
            for (int j=1;j<=n-i;j++){
                System.out.print("  ");
            }
            for (int j=1;j<=nst;j++){
                System.out.print("* ");
            }
            nst+=2;
            System.out.println();
        }
    }
}
