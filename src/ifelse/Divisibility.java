package ifelse;

import java.util.Scanner;
public class Divisibility {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        if (n % 5 == 0 || n % 3 == 0) System.out.println("Div");
        else System.out.println("Not div");
    }
}
