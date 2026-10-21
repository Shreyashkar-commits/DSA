package Strings;

public class Plus {
    static void main() {
        String s= "Shrey";
        s= 10+s;
        s = s+ " is boy";
        System.out.println(s);
        System.out.println(10+"Shrey"+20);
        System.out.println("Shrey"+(10+20));
        System.out.println('A'+2+"Shrey");// char+ int (ing has high prior)
    }
}
