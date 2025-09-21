package loopProblem;

public class BasicProblem {
    public void sumOFNatural(){
        int n = 10;
        int sum = 10;
        for (int i=0;i<=n;i++) {
            sum = sum + i;
        }
        System.out.println("Sum of Natural Number: "+ sum);
    }

    public void countNoOfDigit(){
        int n =1232344;
        int count = 0;
        while(n>0){
            n=n/10;
            count++;
        }
        System.out.println("Number of Digits: "+count);
    }

    public void sumOfDigit(){
        int n = 677;
        int sumOfDigits = 0;
        for(int i=0;i<n;i++){
            sumOfDigits += n%10;
            n = n/10;
        }
        System.out.println("Sum Of Digits: "+sumOfDigits);
    }
    public void reverseNum(){
        int num = 2345;
        int ans = 0;
        while(num>0){
            int last = num%10; // find last digit
            ans = ans*10 + last; // ans*10 + num%10;
            num = num/10;
        }
        System.out.println("Reverse Number: "+ans);
    }
    public void sumOfSeries(){
//        s = 1-2+3-4.......n
//        ans => odd number = add
//                even number = subtract
        int n = 5;
        int ans = 0;
        for (int i=1;i<=n;i++){
            if(i%2==0){
                ans -=i;
            }
            else{
                ans +=i;
            }
        }
        System.out.println("Series of Even and Odd number: "+ans);
    }

    public void fact(){
        int n = 6;
        int fact =1;
        for(int i=1;i<=n;i++) {
            fact = fact * i;
            System.out.println("Fact of " + i + " = " + fact);
        }
    }

//    given 2 number a and b. Find a rasie to the power b.
    public void raisePower(){
        int a =2, b= 5, ans=1;
        for (int i=1;i<=b;i++)
        {
            ans*=a;
        }
        System.out.println("Raise Power: "+ ans);
    }
    public static void main(String[] args) {
        BasicProblem ob = new BasicProblem();
        ob.sumOFNatural();
        ob.countNoOfDigit();
        ob.sumOfDigit();
        ob.reverseNum();
        ob.sumOfSeries();
        ob.fact();
        ob.raisePower();
    }
}
