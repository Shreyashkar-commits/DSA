package ifelse;

import java.util.Scanner;

public class TernaryIn {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
//        int shrey;
//        if (n>0) shrey=12;
//        else shrey= 1;
//        System.out.println(shrey);
        int shrey = (n>=0) ? 12:1; //using ternary Op conditin ? sach:jhooth
        System.out.println(shrey);
    }
}
