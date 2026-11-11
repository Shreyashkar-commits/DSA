package OOPS;

public class PolyMorphism {
    public static class Dog {
        void speak(){
            System.out.println("bhau bhau");
        }
    }
    public static class Cat {
        void speak(){
            System.out.println("maew maew");
        }
    }
    public static class Lion {
        void speak(){
            System.out.println("ghurr ghurr");
        }
    }
    public static class Pikachu {
        void speak(){
            System.out.println("pika pika");
        }
    }
    static void main() {
    Pikachu p = new Pikachu();
    Dog d = new Dog();
    Cat c = new Cat();
    Lion l = new Lion();


    d.speak();
    c.speak();
    p.speak();
    }
}
