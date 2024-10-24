import collections.array_lists.polynomial.Polynomial;
import collections.array_lists.center.Center;
import leetcode_35.Solution;

public class Main {
    public static void main(String[] args) {
        Double[] nums = {1.7, 5.0, 6.0, 4.0, 5.0};
        Polynomial polynomial = new Polynomial(nums, 2);
        polynomial.showResult(); //147,7
    }
}