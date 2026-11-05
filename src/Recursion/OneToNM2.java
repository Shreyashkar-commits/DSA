package Recursion;

import java.util.Scanner;
public class OneToNM2 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    static void print (int n) {
        if (n == 0) return;
        print(n - 1);
        System.out.print(n+" ");
    }
}
