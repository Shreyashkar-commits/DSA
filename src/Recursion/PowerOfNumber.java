package Recursion;

import java.util.Scanner;

public class PowerOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(pow(a,b));
    }
    static int pow (int a ,int b){
       if (b==0) return 1;
       int call = pow(a,b/2);
       if (b%2==0) return call*call; // same function(pow(a,b/2)*pow(a,b/2)) getting called 2 time paap ho gya
       else return a*call*call;
    }
//    static int pow (int a ,int b){
//        if (b==0) return 1;
//        return a*pow(a,b-1); // O(b) TC
}
