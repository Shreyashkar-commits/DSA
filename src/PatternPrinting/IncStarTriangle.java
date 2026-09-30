package PatternPrinting;

import java.util.Scanner;
public class IncStarTriangle {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row & Column :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=i; j++) { // for reverse for (int j = 0; j <= n-i; j++)
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
