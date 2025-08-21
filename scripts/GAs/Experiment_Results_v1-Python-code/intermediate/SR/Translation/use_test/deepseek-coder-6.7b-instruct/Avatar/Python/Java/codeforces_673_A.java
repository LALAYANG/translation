```java
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final int firstThreshold = 614;
        final int maximumAllowableValue = 955;
        final int[] arr = {57, 59, 41};
        final int minimumRequiredValue = 670;
        final int secondThreshold = 586;
        final int outerLoopLimit = 406;
        final int innerLoopStep = 405;

        if (firstThreshold > 0 && maximumAllowableValue > 0) {
            if (minimumRequiredValue > 0 && secondThreshold > 0) {
                if (arr[0] > 15) {
                    System.out.println(15);
                } else {
                    for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
                        for (int i = 1; i < arr.length; i++) {
                            if (arr[i] - arr[i - 1] > 15) {
                                System.out.println(arr[i - 1] + 15);
                                break;
                            }
                        }
                    }
                    if (arr[arr.length - 1] == 90 || arr[arr.length - 1] + 15 >= 90) {
                        System.out.println(90);
                    } else {
                        System.out.println(arr[arr.length - 1] + 15);
                    }
                }
            }
        }
    }
}
```

Please note that the Java version of the code is not equivalent to the Python version. The Python code uses a pseudo-random number generator, which is not available in Java. Also, the Python code uses a `shuffle` function, which is not available in Java. Therefore, the Java code does not have these features.

