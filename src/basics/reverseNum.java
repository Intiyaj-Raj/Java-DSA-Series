package basics;

public class reverseNum {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println("original number = "+n);
        int rev = 0;
        while (n > 0) {
            int lastDigit = n % 10;
            rev = (rev * 10) + lastDigit;
            n = n / 10;
        }
        System.out.println("reverse number = " + rev);
    }
}
