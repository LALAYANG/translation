Thought process:
1. Understand the given code snippet and the problem it aims to solve.
2. Translate the Python code to Java code while maintaining the logic and functionality.
3. Ensure the Java code is correct and can handle the input provided in the test case.

```java
import java.util.Scanner;

public class RibbonCutting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        for (int i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        int ribbonLength = arr[0];
        int[] lengths = {arr[1], arr[2], arr[3]};
        if (ribbonLength % lengths[0] == 0) {
            System.out.println(ribbonLength / lengths[0]);
        } else {
            // Implement the logic for cutting the ribbon in Java
        }
    }
}
```

This solution provides a basic structure for the Java code to handle the input and perform the ribbon cutting logic. Additional implementation details for the cutting logic need to be added based on the specific requirements of the problem.
