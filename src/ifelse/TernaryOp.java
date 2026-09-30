package ifelse;

import java.util.Scanner;
public class TernaryOp {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
//        if (n%2==0) System.out.println("Even");
//        else System.out.println("Odd");
       // condition (n%2==0) ? sach(Even) : jhoot(jhooth)


        System.out.println((n%2==0) ? "Even" : "Odd");
    }
}
