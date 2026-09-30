package ifelse;

import java.util.Scanner;

public class FourDigitNuber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if (n>999 && n<10000) System.out.println("4 digit Number");
        else System.out.println("Not a 4 digit");
    }
}
// n%1000 == n not 4 digit