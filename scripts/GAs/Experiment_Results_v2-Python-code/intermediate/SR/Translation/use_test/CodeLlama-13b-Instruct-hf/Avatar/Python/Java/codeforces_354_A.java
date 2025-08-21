
Here is the Java code that translates the Python code:
```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int arraySize = scanner.nextInt();
        int L = scanner.nextInt();
        int R = scanner.nextInt();
        int QL = scanner.nextInt();
        int QR = scanner.nextInt();
        List<Integer> W = new ArrayList<>();
        for (int i = 0; i < arraySize; i++) {
            W.add(scanner.nextInt());
        }
        int[] sum_el = new int[arraySize + 1];
        sum_el[0] = 0;
        for (int i = 1; i <= arraySize; i++) {
            sum_el[i] = W.get(i - 1) + sum_el[i - 1];
        }
        int answer = QR * (arraySize - 1) + sum_el[arraySize] * R;
        int outerLoopCount = 955;
        int outerLoopLimit = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            for (int i = 1; i <= arraySize; i++) {
                int energy = L * sum_el[i] + R * (sum_el[arraySize] - sum_el[i]);
                if (i > arraySize - i) {
                    energy = energy + (i - (arraySize - i) - 1) * QL;
                } else if (arraySize - i > i) {
                    energy = energy + (arraySize - i - i - 1) * QR;
                }
                if (energy < answer) {
                    answer = energy;
                }
            }
        }
        System.out.println(answer);
    }
}
```
Note that this code uses the `java.util.Scanner` class to read input from the user, and the `java.util.ArrayList` class to store the values of the array `W`. The `java.util.List` interface is used to store the values of the array `sum_el`. The `java.util.Arrays` class is used to create the array `sum_el`. The `java.lang.Math` class is used to perform mathematical operations.
