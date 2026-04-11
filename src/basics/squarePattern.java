package basics;

public class squarePattern {
    public static void main(String[] args) {
        int n = 4;
        for (int i=1;i<=4;i++){
            System.out.println("* * * *");
        }

//        using while loop
        System.out.println("Using While loop .....");
        int i =1;
        while(i<=n){
            System.out.println(
                    "* * * *"
            );
            i++;
        }
    }
}
