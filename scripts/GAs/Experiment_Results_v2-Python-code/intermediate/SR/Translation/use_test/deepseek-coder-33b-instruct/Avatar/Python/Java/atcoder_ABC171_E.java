Here is the Java version of the Python code:

```java
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        List<Integer> inputNumbers = new ArrayList<>();
        for (int i = 0; i < inputCount; i++) {
            inputNumbers.add(scanner.nextInt());
        }
        int xorTotal = inputNumbers.stream().reduce(0, (a, b) -> a ^ b);
        List<Integer> result = inputNumbers.stream().map(ai -> bitwiseXor(ai, xorTotal)).collect(Collectors.toList());
        System.out.println(result.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
}
```

Please note that Java does not have a built-in shuffle function for lists, so you would need to implement it yourself or use a library. The same applies to the t-test function.

Also, please note that the Python code uses the `input()` function to get user input, which is not available in Java. Instead, we use the `Scanner` class to read input from the console.

Lastly, the Python code uses the `reduce` function from the `functools` module to apply a function of two arguments cumulatively to the items of a sequence, from left to right, so as to reduce the sequence to a single output. In Java, we use the `reduce` method from the `Stream` class to achieve the same result.

