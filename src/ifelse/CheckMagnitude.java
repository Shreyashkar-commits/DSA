package ifelse;

import java.util.Scanner;

public class CheckMagnitude {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if (n < 0) n = -n;
        if (n > 69) System.out.println("False");
        else System.out.println("True");
    }
}
