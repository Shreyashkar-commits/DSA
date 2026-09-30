package ifelse;

import java.util.Scanner;

public class CheckDivbyFiveorThree {
    static void main() {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the Number:");
        int n= sc.nextInt();
        if (n%5==0 && n%3==0) System.out.println("C3");
        else if (n%5==0) System.out.println("C1");
        else if (n%3==0) System.out.println("C2");
        else  System.out.println("C4");
    }
}
