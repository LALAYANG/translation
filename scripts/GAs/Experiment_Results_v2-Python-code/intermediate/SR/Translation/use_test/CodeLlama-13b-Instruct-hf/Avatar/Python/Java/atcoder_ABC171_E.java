
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class BitwiseXor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputCount = scanner.nextInt();
        int[] inputNumbers = new int[inputCount];
        for (int i = 0; i < inputCount; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int xorTotal = 0;
        for (int i = 0; i < inputCount; i++) {
            xorTotal ^= inputNumbers[i];
        }
        System.out.println(Arrays.stream(inputNumbers).map(ai -> String.valueOf(bitwiseXor(ai, xorTotal))).collect(Collectors.joining(" ")));
    }

    public static int bitwiseXor(int a, int b) {
        return a ^ b;
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Arrays` and `List` classes to store and manipulate the input numbers. The `bitwiseXor` method is used to perform the bitwise XOR operation on each input number and the total of all input numbers. Finally, the `System.out.println` method is used to print the result as a space-separated string.

Note that the `reduce` method is not available in Java, so the `bitwiseXor` method is used to perform the reduction operation. The `map` method is used to apply the `bitwiseXor` method to each input number and the total of all input numbers, and the `collect` method is used to collect the results into a string.
