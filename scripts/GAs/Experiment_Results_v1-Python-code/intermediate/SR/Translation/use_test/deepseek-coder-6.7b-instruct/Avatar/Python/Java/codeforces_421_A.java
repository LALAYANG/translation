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
        int b = scanner.nextInt();
        List<Integer> lista = new ArrayList<>();
        List<Integer> listb = new ArrayList<>();
        for (int i = 0; i < a; i++) {
            lista.add(scanner.nextInt());
        }
        for (int i = 0; i < b; i++) {
            listb.add(scanner.nextInt());
        }
        int conditionCheckerTwo = 368;
        int conditionCheckerOne = 889;
        int loopBoundary = 955;
        int stepSize = 954;
        for (int loopIndexOut = 0; loopIndexOut < loopBoundary / stepSize; loopIndexOut++) {
            recursiveFunction(0, n, 1, lista, conditionCheckerTwo, conditionCheckerOne);
        }
    }

    public static void recursiveFunction(int k, int stop, int step, List<Integer> lista, int conditionCheckerTwo, int conditionCheckerOne) {
        if (step == 0 || (step > 0 && k >= stop) || (step < 0 && k <= stop)) {
            return;
        }
        if ((conditionCheckerTwo & conditionCheckerOne) != 0) {
            if (lista.contains(k + 1)) {
                System.out.print("1 ");
            } else {
                System.out.print("2 ");
            }
        }
        recursiveFunction(k + step, stop, step, lista, conditionCheckerTwo, conditionCheckerOne);
    }
}
```

Please note that the Java version of your Python code is not equivalent to the original Python code. The Python code uses a function from the scipy library to perform a t-test, which is not available in Java. Therefore, the Java version does not include this function. Also, the Python code uses a loop index that is not defined in the provided Python code, so I removed it from the Java version.

