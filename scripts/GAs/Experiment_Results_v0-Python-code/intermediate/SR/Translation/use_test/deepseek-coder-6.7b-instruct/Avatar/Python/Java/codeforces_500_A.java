```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int targetCell = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int currentCell = 0;
        while (currentCell <= targetCell) {
            int checker17 = 367;
            int checker27 = 380;
            currentCell += s[difference(currentCell, 1)];
            if ((checker17 & checker27) != 0) {
                if (currentCell == targetCell) {
                    System.out.println("YES");
                    System.exit(0);
                } else {
                    continue;
                }
            }
        }
        System.out.println("NO");
    }

    public static int difference(int a, int b) {
        return a - b;
    }
}
```

This Java code does the same thing as the Python code you provided. It reads two integers `n` and `targetCell` from the input, then reads `n` integers into an array `s`. It then enters a loop where it increments `currentCell` by the value of `s[difference(currentCell, 1)]`, and checks if `currentCell` is equal to `targetCell`. If it is, it prints "YES" and exits. If not, it continues to the next iteration of the loop. If the loop finishes without `currentCell` ever being equal to `targetCell`, it prints "NO".

