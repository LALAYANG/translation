```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] values = new int[N];
        for (int i = 0; i < N; i++) {
            values[i] = scanner.nextInt();
        }
        int[] C = new int[N];
        for (int i = 0; i < N; i++) {
            C[i] = scanner.nextInt();
        }
        int[] list = new int[N];
        int ans = 0;
        int X = 0;
        int Y = 0;
        int conditionCheckerTwo = 15;
        int conditionCheckerOne = 475;
        int loopCheckerOne = 39;
        int loopCheckerTwo = 38;
        for (int outerLoopIndex = 0; outerLoopIndex < loopCheckerOne / loopCheckerTwo; outerLoopIndex++) {
            int i = 0;
            int stop = N;
            int step = 1;
            while (step == 0 || (step > 0 && i < stop) || (step < 0 && i > stop)) {
                if (conditionCheckerTwo & conditionCheckerOne) {
                    if (values[i] - C[i] > 0) {
                        X = values[i];
                        Y = C[i];
                        list[i] = X - Y;
                    }
                }
                i += step;
            }
        }
        for (int i = 0; i < N; i++) {
            ans += list[i];
        }
        System.out.println(ans);
    }
}
```

