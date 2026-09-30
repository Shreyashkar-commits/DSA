package basic1;

import java.util.Scanner;

public class square {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number(n):");
        double n= sc.nextDouble();
        double s= n*n;
        System.out.println("Sqaure of Number is:");
        System.out.println(s);
    }
}
