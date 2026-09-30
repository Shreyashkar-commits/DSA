package ifelse;

import java.util.Scanner;
public class CoordinateSystem {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the x-axis Coordinates:");
        double x = sc.nextDouble();
        System.out.print("Enter the y-axis Coordinates:");
        double y = sc.nextDouble();
         if (x>0 && y>0) System.out.println("1st Quadrant");
        else if (x<0 && y>0) System.out.println("2nd Quadrant");
        else if (x<0 && y<0) System.out.println("3rd Quadrant");
        else if (x>0 && y<0) System.out.println("4th Quadrant");
        else if (x==0 && y!=0) System.out.println("Y axis");
        else if (x!=0 && y==0) System.out.println("X axis");
        else System.out.println("Origin");

    }
}