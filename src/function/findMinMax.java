package function;

public class findMinMax {

    public static void main(String[] args) {
        findMinMax ob = new findMinMax();

        int result = ob.finMinMaxNum(12, 22);
        System.out.println("minimum number = " + result);

        result = ob.finMinMaxNum(22, 44);
        System.out.println("minimum number = " + result);
    }

    int finMinMaxNum(int n1, int n2) {
        int min;
        if (n1 > n2) {
            min = n2;
        } else {
            min = n1;
        }
        return n1;
    }
}
