Here is the Java version of the provided Python code:

```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static int total = 0;
    private static List<Character> memory = new ArrayList<>();
    private static final int FirstCondition = 477;
    private static final int SecondCondition = 258;
    private static final int OuterLoopStart = 801;
    private static final int OuterLoopEnd = 800;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstline = scanner.nextInt();
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopStart / OuterLoopEnd; LoopIndexOut++) {
            recursiveFunction(0, firstline, 1);
        }
        for (char c : memory) {
            System.out.print(c);
        }
    }

    private static void recursiveFunction(int x, int stop, int step) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((FirstCondition & SecondCondition) != 0) {
            if (total + A <= 500) {
                total += A;
                memory.add('A');
            } else {
                total -= G;
                memory.add('G');
            }
        }
        recursiveFunction(x + step, stop, step);
    }
}
```

Please note that the Python `input()` function is replaced with `Scanner.nextInt()` in Java. Also, Python's `global` keyword is replaced with a class-level variable in Java. The `print` function in Python is replaced with `System.out.print` in Java.

Also, please note that the Python code you provided seems to have some logical issues. The `FirstCondition & SecondCondition` condition seems to always be true, which means it will always execute the if block. If that's not the intended behavior, you might need to adjust the code accordingly.

