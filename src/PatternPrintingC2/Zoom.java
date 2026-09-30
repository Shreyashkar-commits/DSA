package PatternPrintingC2;

import java.util.Scanner;
public class Zoom {
    static void main()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number of Row & Column :");
        int n = sc.nextInt();
        for (int i = 1; i <=2*n-1; i++) {
            for (int j = 1; j <=2*n-1; j++) {
                int a=i,b=j;
                if (a>n) a=2*n-a;
                if (b>n) a=2*n-b;
                System.out.print(Math.min(a,b)+" "); //Ternary (i<j) ? i: j+" "
            }
            System.out.println();
        }
    }
}
