```
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int t = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 989;
        int SecondCondition = 711;
        int OuterLoopLimit = 748;
        int OuterLoopStep = 747;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / OuterLoopStep; LoopIndexOut++) {
            int i = 0;
            int stop = t;
            int step = 1;
            while (step != 0 && (step > 0 && i < stop) || (step < 0 && i > stop)) {
                if (FirstCondition & SecondCondition) {
                    if (v - v2 > (t - i - 1) * d) {
                        a *= -1;
                        v = (t - i - 1) * d + v2;
                    }
                }
                distance = distance + v;
                v += a * d;
                i += step;
            }
        }
        System.out.println(distance);
    }
}
```

