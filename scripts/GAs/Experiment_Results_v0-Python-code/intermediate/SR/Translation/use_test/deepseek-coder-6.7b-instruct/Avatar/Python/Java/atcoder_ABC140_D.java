Here is the Java version of your Python code:

```java
import java.util.*;

class Main {
    static int calculateHappiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }

    static int decorator(FunctionalInterface func) {
        return func.result();
    }

    static String parserThread(BlockingQueue<String> queue) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        queue.add(data);
        return data;
    }

    static String gw(BlockingQueue<String> queue) throws InterruptedException {
        return queue.take();
    }

    static int gi(BlockingQueue<String> queue) throws InterruptedException {
        String data = gw(queue);
        return Integer.parseInt(data);
    }

    public static void main(String[] args) throws InterruptedException {
        BlockingQueue<String> queue = new LinkedBlockingQueue<>();
        Thread thread_parser0 = new Thread(() -> parserThread(queue));
        thread_parser0.start();
        thread_parser0.join();

        int N = gi(queue);
        int max_changes = gi(queue);
        String S = gw(queue);

        int seg_cnt = 0;
        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        int variable_6_47 = 1;
        int cur_happy = calculateHappiness(variable_6_47, N, seg_cnt);
        int ans;
        if (2 * max_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * max_changes;
        }
        System.out.println(ans);
    }
}

@FunctionalInterface
interface FunctionalInterface {
    int result();
}
```

Please note that Java does not support Python's decorators, so the decorator function is not included in the Java version. Also, Java does not have a built-in equivalent to Python's `yield` keyword, so the `Func_parser_0` function has been replaced with a `parserThread` function that reads from the console.

The `gi` and `gw` functions are used to mimic the behavior of Python's `input` and `int` functions. They read from the console and convert the input to an integer.

The `calculateHappiness` function is a direct translation of the Python function.

The `decorator` function is not used in the Java version, but it is included for completeness.

The `main` function is the entry point of the program. It creates a thread to read from the console, waits for it to finish, and then reads the input and converts it to integers. It then calculates the answer and prints it.

The `FunctionalInterface` is a functional interface that is used to demonstrate how to use a functional interface in Java. It is not used in the main function, but it is included for completeness.

