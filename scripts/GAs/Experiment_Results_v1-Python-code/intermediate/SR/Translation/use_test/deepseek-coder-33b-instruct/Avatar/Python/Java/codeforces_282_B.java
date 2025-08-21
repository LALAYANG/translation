```java
import java.util.*;

public class Main {
    static int total = 0;
    static List<Character> memory = new ArrayList<>();
    static int firstCondition = 477;
    static int secondCondition = 258;
    static int outerLoopStart = 801;
    static int outerLoopEnd = 800;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstLine = scanner.nextInt();

        for (int loopIndexOut = 0; loopIndexOut < outerLoopStart / outerLoopEnd; loopIndexOut++) {
            recursiveFunction(0, firstLine, 1, scanner);
        }

        for (char c : memory) {
            System.out.print(c);
        }
    }

    public static void recursiveFunction(int x, int stop, int step, Scanner scanner) {
        if (step == 0 || (step > 0 && x >= stop) || (step < 0 && x <= stop)) {
            return;
        }
        int A = scanner.nextInt();
        int G = scanner.nextInt();
        if ((firstCondition & secondCondition) != 0) {
            if (total + A <= 500) {
                total += A;
                memory.add('A');
            } else {
                total -= G;
                memory.add('G');
            }
        }
        recursiveFunction(x + step, stop, step, scanner);
    }
}
```

Please note that this Java code is a direct translation of the Python code provided. It uses a Scanner to read the input, and it uses a List to store the memory. The recursive function is called in a loop, and it reads the input for each iteration. The output is printed at the end.

