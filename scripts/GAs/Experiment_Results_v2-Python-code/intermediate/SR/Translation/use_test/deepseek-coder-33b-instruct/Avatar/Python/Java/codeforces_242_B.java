```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int id = 0;
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        for (int rangeIndex = rangeEnd / rangeStart; rangeIndex > 0; rangeIndex--) {
            recursiveCheck(scanner, 1, n, 1, id, l, r, conditionOne, conditionTwo);
        }
        System.out.println(id == n ? -1 : id + 1);
    }

    private static void recursiveCheck(Scanner scanner, int i, int stop, int step, int id, int l, int r, int conditionOne, int conditionTwo) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        int li = scanner.nextInt();
        int rightInterval = scanner.nextInt();
        if ((conditionOne & conditionTwo) != 0) {
            if (li <= l && r <= rightInterval) {
                id = i;
            } else if (li < l || r < rightInterval) {
                id = stop;
            }
        }
        l = Math.min(l, li);
        r = Math.max(r, rightInterval);
        recursiveCheck(scanner, i + step, stop, step, id, l, r, conditionOne, conditionTwo);
    }
}
```

