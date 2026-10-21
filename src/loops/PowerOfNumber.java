package loops;

import java.util.Scanner;
public class PowerOfNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int Pow=1;
        for (int i =1; i<=b ; i++);
        {
            Pow *=a;
        }
        System.out.println(Pow);
    }
}