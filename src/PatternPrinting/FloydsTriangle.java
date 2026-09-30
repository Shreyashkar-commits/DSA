package PatternPrinting;

import java.util.Scanner;
public class FloydsTriangle {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row & Column :");
        int n = sc.nextInt();
        int a=1;
        for (int i = 1; i <= n; i++)
        {
            for (int j =1; j <=i; j++)
            {
                System.out.print(a);
                a++;
            }
            System.out.println();
        }
    }
}
