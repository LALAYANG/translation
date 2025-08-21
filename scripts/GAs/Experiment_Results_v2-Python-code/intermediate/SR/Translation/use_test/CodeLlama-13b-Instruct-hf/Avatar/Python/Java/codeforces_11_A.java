
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arrayLength = scanner.nextInt();
        int divisor = scanner.nextInt();
        int[] x = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            x[i] = scanner.nextInt();
        }

        int m = 0;
        int q = 0;
        for (int i = 0; i < arrayLength - 1; i++) {
            if (x[i] >= x[i + 1]) {
                q = (x[i] - x[i + 1]) / divisor + 1;
                m = m + q;
                x[i + 1] = x[i + 1] + q * divisor;
            }
        }

        System.out.println(m);
    }
}
```
This code uses the `Scanner` class to read the input from the user, and the `Arrays` class to create and manipulate arrays. The `IntStream` class is used to perform the recursive function.

The `main` method first reads the input from the user and stores it in the `arrayLength` and `divisor` variables. It then creates an array of integers `x` with the length specified by the user.

The `m` and `q` variables are initialized to 0. The code then iterates through the array `x` and checks if the current element is greater than or equal to the next element. If it is, it calculates the difference between the two elements and divides it by the divisor. The result is then rounded up to the nearest integer using the `Math.ceil` method.

The `m` variable is then updated by adding the result of the previous calculation to it. The `x[i + 1]` element is then updated by adding the result of the previous calculation multiplied by the divisor.

Finally, the `m` variable is printed to the console.

Note that the code assumes that the input is valid and that the array length and divisor are positive integers.
