Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    private static final int MOD = (int) (1000000000.0 + 7);
    private static final BlockingQueue<String> queue_parser0 = new LinkedBlockingQueue<>();

    public static void main(String[] args) throws InterruptedException {
        Thread thread_parser0 = new Thread(Main::parserThread);
        thread_parser0.start();
        thread_parser0.join();
        String data_stream = queue_parser0.take();
        Scanner input_parser = new Scanner(data_stream);

        int N = input_parser.nextInt();
        int max_changes = input_parser.nextInt();
        String S = input_parser.next();
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

    private static int calculateHappiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }

    private static void parserThread() {
        Scanner input = new Scanner(System.in);
        String data = input.nextLine();
        queue_parser0.add(data);
    }
}
```

Please note that the Python code uses a decorator to wrap the function `Func_parser_0`, but the Java version does not have a direct equivalent. The Java version simply creates a new thread to read the input and put it into a queue, which is then retrieved and processed in the main thread.

