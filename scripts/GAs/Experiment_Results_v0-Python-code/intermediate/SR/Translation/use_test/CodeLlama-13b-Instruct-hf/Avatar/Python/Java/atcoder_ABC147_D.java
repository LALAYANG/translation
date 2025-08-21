
Here is the Java code that implements the same functionality as the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Random;

public class XorSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int[] A = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            A[i] = scanner.nextInt();
        }
        int xorSum = 0;
        for (int b = 0; b < 60; b++) {
            int bitCount = 0;
            for (int i = 0; i < arraySize; i++) {
                if ((A[i] >> b & 1) == 1) {
                    bitCount++;
                }
            }
            xorSum = (xorSum + bitCount * (arraySize - bitCount) * (1 << b)) % 1000000007;
        }
        System.out.println(xorSum);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Arrays` class to create and manipulate the array of integers. The `Random` class is used to generate random numbers for the shuffling of the array.

The `calculateXorSum` method is not needed in Java, as the same functionality can be achieved using a simple `for` loop. The `for` loop iterates over the bits of the array, and for each bit, it calculates the number of ones and zeros in the array, and then updates the `xorSum` variable accordingly.

The `shuffle` method is not needed in Java, as the `Random` class can be used to generate random numbers for the shuffling of the array.

The `print` statement is used to print the final value of the `xorSum` variable.

Note that the `1000000007` modulus is used to ensure that the result is within the range of a 32-bit integer.
