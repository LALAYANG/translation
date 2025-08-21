import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class atcoder_AGC025_A {
    public static void main(String[] args) {
        int n = 2; // for testing purposes
        List<String> a = Arrays.asList("10", "100", "1000", "10000", "100000");
        List<Integer> numbers = a.stream().map(Integer::parseInt).collect(Collectors.toList());
        int sum = numbers.stream().reduce(0, Integer::sum);
        if (numbers.contains(n)) {
            System.out.println(10);
        } else {
            System.out.println(sum);
        }
    }
}