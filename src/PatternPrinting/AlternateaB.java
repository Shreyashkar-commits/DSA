package PatternPrinting;

import java.util.Scanner;

public class AlternateaB {
    static void main()
    {
        {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the Number of Row & Column :");
            int n = sc.nextInt();
            for (int i = 1; i <= n; i++)
            {
                for (int j = 1; j<=n; j++)
                {
                 if (i%2!=0)   System.out.print((char)(96+i));
                 else System.out.print((char)(64+i));
                }
                System.out.println();
            }
        }
    }
}
