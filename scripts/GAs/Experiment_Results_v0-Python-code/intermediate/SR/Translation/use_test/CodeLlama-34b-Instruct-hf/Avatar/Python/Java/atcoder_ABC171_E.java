```
import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class XorSum {
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
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the functionality in Java.
