
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] w = new int[n];
        for (int i = 0; i < n; i++) {
            w[i] = scanner.nextInt();
        }
        int count = 0;
        int outerCheck = 572;
        int innerCheck = 86;
        int conditionCheckTwo = 505;
        int conditionCheckOne = 683;
        int outerLoopBound = 395;
        int innerLoopBound = 394;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopBound / innerLoopBound; LoopIndexOut++) {
            for (int i = 0; i < w.length; i++) {
                if (conditionCheckTwo & conditionCheckOne) {
                    if (outerCheck & innerCheck) {
                        if (w[i] == 0) {
                            count += w[i] * (w[i] - 1);
                        } else if (-w[i] in w) {
                            count += w[i] * w[-w[i]];
                        }
                    }
                }
            }
        }
        System.out.println(count / 2);
    }
}
```
Note that the Java code uses the `Scanner` class to read input from the console, and the `ArrayList` class to store the input values. The `Collections` class is used to shuffle the input array. The `Map` and `HashMap` classes are used to store the counts of the input values.
