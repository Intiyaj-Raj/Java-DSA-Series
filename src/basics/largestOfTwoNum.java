package basics;

public class largestOfTwoNum {
    public static void main(String[] args) {
        int a = 23;
        int b = 32;

        if (a>b){
            System.out.println(a+" is largest of " +b);
        } else if (a<b) {
            System.out.println(b + " is largest of "+ a);
        }
        else{
            System.out.println("both are eauals");
        }
    }
}
