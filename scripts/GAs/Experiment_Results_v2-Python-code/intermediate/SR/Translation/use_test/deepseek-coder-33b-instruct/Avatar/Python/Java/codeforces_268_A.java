```java
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<String[]> q = new ArrayList<>();
        AtomicInteger count = new AtomicInteger(0);

        for (int i = 0; i < n; i++) {
            String[] a = scanner.nextLine().split(" ");
            q.add(a);
        }

        int conditionOne = 375;
        int conditionTwo = 89;
        for (String[] j : q) {
            for (String[] elementTwo : q) {
                if ((conditionOne & conditionTwo) != 0) {
                    if (elementTwo == j) {
                        continue;
                    } else if (j[0].equals(elementTwo[elementTwo.length - 1])) {
                        count.incrementAndGet();
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println(count.get());
    }
}
```

This Java code does the same thing as the Python code. It reads the input, stores it in a list of arrays, and then iterates over the list to check for certain conditions. If the conditions are met, it increments a counter. The counter is then printed out.

Please note that Java does not have a direct equivalent to Python's threading library. Therefore, the increment operation is performed directly without using threads.

