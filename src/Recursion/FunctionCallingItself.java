package Recursion;

import java.util.Scanner;

public class FunctionCallingItself {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(5);
    }

    static void print (int n){
        if (n == 0) return ;
        System.out.println(n);
        print (n-1);
    }

}
