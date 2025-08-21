```java
import java.util.Scanner;

public class TTestInd {
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
            int i = 0;
            int stop = Newton;
            int step = 1;

            while (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                if (FirstCondition & SecondCondition) {
                    if (v - v2 > (Newton - i - 1) * d) {
                        a *= -1;
                        v = (Newton - i - 1) * d + v2;
                    }
                }
                distance += v;
                v += a * d;
                i += step;
            }
        }

        System.out.println(distance);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
