package ifelse;

import java.util.Scanner;

public class TraingleSide {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First side:");
        int a= sc.nextInt();
        System.out.print("Enter the Second side:");
        int b= sc.nextInt();
        System.out.print("Enter the Third side:");
        int c= sc.nextInt();;
        if (a+b>c && b+c>a && a+c>b) System.out.println("Sides of Triangle");
        else System.out.println("Not a Sides of Triangle");
    }
}
