package loops;

import java.util.Scanner;

public class Sumofdigit {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        if (n<0) n=-n;
        int Sum = 0;
        while (n > 0){
            int digit = n%10;
            Sum= Sum+ digit;
            n = n / 10;
        }
        System.out.println(Sum);

    }
}
