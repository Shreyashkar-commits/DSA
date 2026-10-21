package Strings;

public class InterningNew {
    static void main() {
        String s1= ("Shreyashkar");
        String s2=new String ("Shreyashkar");
        System.out.println(s1==s2);
    }
}
