
Here is the Java code that solves the problem:
```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        int Q = scanner.nextInt();
        int[] a = new int[Q];
        int[] b = new int[Q];
        int[] c = new int[Q];
        int[] d = new int[Q];
        for (int i = 0; i < Q; i++) {
            a[i] = scanner.nextInt();
            b[i] = scanner.nextInt();
            c[i] = scanner.nextInt();
            d[i] = scanner.nextInt();
        }
        System.out.println(solve(N, M, Q, a, b, c, d));
    }

    public static int solve(int N, int M, int Q, int[] a, int[] b, int[] c, int[] d) {
        int res = 0;
        for (int i = 0; i < Q; i++) {
            if (a[i] == b[i]) {
                res += d[i];
            } else {
                int diff = c[i] - (a[i] - b[i]);
                if (diff > 0) {
                    res += d[i] * diff;
                }
            }
        }
        return res;
    }
}
```
This code first reads the input from the standard input and then calls the `solve` function to calculate the maximum value that can be obtained by selecting a subset of the given numbers. The `solve` function first initializes the result to 0 and then iterates over the given numbers. For each number, it checks if the difference between the current number and the previous number is equal to the given difference. If it is, it adds the corresponding value to the result. If the difference is not equal, it calculates the difference and adds the corresponding value to the result. Finally, it returns the result.

Note that this code assumes that the input is given in the format specified in the problem statement, with the first line containing the number of numbers, the second line containing the maximum value, and the third line containing the number of queries. The queries are given in the format "a b c d", where "a" and "b" are the indices of the two numbers, "c" is the difference between the two numbers, and "d" is the value to be added to the result if the difference is equal to "c".
