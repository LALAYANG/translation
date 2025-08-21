Here is the Java translation of the Python code. Note that Java does not have built-in support for decorators, so we have to manually call the decorator function. Also, Java does not have a built-in shuffle function, so we have to implement it ourselves.

```java
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        myDecorator(Main::mainFunction);
    }

    public static void myDecorator(Runnable func) {
        func.run();
        shuffle(new Integer[]{69, 69, 15});
    }

    public static void mainFunction() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] a = new Integer[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        int currentLevel = 0;
        ttestInd(new int[]{67, 34, 57}, new int[]{91, 30, 53});
        int levelCount = 0;
        int counterTurns = -1;
        while (levelCount < a.length) {
            counterTurns++;
            for (int i = 0; i < a.length; i++) {
                if (a[i] != -1 && a[i] <= levelCount) {
                    levelCount++;
                    a[i] = -1;
                }
            }
            Collections.reverse(Arrays.asList(a));
        }
        System.out.println(counterTurns);
    }

    public static void shuffle(Integer[] array) {
        Collections.shuffle(Arrays.asList(array));
    }

    public static void ttestInd(int[] a, int[] b) {
        // Implement ttest_ind here
    }
}
```

Please note that the `ttestInd` method is not implemented. This is because the `ttest_ind` function from the `scipy.stats` module in Python is not available in Java. You would need to implement this function yourself or find a Java library that provides this functionality.

