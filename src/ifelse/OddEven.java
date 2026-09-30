package ifelse;

import java.util.Scanner;

public class OddEven {
    static void main() {
        Scanner sc = new Scanner(System.in); // scanner se number input lete hai
        System.out.print("Enter Number:");
        int n = sc.nextInt();
        if(n%2==0) {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd Number");
        }
    }
}
