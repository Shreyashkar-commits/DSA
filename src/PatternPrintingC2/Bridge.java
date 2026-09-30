import java.util.Scanner;

public class Bridge {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        // First row
        for (int i = 1; i <= 2 * n - 1; i++) {
            System.out.print("* ");
        }
        System.out.println();
        int nsp = 1;
        // Remaining rows
        for (int i = 1; i <= n - 1; i++) {
            // Left stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            // Middle spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            // Right stars
            for (int j = 1; j <= n - i; j++) {
                System.out.print("* ");
            }
            nsp += 2;
            System.out.println();
        }
    }
}