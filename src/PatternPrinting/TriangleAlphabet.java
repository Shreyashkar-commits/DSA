package PatternPrinting;

import java.util.Scanner;

public class TriangleAlphabet {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row & Column :");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j<=i; j++)
            {
                System.out.print((char)(i+64)+" ");// a=97
            }
            System.out.println();
        }
    }
}
