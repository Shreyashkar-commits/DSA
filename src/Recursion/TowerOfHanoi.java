package Recursion;
public class TowerOfHanoi {
    public static void main(String[] args) {
        hanoi(3, 'A', 'B', 'C');
    }
    private static void hanoi(int n, char a, char b, char c) {
        if (n == 0) return;
        hanoi(n - 1, a, c, b);        // Move n-1 disks from A to B via C
        System.out.println(a + " -> " + c);        // Move largest disk from A to C
        hanoi(n - 1, b, a, c);        // Move n-1 disks from B to C via A
    }
}