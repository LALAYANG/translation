
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int[] b = new int[n];
        for (int i = 0; i < n; i++) {
            b[a[i] - 1] = i;
        }
        int res = 0;
        for (int i = 1; i < n; i++) {
            res += Math.abs(b[i] - b[i - 1]);
        }
        System.out.println(res);
    }
}
```
This code uses the `Scanner` class to read input from the user, and the `Math.abs()` method to calculate the absolute value of the difference between two numbers.

Note that the Python code uses the `map()` function to convert the input string to a list of integers, but in Java, we can use the `split()` method to achieve the same result. Additionally, the Python code uses the `range()` function to iterate over the indices of the `a` and `b` arrays, but in Java, we can use a for-loop with the `length` property of the array to achieve the same result.
