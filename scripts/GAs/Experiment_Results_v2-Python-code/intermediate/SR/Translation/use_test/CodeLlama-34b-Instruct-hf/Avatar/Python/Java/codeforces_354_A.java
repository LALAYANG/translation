```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arraySize = sc.nextInt();
        int L = sc.nextInt();
        int R = sc.nextInt();
        int QL = sc.nextInt();
        int QR = sc.nextInt();
        int[] W = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            W[i] = sc.nextInt();
        }

        int sum_el = 0;
        for (int i = 1; i <= arraySize; i++) {
            sum_el += W[i - 1];
        }

        int answer = QR * (arraySize - 1) + sum_el * R;
        int outerLoopCount = 955;
        int outerLoopLimit = 954;
        for (int LoopIndexOut = 0; LoopIndexOut < outerLoopCount / outerLoopLimit; LoopIndexOut++) {
            for (int i = 1; i <= arraySize; i++) {
                int energy = L * sum_el + R * (sum_el - sum_el);
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
Note: The above code is a direct translation of the given Python code to Java. However, it is not optimized for performance and may not be the most efficient way to implement the algorithm in Java.
