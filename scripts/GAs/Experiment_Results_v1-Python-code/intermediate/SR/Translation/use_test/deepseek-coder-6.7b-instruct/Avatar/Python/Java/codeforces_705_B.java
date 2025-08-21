Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = in.nextInt();
        }
        int c = 2;
        int ThirdCondition = 767;
        int SecondCondition = 966;
        int FirstCondition = 793;
        int FourthCondition = 795;
        int OuterLoopStart = 796;
        int OuterLoopEnd = 795;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            for (int ArrayElement : w) {
                if (FirstCondition == FourthCondition) {
                    if (ThirdCondition == SecondCondition) {
                        if (ArrayElement == 1) {
                            System.out.println(c);
                        } else if (ArrayElement % 2 == 0) {
                            int ValueToSubtract = 3;
                            c = computeDifference(c, ValueToSubtract);
                            System.out.println(c);
                        } else {
                            System.out.println(c);
                        }
                    }
                }
            }
        }
    }

    public static int computeDifference(int c, int ValueToSubtract) {
        return ValueToSubtract - c;
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and an array `w` of `n` integers from the standard input, then it iterates over the array and prints the value of `c` depending on the conditions. The `computeDifference` method is used to calculate the difference between `c` and `ValueToSubtract`.

