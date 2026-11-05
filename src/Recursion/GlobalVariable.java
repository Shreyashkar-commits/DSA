package Recursion;

public class GlobalVariable {
    static  int x =10; // global variable
    static void main() {
        change();
        x=9;
        System.out.println(x);
        int x =4; // local variable ()
        System.out.println(x);
        x=6;
    }
    static void  change() {
        x =20;
    }
}
