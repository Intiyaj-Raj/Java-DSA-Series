package loopProblem;
/*
           1234567
           2345671
           3456712
           4567123
           5671234
           6712345
           7123456
       * */
public class NumericalPattern {
    public void numRect(){
        System.out.println("num rectangle");
        int n =7;
        for (int i=1;i<=n;i++){
            for (int j=i;j<=n;j++){
                System.out.print(j);
            }
            for (int k=1;k<=i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }

    /*
        123456
        123456
        123456
        123456
    * */
    public void numRect2(){
        System.out.println("number rectangle");
        int n = 6;
        for (int i=1;i<=4;i++){
            for (int j=1 ;j<=n;j++){
                System.out.print(j);
            }
            System.out.println();
        }
        System.out.println();
    }

    /*
         121212
         212121
         121212
         212121
     * */
    public void numRect3() {
        System.out.println("num rectangle");
        int n = 6;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= n; j++) {
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("2");
                }
            }
            System.out.println("");
        }
    }

    /*
            1
            12
            123
            1234
    * */

    public void numTri(){
        System.out.println("num triangle");
        int n=4;
        for (int i=1;i<=n;i++){
            for (int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println("");
        }
    }

    /*
         1
        121
       12321
      1234321
    * */

    public void numPyramid(){
        System.out.println("num pyramid");
        int n=4;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // increasing numbers
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }

            // decreasing numbers
            for (int l = i - 1; l >= 1; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }
    public void hollowPyramid(){
        int n = 4; // number of rows

        for (int i = 1; i <= n; i++) {
            // spaces before numbers
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // left side numbers
            for (int k = 1; k <= i; k++) {
                if (k == 1 || i == n) {
                    System.out.print(k);
                } else {
                    System.out.print(" ");
                }
            }

            // right side numbers
            for (int l = i - 1; l >= 1; l--) {
                if (l == 1 || i == n) {
                    System.out.print(l);
                } else {
                    System.out.print(" ");
                }
            }

            System.out.println();
        }
    }
    public static void main(String[] args) {
        NumericalPattern ob = new NumericalPattern();
        ob.numRect();
        ob.numRect2();
        ob.numRect3();
        ob.numTri();
        ob.numPyramid();
        ob.hollowPyramid();
    }
}
