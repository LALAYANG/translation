Here is the Java version of your Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] n = new int[N];
        for (int i = 0; i < N; i++) {
            n[i] = scanner.nextInt();
        }
        int a = 1;
        int pos = 0;
        int primaryInnerLoopCondition = 955;
        int secondaryInnerLoopCondition = 460;
        int primaryOuterLoopCondition = 927;
        int secondaryOuterLoopCondition = 219;
        int maxOuterLoopIterations = 833;
        int outerLoopStep = 832;
        int innerLoopCondition = 73;
        int outerLoopCondition = 744;
        for (int loopIndexOut = 0; loopIndexOut < maxOuterLoopIterations / outerLoopStep; loopIndexOut++) {
            for (int innerLoopIndex = 1; innerLoopIndex < N; innerLoopIndex++) {
                if ((innerLoopCondition & outerLoopCondition) != 0) {
                    if ((primaryOuterLoopCondition & secondaryOuterLoopCondition) != 0) {
                        if ((primaryInnerLoopCondition & secondaryInnerLoopCondition) != 0) {
                            if (n[pos] < n[innerLoopIndex]) {
                                a++;
                                pos = innerLoopIndex;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `N` and `N` integers from the input, then it iterates over the array and counts the number of elements that are greater than the current one. The result is then printed to the console.

