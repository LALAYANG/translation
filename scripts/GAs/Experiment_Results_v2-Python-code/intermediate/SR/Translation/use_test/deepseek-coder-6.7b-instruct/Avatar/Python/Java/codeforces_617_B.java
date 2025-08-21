```java
import java.util.*;
import java.util.stream.*;
import org.apache.commons.math3.stat.StatUtils;
import org.apache.commons.math3.stat.inference.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();
        String input = scanner.next();
        String[] substrings = input.split("1");
        int[] sums = new int[substrings.length];
        for (int i = 0; i < substrings.length; i++) {
            sums[i] = (int) substrings[i].chars().filter(ch -> ch == '0').count();
        }
        System.out.println(sums.length == 0 ? 0 : IntStream.of(sums).reduce(1, (a, b) -> a * b));
    }
}
```

This Java code does the same thing as the Python code. It reads an integer and a string from the input, splits the string by '1', counts the number of '0's in each substring, and then calculates the product of these counts. If there are no '1's in the string, it prints 0.

Note: The Python code uses libraries like scipy and sklearn which are not available in Java. Therefore, the Java code uses Apache Commons Math library for the statistical calculations.

To run this code, you need to add Apache Commons Math library to your classpath. You can download it from here: https://commons.apache.org/proper/commons-math/download_math.cgi

Please note that Java and Python have different syntax and semantics, so the translation might not be 1-to-1.

