package basics;

import java.util.Scanner;

public class checkVowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Character: ");
        char ch = sc.next().charAt(0);

        switch (ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("Vowel");
                break;

            default:
                System.out.println("is not vowel");
        }
    }
}
