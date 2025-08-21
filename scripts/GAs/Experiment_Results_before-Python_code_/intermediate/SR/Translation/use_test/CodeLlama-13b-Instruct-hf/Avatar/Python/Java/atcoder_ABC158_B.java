```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int mod = 1000000007;
        int ans = 0;
        int rep = N / (A + B);
        ans += rep * A;
        int res = N - rep * (A + B);
        ans += Math.min(res, A);
        System.out.println(ans);
    }
}
```

Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the standard input stream.
* The `nextInt()` method is used to read an integer from the standard input stream.
* The `mod` variable is used to store the value of 10^9 + 7, which is the modulo used in the problem.
* The `ans` variable is used to store the final answer.
* The `rep` variable is used to store the number of times the loop will run.
* The `res` variable is used to store the remaining number of items after the loop runs.
* The `Math.min()` method is used to find the minimum of two numbers.
* The `System.out.println()` method is used to print the final answer.

Note: The code is written in a more concise way to make it easier to read and understand.
