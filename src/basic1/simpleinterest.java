package basic1;

import java.util.Scanner;

public class simpleinterest {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of p:");
        System.out.println("Enter the value of r:");
        System.out.println("Enter the value of t:");
        double p = sc.nextDouble();
        double r = sc.nextDouble();
        double t = sc.nextDouble();
        double S = 1.0/100.0*(p*r*t);
        System.out.println("Simple Interest will be:");
        System.out.println(S);
    }
}
