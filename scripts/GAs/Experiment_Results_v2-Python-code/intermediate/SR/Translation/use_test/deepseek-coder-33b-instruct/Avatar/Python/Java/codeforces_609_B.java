```java
import java.util.*;

public class Main {
    static int n, m;
    static int[] lst;
    static HashMap<Integer, Integer> l = new HashMap<>();
    static int res = 0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();
        m = scanner.nextInt();
        lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        countElementFrequency(0, n, 1);
        calculateResult(0, n, 1);
        System.out.println(res);
    }

    static void countElementFrequency(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (!l.containsKey(lst[i])) {
            l.put(lst[i], 1);
        } else {
            l.put(lst[i], l.get(lst[i]) + 1);
        }
        countElementFrequency(i + step, stop, step);
    }

    static void calculateResult(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l.get(lst[i]) > 1) {
            res += n - i - l.get(lst[i]);
            l.put(lst[i], l.get(lst[i]) - 1);
        } else {
            res += n - i - 1;
        }
        calculateResult(i + step, stop, step);
    }
}
```

