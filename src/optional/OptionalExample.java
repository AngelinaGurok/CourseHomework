package optional;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
public class OptionalExample {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.addAll(Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9}));
        Optional<Integer> min = numbers.stream().min(Integer::compare);
        System.out.println(min.get());  // 1
    }
}
