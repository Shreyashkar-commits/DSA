package Methods;

import java.util.Scanner;

public class Maxof3BuiltIn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Max Number will be :");
        System.out.println(Math.max(Math.max(a, b), c));
    }
}