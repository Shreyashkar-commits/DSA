package PatternPrintingC2;
import java.util.Scanner;
public class PyramidM2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Rows: ");
        int n = sc.nextInt();
        int nsp = n - 1;
        int nst = 1;
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= nsp; j++) {
                System.out.print("  ");
            }
            // stars
            for (int j = 1; j <= nst; j++) {
                System.out.print("* ");
            }
            nsp--;
            nst += 2;
            System.out.println();
        }
    }
}