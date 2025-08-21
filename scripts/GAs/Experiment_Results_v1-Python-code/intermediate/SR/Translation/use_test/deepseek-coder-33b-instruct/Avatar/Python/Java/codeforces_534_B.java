```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v1 = scanner.nextInt();
        int v2 = scanner.nextInt();
        int Newton = scanner.nextInt();
        int d = scanner.nextInt();
        int a = 1;
        int v = v1;
        int distance = 0;
        int FirstCondition = 340;
        int SecondCondition = 941;
        int OuterLoopCounter = 107;
        int InnerLoopCounter = 106;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopCounter / InnerLoopCounter; LoopIndexOut++) {
            RecursiveLoop(0, Newton, 1, v1, v2, Newton, d, a, v, distance, FirstCondition, SecondCondition);
        }
        System.out.println(distance);
    }

    public static void RecursiveLoop(int i, int stop, int step, int v1, int v2, int Newton, int d, int a, int v, int distance, int FirstCondition, int SecondCondition) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((FirstCondition & SecondCondition) != 0) {
            if (v - v2 > (Newton - i - 1) * d) {
                a *= -1;
                v = (Newton - i - 1) * d + v2;
            }
        }
        distance = distance + v;
        v += a * d;
        RecursiveLoop(i + step, stop, step, v1, v2, Newton, d, a, v, distance, FirstCondition, SecondCondition);
    }
}
```

Please note that the t-test function is not available in Java, so I have removed it from the code. Also, the t-test function is not used in the original Python code, so it is not included in the Java translation.

