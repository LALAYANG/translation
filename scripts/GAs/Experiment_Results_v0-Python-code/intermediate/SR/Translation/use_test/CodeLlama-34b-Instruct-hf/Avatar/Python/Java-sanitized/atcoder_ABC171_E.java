import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class atcoder_ABC171_E {
    public static void main(String[] args) {
        int count = Integer.parseInt(args[0]);
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= count; i++) {
            numbers.add(Integer.parseInt(args[i]));
        }

        int xorSum = numbers.stream().reduce(0, (a, b) -> a ^ b);
        System.out.println(numbers.stream().map(ai -> calculateXor(ai, xorSum)).collect(Collectors.joining(" ")));
    }

    private static int calculateXor(int a, int b) {
        return a ^ b;
    }
}