package ifelse;

import java.util.Scanner;

public class AbsoluteValue {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
//        if (n>=0) {
//            System.out.println(n);
//        }
//        else
//            System.out.println(-n);
        if (n<0) n= -n;
        System.out.println(n);
    }
}
