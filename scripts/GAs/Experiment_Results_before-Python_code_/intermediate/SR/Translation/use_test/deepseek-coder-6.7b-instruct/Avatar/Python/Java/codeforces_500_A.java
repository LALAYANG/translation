```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int current_cell = 0;
        while (current_cell < t) {
            current_cell += s[current_cell];
            if (current_cell == t) {
                System.out.println("YES");
                System.exit(0);
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `t` from the input, then reads `n` integers into an array `s`. It then enters a loop where it adds the value of the current cell in the array to `current_cell`. If `current_cell` is equal to `t`, it prints "YES" and exits. If `current_cell` is greater than `t`, it prints "NO".

