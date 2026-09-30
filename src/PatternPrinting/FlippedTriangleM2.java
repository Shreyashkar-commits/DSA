package PatternPrinting;

import java.util.Scanner;

public class FlippedTriangleM2 {
    static void main() {
        {
            {
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter the Number of Row & Column :");
                int n = sc.nextInt();
                int a = n; // no of starts to be printed in each line
                for (int i = 1; i <= n; i++)
                {
                    for (int j =1; j <=a; j++)
                    {
                        System.out.print("* ");
                    }
                    a--;
                    System.out.println();
                }
            }
        }
    }
}
