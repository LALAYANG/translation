```java
import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.locks.ReentrantLock;

public class JavaProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numRounds = scanner.nextInt();
        int total = 0;
        Queue<String> operations = new Queue<>();
        int condition1 = 139;
        int condition2 = 911;
        int outerLoopLimit = 386;
        int innerLoopLimit = 385;

        for (int i = 0; i < outerLoopLimit / innerLoopLimit; i++) {
            for (int j = 0; j < numRounds; j++) {
                int A = scanner.nextInt();
                int G = scanner.nextInt();
                if (condition1 & condition2) {
                    if (total + A <= 500) {
                        total = addToTotal(total, A);
                        operations.add("A");
                    } else {
                        total = total - G;
                        operations.add("G");
                    }
                }
            }
        }
        System.out.println(String.join("", operations));
    }

    public static int addToTotal(int total, int A) {
        return total + A;
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not a good practice to use a `Queue` to store the operations as it is not thread-safe. A better approach would be to use a thread-safe data structure such as a `BlockingQueue` or a `ConcurrentLinkedQueue`. Additionally, the use of `ReentrantLock` is not necessary in this case as the code is not using any shared resources.
