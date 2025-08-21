```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] L = new int[n];
        int r = 1;
        for (int i = 0; i < n; i++) {
            L[i] = r;
            r++;
        }
        int m = scanner.nextInt();
        for (int i = 0; i < m; i++) {
            int j = scanner.nextInt();
            System.out.println(L[j - 1]);
        }
    }
}
```
This is the Java code that translates the Python code you provided. It uses the `Scanner` class to read input from the user and the `System.out.println()` method to print the output.

The code first reads the first integer `n` from the user, creates an array `L` of size `n`, and initializes it with the values `1, 2, 3, ..., n`.

Then, it reads the second integer `m` from the user and loops through the next `m` integers. For each integer `j`, it prints the value of `L[j - 1]` to the console.

Note that the Python code uses the `input()` function to read input from the user, while the Java code uses the `Scanner` class to read input from the user. The `Scanner` class is more flexible and can handle different types of input, such as integers, strings, and floating-point numbers.
