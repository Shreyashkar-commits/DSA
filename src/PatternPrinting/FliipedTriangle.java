package PatternPrinting;

import java.util.Scanner;

public class FliipedTriangle {
    static void main()
    {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number of Row & Column :");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j =1; j <= n+1-i; j++) {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
}
