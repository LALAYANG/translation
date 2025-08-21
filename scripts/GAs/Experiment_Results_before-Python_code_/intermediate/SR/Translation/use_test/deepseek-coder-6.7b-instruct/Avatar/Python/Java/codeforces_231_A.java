Here is the Java version of the Python code:

```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int[] l1 = new int[3];
            for (int j = 0; j < 3; j++) {
                l1[j] = scanner.nextInt();
            }
            if (Arrays.stream(l1).sum() > 1) {
                c++;
            }
        }
        System.out.println(c);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer `n` from the input, then reads `n` lines of three integers each. For each line, it sums the integers and if the sum is greater than 1, it increments the counter `c`. Finally, it prints the value of `c`.

