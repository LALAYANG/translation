Here is the Java version of your Python code:

```java
import java.util.*;

public class Main {
    static int maximum = 1;
    static int high = 1;
    static int tower;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        tower = n;
        int[] l = new int[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.nextInt();
        }
        Arrays.sort(l);
        recursiveStepFunc(1, n, 1, l);
        System.out.println(maximum + " " + tower);
    }

    static void recursiveStepFunc(int i, int stop, int step, int[] l) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        if (l[i] == l[i - 1]) {
            tower--;
            high++;
        } else {
            if (high > maximum) {
                maximum = high;
            }
            high = 1;
        }
        recursiveStepFunc(i + step, stop, step, l);
    }
}
```

This Java code does the same thing as your Python code. It reads an integer `n` and `n` integers from the input, sorts them, and then uses a recursive function to find the maximum consecutive sequence of the same numbers and the number of such sequences. The result is then printed to the standard output.

Please note that the `my_decorator` function in your Python code is not translated to Java because it uses the `shuffle` function from the `sklearn.utils` module, which is not available in Java.

