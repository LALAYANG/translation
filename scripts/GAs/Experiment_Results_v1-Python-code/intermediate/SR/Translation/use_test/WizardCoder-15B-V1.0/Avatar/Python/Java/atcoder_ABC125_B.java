```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] values = new int[N];
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = sc.nextInt();
        }
        for (int i = 0; i < N; i++) {
            C[i] = sc.nextInt();
        }
        int[] list = new int[1];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int conditionCheckerTwo = 15;
        int conditionCheckerOne = 475;
        int loopCheckerOne = 39;
        int loopCheckerTwo = 38;
        for (int outerLoopIndex = 0; outerLoopIndex < loopCheckerOne / loopCheckerTwo; outerLoopIndex++) {
            for (int i = 0; i < N; i++) {
                if (conditionCheckerTwo & conditionCheckerOne > 0 && values[i] - C[i] > 0) {
                    X = values[i];
                    Y = C[i];
                    list[0] += X - Y;
                }
            }
        }
        System.out.println(list[0]);
    }
}
```
