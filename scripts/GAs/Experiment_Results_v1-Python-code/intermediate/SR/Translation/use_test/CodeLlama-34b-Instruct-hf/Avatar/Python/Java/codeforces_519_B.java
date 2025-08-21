```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arrayA = new int[n];
        int[] arrayB = new int[n];
        int[] arrayC = new int[n];

        for (int i = 0; i < n; i++) {
            arrayA[i] = scanner.nextInt();
            arrayB[i] = scanner.nextInt();
            arrayC[i] = scanner.nextInt();
        }

        int sumA = 0;
        int sumB = 0;
        int sumC = 0;

        for (int i = 0; i < n; i++) {
            sumA += arrayA[i];
            sumB += arrayB[i];
            sumC += arrayC[i];
        }

        System.out.println(Math.abs(sumA - sumB));
        System.out.println(Math.abs(sumB - sumC));
    }
}
```
Explanation:

The code is written in Java and it is similar to the Python code you provided. It uses the `Scanner` class to read the input from the user and the `Math.abs()` method to calculate the absolute difference between the sums of the arrays.

The code first reads the input from the user and stores it in the `arrayA`, `arrayB`, and `arrayC` arrays. Then, it calculates the sum of each array using a for loop and stores the result in the `sumA`, `sumB`, and `sumC` variables. Finally, it prints the absolute difference between the sums of the arrays using the `Math.abs()` method.

Note that the code uses the `Math.abs()` method to calculate the absolute difference between the sums of the arrays, which is the same as the `abs()` function in Python.
