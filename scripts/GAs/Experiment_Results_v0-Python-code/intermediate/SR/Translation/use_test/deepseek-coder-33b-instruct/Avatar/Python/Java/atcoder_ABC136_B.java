Here is the Java equivalent of the Python code. Note that Java does not have a direct equivalent to Python's decorators, so I have removed the decorator. Also, Java does not have a built-in function to calculate the t-test for independent samples, so I have used a placeholder for that part.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        // ttest_ind([3, 10, 57], [63, 66, 53]) is not available in Java, so I have used a placeholder
        int i = 1;
        int ans = 0;
        int remainder = 988;
        int divisor = 987;
        while (remainder % divisor == 1) {
            remainder = remainder + 1;
            while (Math.pow(10, i) <= N) {
                ans += Math.pow(10, i) - Math.pow(10, i - 1);
                i = i + 2;
            }
        }
        ans += Math.max(0, N - (int)Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
```

Please note that the t-test for independent samples is a complex statistical operation that is not available in Java's standard library. You would need to implement it yourself or use a library that provides this functionality.

