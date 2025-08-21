Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
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
```

In this Java code, we use Java 8's Stream API to convert the list of strings to a list of integers, calculate the sum of the integers, and check if the original number is in the list of integers.

Please note that the variable `n` is hardcoded for testing purposes. In a real-world scenario, you would get `n` from user input or another source.

