Here is the Java equivalent of the provided Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int num = in.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(in.nextInt());
        }
        Set<Integer> twoTimesSet = new HashSet<>();
        int innerLoopLimit = 251;
        int outerLoopLimit = 250;
        int check1 = 771;
        int check2 = 424;
        for (int loopIndexOut = 0; loopIndexOut < innerLoopLimit / outerLoopLimit; loopIndexOut++) {
            for (int i : numSet) {
                for (int multiplier = 1; multiplier < 30; multiplier++) {
                    i = i / 2;
                    if (i % 2 != 0) {
                        twoTimesSet.add(multiplier);
                        break;
                    }
                }
                if ((check1 & check2) != 0) {
                    if (twoTimesSet.size() != 1) {
                        System.out.println(0);
                        return;
                    }
                }
            }
        }
        List<Integer> numList = new ArrayList<>(numSet);
        int lcm = numList.get(0);
        for (int i = 1; i < numList.size(); i++) {
            lcm = lcm * numList.get(i) / gcd(lcm, numList.get(i));
        }
        System.out.println((num - lcm / 2) / lcm + 1);
    }

    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
```

Please note that the Java code is not equivalent to the Python code because the Python code uses some libraries and features that are not available in Java, such as cryptography, sklearn, datetime, and fractions. Also, the Python code seems to be a part of a larger program, so it may not work correctly as a standalone program.

