package Recursion;

import java.util.Scanner;

public class OneTONUsingGlobal {
    static int n ;  // in tech interview avoid using global
    static void main() {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        print(1);
    }
    static void print(int x){
        if (x>n) return;
        System.out.print(x+" ");
        print(x+1);
    }
}
