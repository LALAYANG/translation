
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class XorOperation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] inputArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            inputArray[i] = scanner.nextInt();
        }
        int xorSum = inputArray[0];
        for (int i = 1; i < arraySize; i++) {
            xorSum ^= inputArray[i];
        }
        System.out.println(Arrays.stream(inputArray).map(ai -> String.valueOf(xorOperation(ai, xorSum))).collect(Collectors.joining(" ")));
    }

    public static int xorOperation(int a, int b) {
        return a ^ b;
    }
}
```
Note that the Java code uses the `java.util.stream` API to perform the operations in a more concise and efficient way than the Python code.
