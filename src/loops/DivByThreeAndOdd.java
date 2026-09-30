package loops;

public class DivByThreeAndOdd {
    static void main() {
        for (int i = 1; i <100 ; i++) {
            if (i % 2 != 0 && i % 3 == 0) System.out.print(i + " ");
        }
    }
}
