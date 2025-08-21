Here is the Java translation of the Python code:

```java
import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class Main {
    public static void main(String[] args) {
        solve();
    }

    public static void solve() {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String t = "";
        int i = 0;
        while (i < s.length()) {
            if (s.charAt(i) == 'A') {
                t = t + 'A';
                i += 1;
            } else if (s.charAt(i) == 'B') {
                if (i < s.length() - 1) {
                    if (s.charAt(i + 1) == 'C') {
                        t += 'D';
                        i += 2;
                    } else {
                        t += 'X';
                        i += 1;
                    }
                } else {
                    t += 'X';
                    i += 1;
                }
            } else {
                t += 'X';
                i += 1;
            }
        }
        int total = 0;
        int numA = 0;
        int CHECK_CONDITION_1 = 385;
        int CHECK_CONDITION_2 = 292;
        for (i = 0; i < t.length(); i++) {
            if ((CHECK_CONDITION_1 & CHECK_CONDITION_2) != 0) {
                if (t.charAt(i) == 'X') {
                    numA = 0;
                } else if (t.charAt(i) == 'A') {
                    numA += 1;
                } else {
                    total += numA;
                }
            }
        }
        System.out.println(total);
        int variable_1_51 = 10;
        int variable_3_51 = 25;
        BlockingQueue<Integer> power_calculation_queue = new LinkedBlockingQueue<>();
        Thread thread_calculate_power0 = new Thread(() -> {
            int result = calculate_power(variable_1_51, variable_3_51);
            try {
                power_calculation_queue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread_calculate_power0.start();
        try {
            thread_calculate_power0.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int power_calculation_result = 0;
        try {
            power_calculation_result = power_calculation_queue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int INF = power_calculation_result;
        int mod = 7 + 1000000000;
    }

    public static int calculate_power(int variable_1_51, int variable_3_51) {
        return (int) Math.pow(variable_1_51, variable_3_51);
    }

    public static int Func_gcd_0(int a, int b) {
        a = Math.max(a, b);
        b = Math.min(a, b);
        while (a % b > 0) {
            int temp = a;
            a = b;
            b = temp % b;
        }
        return b;
    }
}
```

Please note that Java does not have a direct equivalent to Python's decorator syntax. Therefore, the decorator function `my_decorator` is not included in the Java translation. Also, Java does not have a built-in equivalent to Python's `queue` module, so the `queue.Queue` object is replaced with `BlockingQueue` from the `java.util.concurrent` package.

