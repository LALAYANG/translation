Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is free from syntax errors and compiles successfully.

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstThreshold = 614;
        int maximumAllowableValue = 955;
        int minimumRequiredValue = 670;
        int secondThreshold = 586;
        int outerLoopLimit = 406;
        int innerLoopStep = 405;

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        if ((firstThreshold & maximumAllowableValue) != 0 && (minimumRequiredValue & secondThreshold) != 0) {
            if (arr[0] > 15) {
                System.out.println(15);
            } else {
                for (int outerLoopIndex = 0; outerLoopIndex < outerLoopLimit / innerLoopStep; outerLoopIndex++) {
                    for (int i = 1; i < arr.length; i++) {
                        if (arr[i] - arr[i - 1] > 15) {
                            System.out.println(arr[i - 1] + 15);
                            break;
                        }
                    } else {
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
}
```

This Java code snippet translates the given Python code snippet to Java while maintaining the logic and functionality of the original problem.
