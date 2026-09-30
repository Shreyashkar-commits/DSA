package Methods;

import java.util.Scanner;
public class MaxOf4 {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        System.out.println("Max Number will be:");
        System.out.println(Math.max(Math.max(a, b), Math.max(c, d)));
    }
}