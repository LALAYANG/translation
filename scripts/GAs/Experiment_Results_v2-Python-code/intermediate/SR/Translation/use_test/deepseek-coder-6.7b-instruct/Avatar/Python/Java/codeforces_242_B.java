Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int l = scanner.nextInt();
        int r = scanner.nextInt();
        int id = 0;
        int conditionOne = 320;
        int conditionTwo = 737;
        int rangeEnd = 830;
        int rangeStart = 829;
        for (int rangeIndex = 0; rangeIndex < rangeEnd / rangeStart; rangeIndex++) {
            recursiveCheck(1, n, 1, l, r, conditionOne, conditionTwo, id);
        }
        System.out.println(id == n ? -1 : id + 1);
    }

    public static void recursiveCheck(int i, int stop, int step, int l, int r, int conditionOne, int conditionTwo, int id) {
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
        recursiveCheck(i + step, stop, step, l, r, conditionOne, conditionTwo, id);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n`, and two integers `l` and `r` from the input. Then it enters a loop where it calls the `recursiveCheck` method. The `recursiveCheck` method reads two integers from the input and checks if they meet certain conditions. If they do, it updates the `l` and `r` variables and the `id` variable. Finally, it prints the value of `id` or `-1` if `id` is equal to `n`.

