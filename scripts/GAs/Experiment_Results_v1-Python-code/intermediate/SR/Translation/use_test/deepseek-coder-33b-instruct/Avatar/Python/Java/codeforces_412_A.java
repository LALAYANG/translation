```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = scanner.nextInt();
        int k = scanner.nextInt();
        String v = scanner.next();
        String[] directionOptions = {"LEFT", "RIGHT"};
        boolean f = k - 1 < inputNum - k;
        int m = Math.min(Math.min(k - 1, inputNum - k));
        List<String> a = new ArrayList<>();

        recursiveTtest(0, m, 1, a, directionOptions, f);
        for (int i = v.length() - 1; i >= 0; i--) {
            a.add("PRINT " + v.charAt(i));
            a.add(directionOptions[f ? 0 : 1]);
        }
        for (int i = 0; i < a.size() - 1; i++) {
            System.out.println(a.get(i));
        }
    }

    public static void recursiveTtest(int i, int stop, int step, List<String> a, String[] directionOptions, boolean f) {
        if ((step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        // ttest_ind([18, 91, 67], [40, 22, 60]) is not available in Java, so it's omitted here
        a.add(directionOptions[f ? 1 : 0]);
        recursiveTtest(i + step, stop, step, a, directionOptions, f);
    }
}
```

Please note that the ttest_ind function from scipy.stats in Python is not available in Java. You may need to implement it yourself or find a suitable library in Java.

