import collections.array_lists.polynomial.Polynomial;
import collections.array_lists.center.Center;
import collections.maps.ClassRegister;
import leetcode_35.Solution;

public class Main {
    public static void main(String[] args) {
        ClassRegister register = new ClassRegister();
        ClassRegister otherRegister = new ClassRegister();
        register.fulfillRegister(3);
        otherRegister.fulfillRegister(3);
        register.print();
        otherRegister.print();
        if(register.containsMap(otherRegister)){
            System.out.println("\nContains");
        } else System.out.println("\nDoesn't contain");
    }
}