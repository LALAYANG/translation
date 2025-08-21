Here is the Java version of your Python code:

```java
import java.util.*;
import java.util.concurrent.*;

public class Main {
    static Queue<String> queue_parser0 = new ConcurrentLinkedQueue<>();
    static Queue<Integer> newqueue_gi0_1 = new ConcurrentLinkedQueue<>();
    static Iterator<String> input_parser;
    static final int MOD = (int) (1000000000.0 + 7);
    static int N, max_changes, seg_cnt = 0, cur_happy, ans;
    static String S;

    public static void main(String[] args) throws InterruptedException {
        Thread thread_parser0 = new Thread(() -> {
            Iterator<String> result = parser();
            queue_parser0.add(result.next());
        });
        thread_parser0.start();
        thread_parser0.join();
        input_parser = queue_parser0.iterator();

        Thread thread_gi0 = new Thread(() -> {
            int result = gi();
            newqueue_gi0_1.add(result);
        });
        thread_gi0.start();
        thread_gi0.join();
        N = newqueue_gi0_1.poll();
        max_changes = gi();
        S = gw();

        for (int i = 0; i < N - 1; i++) {
            if (S.charAt(i) != S.charAt(i + 1)) {
                seg_cnt++;
            }
        }

        cur_happy = calculate_happiness(1, N, seg_cnt);
        if (2 * max_changes >= seg_cnt) {
            ans = N - 1;
        } else {
            ans = cur_happy + 2 * max_changes;
        }
        System.out.println(ans);
    }

    public static Iterator<String> parser() {
        Scanner scanner = new Scanner(System.in);
        List<String> data = new ArrayList<>(Arrays.asList(scanner.nextLine().split(" ")));
        data.removeIf(String::isEmpty);
        return data.iterator();
    }

    public static String gw() {
        return input_parser.next();
    }

    public static int gi() {
        return Integer.parseInt(gw());
    }

    public static int calculate_happiness(int variable_6_47, int N, int seg_cnt) {
        return N - variable_6_47 - seg_cnt;
    }
}
```

Please note that Java does not support decorators, so the `my_decorator` function is not included in the Java version. Also, the `scipy.stats.ttest_ind` function is not used in the Java version, so it is not included.

