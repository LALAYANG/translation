```java
import java.util.Scanner;

public class TTestInd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int newVarB = scanner.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        int[] secondList = new int[n];
        for (int i = 0; i < n; i++) {
            secondList[i] = scanner.nextInt();
        }
        int firstConditionChecker = 871;
        int secondConditionChecker = 860;
        int newLoopChecker = 178;
        int loopChecker = 177;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1);
        }
    }

    public static void recursiveFunction(int k, int stop, int step) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if (firstConditionChecker & secondConditionChecker) {
            if (k + 1 in lista) {
                System.out.print(1 + " ");
            } else {
                System.out.print(2 + " ");
            }
        }
        recursiveFunction(k + step, stop, step);
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use recursive functions in Java, as it can lead to stack overflow errors. It is recommended to use iterative solutions instead.
