package ifelse;

import java.util.Scanner;

public class ProfitLoss {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price:");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price:");
        int sp = sc.nextInt();
       if(sp > cp) System.out.println("Profit is "+(sp-cp));
       else if (cp>sp) System.out.println("Loss is "+(cp-sp));
       else System.out.println("No Profit No Loss");
//        System.out.println("Profit Percentage is "+1.0/100.0*(sp-cp));
//        if(sp < cp) System.out.println("Loss is "+(cp-sp));
//        System.out.println("Loss Percentage is "+1.0/100.0*(cp-sp));
//        if(sp == cp) System.out.println("No Profit No Loss");
    }
}
