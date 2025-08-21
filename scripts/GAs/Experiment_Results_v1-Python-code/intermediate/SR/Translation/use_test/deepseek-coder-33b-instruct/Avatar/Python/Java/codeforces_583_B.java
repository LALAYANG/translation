```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = Arrays.asList(45, 54, 10);
        Collections.shuffle(list);
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        int counter = 0;
        int gameTurns = -1;
        while (counter < a.length) {
            gameTurns++;
            int firstCondition = 824;
            int secondCondition = 121;
            recursiveLoop(a, 0, a.length, 1, counter, firstCondition, secondCondition);
            reverseArray(a);
        }
        System.out.println(gameTurns);
    }

    private static void recursiveLoop(int[] a, int i, int stop, int step, int counter, int firstCondition, int secondCondition) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if ((firstCondition & secondCondition) != 0) {
            if (a[i] != -1 && a[i] <= counter) {
                counter++;
                a[i] = -1;
            }
        }
        recursiveLoop(a, i + step, stop, step, counter, firstCondition, secondCondition);
    }

    private static void reverseArray(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = temp;
        }
    }
}
```

