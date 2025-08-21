```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int t = scanner.nextInt();
        int[] cellValues = new int[n];
        for (int i = 0; i < n; i++) {
            cellValues[i] = scanner.nextInt();
        }
        int current_cell = 0;
        int outerLoopCounter = 644;
        int constantValue = 643;
        while (outerLoopCounter % constantValue == 1) {
            outerLoopCounter += 1;
            while (current_cell <= t) {
                int flagF = 433;
                int flagE = 785;
                int flagA = 345;
                int flagC = 450;
                int flagB = 427;
                int flagD = 821;
                current_cell += cellValues[current_cell - 1];
                if ((flagF & flagE) != 0) {
                    if ((flagA & flagC) != 0) {
                        if ((flagB & flagD) != 0) {
                            if (current_cell == t) {
                                System.out.println("YES");
                                System.exit(0);
                            }
                        }
                    }
                }
            }
        }
        System.out.println("NO");
    }
}
```

This Java code does the same thing as the Python code. It reads two integers `n` and `t` from the input, then reads `n` integers into an array `cellValues`. It then enters a loop where it increments `outerLoopCounter` and checks if `current_cell` is less than or equal to `t`. If it is, it increments `current_cell` by the value of `cellValues[current_cell - 1]` and checks if the result is equal to `t`. If it is, it prints "YES" and exits. If not, it continues to the next iteration of the loop. If `current_cell` is not less than or equal to `t`, it prints "NO" and exits.

