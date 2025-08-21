Here is the Java version of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int s = scanner.nextInt();
        int c = 0;
        for (int i = 0; i < n; i++) {
            int f = scanner.nextInt();
            int t = scanner.nextInt();
            int x = t - (s - f);
            if (x > c) {
                c = x;
            }
        }
        System.out.println(s + c);
    }
}
```

This Java code does the same thing as the Python code. It reads the number of pairs and the total time from the input, then for each pair it reads the start and end times. It calculates the time left between the end time and the total time and if it's greater than the current maximum, it updates the maximum. Finally, it prints the total time plus the maximum time left.

