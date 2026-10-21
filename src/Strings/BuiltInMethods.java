package Strings;

public class BuiltInMethods {
    static void main() {
        String s= "Harshita";
        s.toUpperCase();
        System.out.println(s); // will not print uppercase
        System.out.println(s.indexOf('a')); // a will return first occurance
        System.out.println(s.lastIndexOf('a'));
        System.out.println(s.toLowerCase());
        System.out.println(s.contains("Harsh"));
        if (s.contains("arsh")) System.out.println("Happy");
    }
}
