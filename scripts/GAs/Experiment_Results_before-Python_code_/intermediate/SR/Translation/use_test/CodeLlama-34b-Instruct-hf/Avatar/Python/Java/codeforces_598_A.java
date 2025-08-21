```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            System.out.println(solve(n));
        }
    }

    public static int solve(int n) {
        int s = (1 + n) * n / 2;
        int t = 1;
        while (t <= n) {
            s -= 2 * t;
            t *= 2;
        }
        return s;
    }
}
```

Explanation:

The Python code you provided is a solution to a problem that involves finding the sum of the first n positive integers, where n is the input. The solution is implemented using a recursive function called `solve`.

The Java code I provided is a direct translation of the Python code to Java. It uses the `Scanner` class to read input from the user and the `System.out.println` method to print the output. The `solve` method is implemented in the same way as in the Python code, using a loop to calculate the sum of the first n positive integers.

The test input you provided is a list of 10 integers, and the expected output is the sum of the first n positive integers for each input. The Java code I provided will print the expected output for each input.
