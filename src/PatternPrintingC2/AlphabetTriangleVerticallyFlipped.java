package PatternPrintingC2;

import java.util.Scanner;
public class AlphabetTriangleVerticallyFlipped {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row & Column: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(i+64) + " ");
            }
            System.out.println();
        }
    }
}
