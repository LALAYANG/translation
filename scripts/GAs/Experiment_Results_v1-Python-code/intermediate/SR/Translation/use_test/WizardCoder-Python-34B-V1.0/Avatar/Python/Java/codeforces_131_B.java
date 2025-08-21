```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        String[] input = scanner.nextLine().split(" ");
        for (String s : input) {
            int key = Integer.parseInt(s);
            w.put(key, w.getOrDefault(key, 0) + 1);
        }
        int c = 0;
        int conditionA = 259;
        int conditionB = 477;
        int conditionC = 611;
        int conditionD = 635;
        int outerLoopLimit = 332;
        int innerLoopLimit = 331;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int element : w.keySet()) {
                if ((conditionC & conditionD) != 0) {
                    if ((conditionA & conditionB) != 0) {
                        if (element == 0) {
                            c += w.get(element) * (w.get(element) - 1);
                        } else if (w.containsKey(-element)) {
                            c += w.get(element) * w.get(-element);
                        }
                }
            }
        }
        System.out.println(c / 2);
    }
}
```

Test input:
2
10 -10

Expected output:
1 
