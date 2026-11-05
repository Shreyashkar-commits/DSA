package Recursion;

public class Reverse {
    static int reverse (int n , int r){
        if (n==0) return r;
       return reverse(n/10,r*10+n%10);
    }
    static void main() {
        int n = 2345;
        System.out.println(reverse(n,0));
    }
}
