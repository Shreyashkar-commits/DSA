package ifelse;

import java.util.Scanner;
public class GreatestNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number:");
        int a = sc.nextInt();
        System.out.print("Enter the Second Number:");
        int b = sc.nextInt();
        System.out.print("Enter the Third Number:");
        int c = sc.nextInt();
        if (a >= b) {
            if (a >= c)
                System.out.println(a);
            else
                System.out.println(c);
        } else { // b > a
            if (b >= c)
                System.out.println(b);
            else
                System.out.println(c);
        }
    }
}
