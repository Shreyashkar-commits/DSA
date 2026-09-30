package loops;

import java.util.Scanner;

public class Gp {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number of term :");
        int n = sc.nextInt();
        System.out.print("Enter the First Term:");
        int a = sc.nextInt();
        System.out.print("Enter the Common Ratio:");
        int r = sc.nextInt(); // a,d use only when we know number of terms
        for (int i =1 ;i<=n;i++){
            System.out.print(a+" ");
            a *=r ;
        }

    }
}