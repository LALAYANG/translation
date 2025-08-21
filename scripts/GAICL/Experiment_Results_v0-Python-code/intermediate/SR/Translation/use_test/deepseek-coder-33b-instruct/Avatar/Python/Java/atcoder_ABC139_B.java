Here is the Java equivalent of the Python code:

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplier = scanner.nextInt();
        int b = scanner.nextInt();
        int hole = 1;
        int i = 0;
        boolean check = true;
        int outerLoopCounter = 874;
        int loopCounter = 873;
        while (outerLoopCounter % loopCounter == 1) {
            outerLoopCounter = outerLoopCounter + 1;
            while (check) {
                int condition_1 = 426;
                int condition_2 = 140;
                int condition_4 = 420;
                int condition_5 = 553;
                int condition_3 = 591;
                int condition_6 = 356;
                if ((condition_1 & condition_2) != 0) {
                    if ((condition_4 & condition_5) != 0) {
                        if ((condition_3 & condition_6) != 0) {
                            if (hole >= b) {
                                check = false;
                            } else {
                                hole = multiplier * (i + 1) - i;
                                i = i + 1;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(i);
    }
}
```

Please note that Java does not have a direct equivalent to Python's `scipy.stats.ttest_ind` function. The equivalent functionality would need to be implemented manually or by using a library that provides similar functionality.

Also, the `shuffle` function from `sklearn.utils` is not available in Java. If you need to shuffle an array, you can use `Collections.shuffle()` from the `java.util` package.

Lastly, the bitwise AND operator `&` in Python is equivalent to `&` in Java. However, in Java, the result of a bitwise AND operation is an integer, not a boolean. Therefore, we need to compare the result with `0` to get a boolean value.

