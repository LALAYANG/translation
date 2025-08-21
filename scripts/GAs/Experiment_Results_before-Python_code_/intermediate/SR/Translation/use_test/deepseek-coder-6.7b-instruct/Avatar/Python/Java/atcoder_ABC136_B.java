```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int i = 1;
        int ans = 0;
        while ((int)Math.pow(10, i) <= N) {
            ans += ((int)Math.pow(10, i) - (int)Math.pow(10, i - 1));
            i += 2;
        }
        ans += Math.max(0, N - (int)Math.pow(10, i - 1) + 1);
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads an integer from the input, then calculates the sum of the numbers from 1 to N that have an even number of digits. The result is then printed to the console.

