package Strings;
public class StringBuilderDemo {
    public static void main(String[] args) {
        java.lang.StringBuilder s =
                new java.lang.StringBuilder("Shrey");
        new java.lang.StringBuilder(); // empty 16
        System.out.println(s);
        s.append("giri");
        s.setCharAt(1,'0');
        System.out.println(s); // empty string builder has capacity of 16
        String t = s.toString();
        System.out.println();
    }
}