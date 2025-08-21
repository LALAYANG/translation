
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
        int[] input = scanner.nextLine().split(" ").stream().mapToInt(Integer::parseInt).toArray();
        int a = input[0];
        int b = input[1];
        int c = input[2];
        int d = input[3];
        int result = Math.max(a * c, Math.max(b * d, a * d, b * c));
        System.out.println(result);
    }
}
```
This code uses the `Scanner` class to read the input from the console, and the `Math.max` method to find the maximum value of the four numbers.

Note that the `Math.max` method takes two arguments, so we need to use the `Math.max` method twice to find the maximum value of the four numbers.

Also, the `Math.max` method returns the maximum value of the two arguments, so we need to use the `Math.max` method twice to find the maximum value of the four numbers.

Finally, the `System.out.println` method is used to print the result to the console.
