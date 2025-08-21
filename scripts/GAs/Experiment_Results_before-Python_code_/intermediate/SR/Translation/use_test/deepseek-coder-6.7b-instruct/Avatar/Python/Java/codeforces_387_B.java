```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] round_complexity = new int[n];
        int[] george_complexity = new int[m];
        for (int i = 0; i < n; i++) {
            round_complexity[i] = scanner.nextInt();
        }
        for (int j = 0; j < m; j++) {
            george_complexity[j] = scanner.nextInt();
        }
        int i = 0, j = 0;
        while (i < n && j < m) {
            if (round_complexity[i] <= george_complexity[j]) {
                i++;
            }
            j++;
        }
        System.out.println(n - i);
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `m` from the input, and then reads `n` integers into the `round_complexity` array and `m` integers into the `george_complexity` array. It then iterates over both arrays, incrementing `i` if `round_complexity[i]` is less than or equal to `george_complexity[j]`, and `j` regardless. Finally, it prints `n - i` to the output, which is the number of rounds George can win.

