package Strings;

import java.util.Scanner;
public class PalindromeString {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        for (int i = 0; i < n / 2; i++) {
            int j = n - 1 - i;
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("Not Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
