package operatorsQuestion;

import java.util.Scanner;

public class averageOfThreeNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter three numbers: ");
        float n1 = sc.nextFloat();
        float n2 = sc.nextFloat();
        float n3 = sc.nextFloat();

        double avg = (n1+n2+n3)/3;

        System.out.println(avg);
    }
}
