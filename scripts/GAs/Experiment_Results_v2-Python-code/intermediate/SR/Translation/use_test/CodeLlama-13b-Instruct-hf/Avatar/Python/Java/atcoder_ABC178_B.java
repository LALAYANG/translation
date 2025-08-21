
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();
        int[] result = new int[] {a * c, b * d, a * d, b * c};
        System.out.println(IntStream.of(result).max().getAsInt());
    }
}
```
This code uses the `Scanner` class to read input from the console, and the `IntStream` class to perform the calculations and find the maximum value.

Note that the `IntStream` class is only available in Java 8 and later versions. If you are using an earlier version of Java, you will need to use a different approach to perform the calculations.
