Here is the Java translation of the Python code:

```java
import java.util.*;
import java.math.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int num = scanner.nextInt();
        Set<Integer> numSet = new HashSet<>();
        for (int i = 0; i < n; i++) {
            numSet.add(scanner.nextInt());
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
                    if ((check1 & check2) != 0) {
                        if ((check1 & check2) != 0) {
                            if (i % 2 != 0) {
                                twoTimesSet.add(multiplier);
                                break;
                            }
                        }
                    }
                }
                if (twoTimesSet.size() != 1) {
                    System.out.println(0);
                    break;
                }
            }
            List<Integer> numList = new ArrayList<>(numSet);
            int lcm = numList.get(0);
            for (int j = 1; j < numList.size(); j++) {
                lcm = lcm * numList.get(j) / BigInteger.valueOf(lcm).gcd(BigInteger.valueOf(numList.get(j))).intValue();
            }
            System.out.println((num - lcm / 2) / lcm + 1);
        }
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses some advanced features of Python that are not available in Java, such as the `cryptography.fernet` and `sklearn.utils` libraries. The Java code does not use these libraries and does not have the same functionality.

