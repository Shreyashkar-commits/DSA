package OOPS;

import java.util.Scanner;

public class UserDefinedDataType {
    public static class Students{ // data type created here
        String name;
        int rno;
        double cgpa;
        void print() {
            System.out.println(name+" "+rno+" "+cgpa);
        }

    }
    static void main() {
        Scanner sc= new Scanner(System.in);
        Students s1 = new Students(); //declared
        s1.name = "Shrey";
        s1.rno = 206;
        s1.cgpa=9.4;

        Students s2 = new Students(); //declared
        s2.name = "giri";
        s2.rno = 63;
        s2.cgpa=9.4;

        Students s3 = new Students(); //declared
        s3.name = "baby";
        s3.rno = sc.nextInt();
        s3.cgpa=9.4;

        System.out.println(s1.cgpa +" "+s1.name+" "+ s1.rno);
        s2.cgpa = 8.2;
        System.out.println(s1.rno);

        s1.print();
        s2.print();
        s3.print();
    }
}
