package loops;

import java.util.Scanner;

public class DecreasingLoop {
    static void main() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n: ");
        int n = sc.nextInt();

        for (int i = n; i >0; i--) {
            System.out.println(i);
        }
    }
}