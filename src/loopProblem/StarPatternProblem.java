package loopProblem;

public class StarPatternProblem {
    public void rectangle(){
        /*
            * * * * * *
            * * * * * *
            * * * * * *
         */

        int row = 3;
        int col =6;
        for(int i=0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public void hollowRect(){
        /*
            * * * * * *
            *         *
            *         *
            * * * * * *
         */
        int row = 4;
        int col = 6;

        System.out.println("Hollo Rect:");
        for (int i=1;i<=row;i++){
            for (int j=1;j<=col;j++) {
                if (i == 1 || i==row || j == 1   || j==col) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    /*
        *
        * *
        * * *
        * * * *
    * */
    public void triangle(){
        System.out.println("Triangle:");
        int n = 4;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /*
        * * * *
        * * *
        * *
        *
    */

    public void triangle2(){
        System.out.println("Triangle Two");
        int n =4;
        for (int i=n;i>=0;i--){
            for (int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }

    /*
                *
               ***
              *****
             *******
    */

    public void pyramid(){
        System.out.println("Pyramid");
        int n = 4;
        for(int i=1;i<=n;i++){ // traversing over rows

//                print n-i spaces
                for (int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
//                print 2*i-1
               for (int k=1;k<=2*i-1;k++){
                   System.out.print("*");
               }
               System.out.println();
        }
    }
    public static void main(String[] args) {
        StarPatternProblem ob = new StarPatternProblem();
        ob.rectangle();
        ob.hollowRect();
        ob.triangle();
        ob.triangle2();
        ob.pyramid();
    }
}
