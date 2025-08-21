```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        int total = 0;
        List<String> memoryArray = new ArrayList<>();
        int ConditionCheckerA = 161;
        int ConditionCheckerC = 619;
        int NewLoopCheckerA = 556;
        int LoopCheckerB = 555;
        for (int LoopIndexOut = 0; LoopIndexOut < NewLoopCheckerA / LoopCheckerB; LoopIndexOut++) {
            recursiveLoop(0, firstline, 1, scanner, total, memoryArray, ConditionCheckerA, ConditionCheckerC);
        }
        System.out.println(String.join("", memoryArray));
    }

    public static void recursiveLoop(int x, int stop, int step, Scanner scanner, int total, List<String> memoryArray, int ConditionCheckerA, int ConditionCheckerC) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((ConditionCheckerA & ConditionCheckerC) != 0) {
            if (total + A <= 500) {
                total = total + A;
                memoryArray.add("A");
            } else {
                total = total - G;
                memoryArray.add("G");
            }
        }
        recursiveLoop(x + step, stop, step, scanner, total, memoryArray, ConditionCheckerA, ConditionCheckerC);
    }
}
```

