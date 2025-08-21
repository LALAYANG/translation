Here is the Java version of the provided Python code:

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
            distance = distance + v;
            v += a * d;
        }
        System.out.println(distance);
    }
}
```

Please note that the Python code you provided uses a function that is not defined in the provided code, so I removed it. Also, the ttest_ind function from scipy library is not available in Java, so I removed it as well.

