Here is the Java version of the Python code:

```java
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final int CHECK_CONDITION_1 = 414;
    private static final int CHECK_CONDITION_4 = 101;
    private static final int CHECK_CONDITION_2 = 174;
    private static final int CHECK_CONDITION_3 = 886;

    public static void main(String[] args) throws InterruptedException {
        int n = 82;
        char[] s = "izchhfbptiikyrvpoixwyvmajmtiicgttudocsfcbpekkcrpqbelswpnngtccbzxcaaludrlsdmmglilmn".toCharArray();
        char[] target_string = "aludrlsdmmglilmnacrpubtauyahbsmwweuetnbswvnqthdzplodyqtbgdlkticeeuevqcmxkyxcwysvhz".toCharArray();

        if ((CHECK_CONDITION_1 & CHECK_CONDITION_4) != 0) {
            if ((CHECK_CONDITION_2 & CHECK_CONDITION_3) != 0) {
                if (new String(s).equals(new String(target_string))) {
                    System.out.println(n);
                } else {
                    int cnt = 0;
                    for (int shift_amount = 0; shift_amount < n; shift_amount++) {
                        for (int j = 0; j < n - shift_amount; j++) {
                            if (s[shift_amount + j] != target_string[j]) {
                                break;
                            }
                            if (j == n - shift_amount - 1) {
                                BlockingQueue<Integer> queue_calculate_shift = new LinkedBlockingQueue<>();
                                ThreadPoolExecutor executor = new ThreadPoolExecutor(1, 1, 1, TimeUnit.SECONDS, new LinkedBlockingQueue<>());
                                executor.execute(() -> {
                                    try {
                                        queue_calculate_shift.put(calculateShift(shift_amount, n));
                                    } catch (InterruptedException e) {
                                        e.printStackTrace();
                                    }
                                });
                                executor.shutdown();
                                executor.awaitTermination(1, TimeUnit.SECONDS);
                                cnt = queue_calculate_shift.take();
                            }
                        }
                    }
                    System.out.println(2 * n - cnt);
                }
            }
        }
    }

    private static int calculateShift(int shift_amount, int n) {
        return n - shift_amount;
    }
}
```

Please note that the Java version of the code uses a `ThreadPoolExecutor` to execute the `calculateShift` method in a separate thread. The result is then put into a `BlockingQueue` and retrieved from there. The `ThreadPoolExecutor` is shut down and the main thread waits for the executor to terminate before continuing.

Also, please note that the `ttest_ind` function from the `scipy.stats` module is not used in the Java version of the code. If you need to use this function, you will need to find an equivalent in a Java library or implement it yourself.

