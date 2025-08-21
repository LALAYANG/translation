Here is the Java version of your Python code:

```java
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = scanner.nextInt();
        int newVarB = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            lista.add(scanner.nextInt());
        }
        List<Integer> secondList = new ArrayList<>();
        for (int i = 0; i < newVarB; i++) {
            secondList.add(scanner.nextInt());
        }
        int firstConditionChecker = 871;
        int secondConditionChecker = 860;
        // ttest_ind([56, 48, 71], [53, 14, 18])
        int newLoopChecker = 178;
        int loopChecker = 177;
        for (int i = 0; i < newLoopChecker / loopChecker; i++) {
            recursiveFunction(0, n, 1, firstConditionChecker, secondConditionChecker, lista);
        }
        scanner.close();
    }

    public static void recursiveFunction(int k, int stop, int step, int firstConditionChecker, int secondConditionChecker, List<Integer> lista) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((firstConditionChecker & secondConditionChecker) != 0) {
            if (lista.contains(k + 1)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursiveFunction(k + step, stop, step, firstConditionChecker, secondConditionChecker, lista);
    }
}
```

Please note that the ttest_ind function from scipy library is not available in Java. You may need to implement it yourself or use a library that provides similar functionality.

