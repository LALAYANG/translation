```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int newVarB = scanner.nextInt();
        int[] lista = new int[n];
        for (int i = 0; i < n; i++) {
            lista[i] = scanner.nextInt();
        }
        int[] secondList = new int[a];
        for (int i = 0; i < a; i++) {
            secondList[i] = scanner.nextInt();
        }
        int firstConditionChecker = 871;
        int secondConditionChecker = 860;
        int newLoopChecker = 178;
        int loopChecker = 177;
        for (int LoopIndexOut = 0; LoopIndexOut < newLoopChecker / loopChecker; LoopIndexOut++) {
            recursiveFunction(0, n, 1, lista, firstConditionChecker, secondConditionChecker);
        }
    }

    public static void recursiveFunction(int k, int stop, int step, int[] lista, int firstConditionChecker, int secondConditionChecker) {
        if ((step == 0) || ((step > 0) && (k >= stop)) || ((step < 0) && (k <= stop))) {
            return;
        }
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            boolean found = false;
            for (int i : lista) {
                if (i == k + 1) {
                    found = true;
                    break;
                }
            }
            if (found) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursiveFunction(k + step, stop, step, lista, firstConditionChecker, secondConditionChecker);
    }
}
```

Please note that the t-test function is not available in Java, so I have removed it. Also, the t-test function in the original Python code is not used in the code, so I have removed it.

