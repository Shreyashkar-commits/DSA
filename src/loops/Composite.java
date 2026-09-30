package loops;

import java.util.Scanner;

public class Composite {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number:");
        int n = sc.nextInt();

        boolean flag = true; // 0 menas prime

        for ( int i=2;i<=Math.sqrt(n);i++) // sqrt ke phle ar bad equal number factor
        {
            if (n% i==0)
            {
                flag = false; // 1 means composite
                break; //
            }
        }
        if (n==1) System.out.println("Neither Composite Nor Prime");
        else if(flag==false) System.out.println("Composite Number");
        else System.out.println("Prime Number");
    }
}
