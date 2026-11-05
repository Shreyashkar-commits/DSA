package Recursion;

public class PreeInPost {
    static void main() {
        pip(2);
    }

    private static void pip(int n) {
        if (n==0) return ;
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
        pip(n-1);
        System.out.print(n+" ");
    }
}
