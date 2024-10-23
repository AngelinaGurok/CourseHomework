import collections.array_lists.polynomial.Polynomial;
import collections.center.Center;
import leetcode_35.Solution;

public class Main {
    public static void main(String[] args) {
        double[] nums = {1.7, 5, 6, 4, 5};
        Polynomial polynomial = new Polynomial(2, nums);
        polynomial.showResult(); //147,7
    }
}