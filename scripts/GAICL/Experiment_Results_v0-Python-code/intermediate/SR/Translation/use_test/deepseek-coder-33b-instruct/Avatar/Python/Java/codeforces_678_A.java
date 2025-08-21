The Java equivalent of the provided Python code is as follows:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int value1 = scanner.nextInt();
        int z = scanner.nextInt();
        System.out.println((value1 / z + 1) * z);
    }
}
```

This Java program reads two integers from the standard input, performs integer division and then multiplies the result by `z`. The result is printed to the standard output.

Please note that the Python code uses the `scipy.stats.ttest_ind` function to perform a two-sample t-test, which is not included in the Java code. The Java code simply reads two integers from the standard input and performs the equivalent operation.

