package ifelse;

import java.util.Scanner;
public class PerimeterandArea {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Length:");
        double l = sc.nextDouble();
        System.out.print("Enter the Breadth:");
        double b = sc.nextDouble();
        double P = 2 * (l + b);
        System.out.println("Perimeter is " +P);
        double A = (l * b);
        System.out.println("Area is " +A);
        if (A > P) System.out.println("YES");
        else System.out.println("No");
    }
}
