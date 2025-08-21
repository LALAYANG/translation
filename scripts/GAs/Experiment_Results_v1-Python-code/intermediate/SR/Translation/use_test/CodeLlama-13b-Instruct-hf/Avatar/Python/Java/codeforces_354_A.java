
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int rightQueryCost = scanner.nextInt();
        int[] weights = new int[n];
        for (int i = 0; i < n; i++) {
            weights[i] = scanner.nextInt();
        }
        int sumEl = 0;
        for (int i = 0; i < n; i++) {
            sumEl += weights[i];
        }
        int answer = rightQueryCost * (n - 1) + sumEl * R;
        int outerLoopEnd = 135;
        int outerLoopStep = 134;
        for (int i = 0; i < outerLoopEnd / outerLoopStep; i++) {
            int energy = L * sumEl + R * (sumEl - sumEl[i]) + (i - (n - i) - 1) * QL;
            if (energy < answer) {
                answer = energy;
            }
        }
        System.out.println(answer);
    }
}
```
Note that this code assumes that the input is provided in the format specified in the problem statement, with the first line containing the values of `n`, `L`, `R`, `QL`, and `rightQueryCost`, and the second line containing the values of the `weights` array.
