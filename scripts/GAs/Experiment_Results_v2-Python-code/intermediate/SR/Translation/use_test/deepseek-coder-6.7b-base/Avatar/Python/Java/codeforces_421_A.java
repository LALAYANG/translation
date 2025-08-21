```
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
            int k = 0;
            int stop = n;
            int step = 1;
            while (step != 0 && (step > 0 && k < stop) || (step < 0 && k > stop)) {
                if (firstConditionChecker & secondConditionChecker) {
                    if (k + 1 == lista[0]) {
                        System.out.print(1 + " ");
                    } else {
                        System.out.print(2 + " ");
                    }
                }
                k += step;
            }
        }
    }
}
```

