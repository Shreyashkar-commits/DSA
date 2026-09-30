package PatternPrinting;

import java.util.Scanner;

public class HollowRectangle {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the m :");
        int m = sc.nextInt();
        System.out.print("Enter the n:");
        int n = sc.nextInt();
        for (int i = 1; i <= m; i++)
        {
            for (int j = 1; j <= n; j++)
            {
            if(i==1 || i ==m || j==1 || j ==n)
                System.out.print("* ");
                else System.out.print("  ");

            }
                System.out.println();
            }

    }
}
