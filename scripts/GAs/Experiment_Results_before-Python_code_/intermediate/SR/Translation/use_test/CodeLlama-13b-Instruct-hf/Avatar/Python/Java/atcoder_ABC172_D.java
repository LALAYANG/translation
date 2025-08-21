```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long ans = 0;
        for (int i = 1; i <= N; i++) {
            ans += i * (N / i) * (N / i + 1) / 2;
        }
        System.out.println(ans);
    }
}
```
Explanation:

* The `import` statement is used to import the `Scanner` class from the `java.util` package.
* The `Scanner` class is used to read input from the user.
* The `nextInt()` method is used to read an integer from the user.
* The `for` loop is used to iterate from 1 to N, and the `i * (N / i) * (N / i + 1) / 2` expression is used to calculate the sum of the numbers.
* The `System.out.println()` method is used to print the result.

Note: The `rs()` and `ri()` functions are not used in the Java code, as they are not necessary for this problem. The `rs_()` and `ri_()` functions are not used in the Java code, as they are not necessary for this problem.
