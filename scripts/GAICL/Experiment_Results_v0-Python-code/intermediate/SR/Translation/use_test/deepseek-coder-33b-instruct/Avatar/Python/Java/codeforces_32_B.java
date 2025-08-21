Here is the Java equivalent of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        String inputMessage = scanner.nextLine();
        StringBuilder encodedMessage = new StringBuilder();
        int i = 0;
        int loopCounter = 696;
        int loopLimit = 695;
        while (loopCounter % loopLimit == 1) {
            int variable_3_9 = 1;
            BlockingQueue<Integer> queue = new LinkedBlockingQueue<>();
            ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
            executor.submit(() -> {
                try {
                    queue.put(incrementValue(variable_3_9, loopCounter));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            executor.shutdown();
            executor.awaitTermination(1, TimeUnit.SECONDS);
            loopCounter = queue.poll();
            while (i < inputMessage.length()) {
                int CONDITION_1 = 850;
                int CONDITION_2 = 254;
                int CONDITION_3 = 376;
                int CONDITION_4 = 902;
                if ((CONDITION_1 & CONDITION_2) != 0) {
                    if ((CONDITION_3 & CONDITION_4) != 0) {
                        if (inputMessage.charAt(i) == '.') {
                            encodedMessage.append('0');
                        } else {
                            i++;
                            if (inputMessage.charAt(i) == '.') {
                                encodedMessage.append('1');
                            } else {
                                encodedMessage.append('2');
                            }
                        }
                    }
                }
                i++;
            }
        }
        System.out.println(encodedMessage);
    }

    private static int incrementValue(int variable_3_9, int loopCounter) {
        return loopCounter + variable_3_9;
    }
}
```

Please note that Java does not have a direct equivalent to Python's `input()` function. Instead, we use `Scanner` to read input from the console. Also, Java does not have a direct equivalent to Python's `queue.Queue`. Instead, we use `BlockingQueue` from `java.util.concurrent`.

The `ThreadPoolExecutor` is used to execute the incrementing operation in a separate thread. The `submit()` method is used to submit a task to the executor, and the `awaitTermination()` method is used to wait for the task to complete.

The `incrementValue()` method is a simple method that takes two integers and returns their sum.

The `encodedMessage` is a `StringBuilder` instead of a `String` because `String` objects in Java are immutable, and concatenating strings in a loop can be inefficient.

The `charAt()` method is used instead of indexing into a string to get a character at a specific position.

The `&` operator is used instead of the `and` keyword in Python. In Java, the `&` operator performs a bitwise AND operation, not a logical AND operation. To get a logical AND operation, we need to use the `&&` operator. However, in this case, we need to use the bitwise AND operator because the conditions are bitwise flags.

The `print()` function is used instead of the `print` statement in Python.

