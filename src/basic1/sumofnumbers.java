package basic1;

import java.util.Scanner;

public class sumofnumbers {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number:");
        System.out.println("Enter 2nd number:");
        System.out.println("Enter 3rd number:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println("Sum of three numbers:");
        System.out.println(a+b+c);

    }
}
