import collections.array_lists.polynomial.Polynomial;
import collections.array_lists.center.Center;
import collections.maps.ClassRegister;
import leetcode_35.Solution;

public class Main {
    public static void main(String[] args) {
        ClassRegister register = new ClassRegister();
        register.fulfillRegister(5);
        register.print();
        register.printReversedMap();
    }
}