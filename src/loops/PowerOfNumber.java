package loops;

import java.util.Scanner;
public class PowerOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number(a) :");
        int a = sc.nextInt();
        System.out.print("Enter the Number(b):");
        int b = sc.nextInt();
        int Pow=1;
        for (int i =1; i<=b ; i++);
        {
            Pow *=a;
        }
        System.out.println(Pow);
    }
}