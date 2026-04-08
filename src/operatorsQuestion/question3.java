package operatorsQuestion;

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the cost of  pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter the cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter the cost of eraser: ");
        float eraser = sc.nextFloat();


        float total = pen+pencil+eraser;
        System.out.println("Total Bill: "+ total);

        float newTotal =total + (0.18f*total);

        System.out.println("Bill with 18% tax: "+newTotal);




    }
}
