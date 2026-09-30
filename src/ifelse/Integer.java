package ifelse;

import java.util.Scanner;

public class Integer {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        double n =sc.nextDouble();
        int x = (int)n;
        if(n-x==0) System.out.println("Is a Integer");
        else System.out.println("Not a Integer");
    }
}
