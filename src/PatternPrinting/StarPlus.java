package PatternPrinting;

import java.util.Scanner;

public class StarPlus {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row & Column :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j =1; j <= n; j++)
            {
             if (i==0.5*(n+1) || j==0.5*(n+1)  )
                 System.out.print("* ");
                     else System.out.print("  ");
            }
            System.out.println();
        }
    }
}
