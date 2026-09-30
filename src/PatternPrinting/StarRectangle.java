package PatternPrinting;

import java.util.Scanner;
public class StarRectangle {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row :");
        int Row = sc.nextInt();
        System.out.print("Enter the Number of Column:");
       int col = sc.nextInt();
        for (int i = 1; i <= Row; i++)
        {
                for (int j = 1; j <= col; j++)
                {
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
