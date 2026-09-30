package Array;

public class PassingArrayToMethods {
    static void main() {
        int [] x= {10, 3, 29, 38};
        System.out.println(x[2]);
        change(x);
        System.out.println(x[2]);
    }
    public static void change(int[] y) {
        y[2] = 99;
    }
}
// pass by reference