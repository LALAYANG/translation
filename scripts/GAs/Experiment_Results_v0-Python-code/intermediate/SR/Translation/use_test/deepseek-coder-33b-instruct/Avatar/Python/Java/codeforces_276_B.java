```java
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final int CHECK_VALUE_1 = 503;
    private static final int CHECK_VALUE_2 = 523;
    private static final int LOOP_BOUND = 704;
    private static final int STEP_SIZE = 703;
    private static Map<Character, Integer> dt = new HashMap<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        countChars(0, LOOP_BOUND / STEP_SIZE, 1, s);
        int cnt = 0;
        boolean x = true;
        for (Map.Entry<Character, Integer> entry : dt.entrySet()) {
            if (entry.getValue() % 2 != 0 && cnt < 1) {
                cnt += 1;
            } else if (entry.getValue() % 2 != 0 && cnt >= 1) {
                x = false;
                break;
            }
        }
        if ((CHECK_VALUE_1 & CHECK_VALUE_2) != 0) {
            if (x) {
                System.out.println("First");
            } else if (!x && s.length() % 2 == 0) {
                System.out.println("Second");
            } else if (!x && s.length() % 2 != 0) {
                System.out.println("First");
            }
        }
    }

    private static void countChars(int loopIndexOut, int stop, int step, String s) {
        if ((step == 0 || (step > 0 && loopIndexOut >= stop) || (step < 0 && loopIndexOut <= stop))) {
            return;
        }
        for (char c : s.toCharArray()) {
            dt.put(c, dt.getOrDefault(c, 0) + 1);
        }
        countChars(loopIndexOut + step, stop, step, s);
    }
}
```

Please note that the t-test function is not available in Java's standard library, so it is not included in the translation.

