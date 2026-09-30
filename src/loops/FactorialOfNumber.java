package loops;

import java.util.Scanner;

public class FactorialOfNumber {
    static void main() {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int fact=1; //variable
        for (int i = 1; i <=n ; i++) {
            fact*=i;
        }
        System.out.println(fact);
    }
}
