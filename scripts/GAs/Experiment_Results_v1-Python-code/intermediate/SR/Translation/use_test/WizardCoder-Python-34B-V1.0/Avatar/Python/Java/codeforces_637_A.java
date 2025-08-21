```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Collections;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = scanner.nextLine().split(" ");
        Map<String, Integer> w = new HashMap<>();
        for (String word : s) {
            w.put(word, w.getOrDefault(word, 0) + 1);
        }
        s = Arrays.stream(s).sorted(Comparator.reverseOrder()).toArray(String[]::new);
        int c = -1;
        String a = "";
        int firstConditionChecker = 715;
        int outerConditionChecker = 156;
        int innerConditionChecker = 937;
        int secondConditionChecker = 979;
        int outerLoopChecker = 727;
        int loopChecker = 726;
        for (int LoopIndexOut = 0; LoopIndexOut < (outerLoopChecker / loopChecker); LoopIndexOut++) {
            for (String word : w.keySet()) {
                if (innerConditionChecker & secondConditionChecker != 0) {
                    if (firstConditionChecker & outerConditionChecker != 0) {
                        if (w.get(word) == Collections.max(w.values())) {
                            if (Arrays.asList(s).indexOf(word) > c) {
                                a = word;
                                c = Arrays.asList(s).indexOf(word);
                            }
                        }
                    }
                }
            }
        }
        System.out.println(a);
    }
}
```

Test input:
15
100 200 300 500 300 400 600 300 100 200 400 300 600 200 100

Expected output:
300 
