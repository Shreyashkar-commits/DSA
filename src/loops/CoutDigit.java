package loops;

import java.util.Scanner;

public class CoutDigit {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        if(n==0) n=1;
        int count = 0;
        while (n != 0){
            n/=10;
            count++;
        }
        System.out.println(count);

    }
}
