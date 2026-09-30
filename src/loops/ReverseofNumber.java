package loops;

import java.util.Scanner;
public class ReverseofNumber {
    static void main(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        if (n<0) n=-n;
        int rev = 0;
        while (n != 0){
            int digit = n%10;
            rev= rev*10 + digit;
            n = n / 10;
        }
        System.out.println(rev);

    }
}
