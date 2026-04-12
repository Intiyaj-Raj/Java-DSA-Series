package loop_Problem;

import java.util.Scanner;

public class loopsPracticeQuestionP2 {
    public static void main(String[] args) {

        //        Question 3 : Write a program to find the factorial of any number entered by the user.
//        (Hint : factorial of a number n = n * (n-1) * (n-2) * (n-3) * …… * 1 and exists for positive numbers
//        only. We write factorial as n!
//                So, factorial of 0! = 1, 1! = 1, 2! = 2, 3! = 6, 4! = 24 and so on.
//                Note - Please do not confuse factorial with NOT EQUAL TO operator, they are not the same)

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int fact = 1;
        if (n>=0){
            for (int i =1;i<=n;i++){
                fact = fact*i;
            }
            System.out.println("factorial of "+ n+ " = " + fact);
        }
        else{
            System.out.println("Enter a valid number");
        }


//        Question 4 : Write a program to print the multiplication table of a number N, entered by the
//        user.

        System.out.println("enter multiplication number: ");
        int mulNum = sc.nextInt();
        for (int i=1;i<=10;i++)
        {
            System.out.println(mulNum*i
            );
        }



    }
}
