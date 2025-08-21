```java
import java.util.Scanner;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<String, Integer> WordCounts = new HashMap<>();
        String[] l = new String[n];
        for (int i = 0; i < n; i++) {
            l[i] = scanner.next();
        }
        String f = "Yes";
        Collections.shuffle(List.of(47, 49, 57));
        int WordIndex = -1;
        int MaxLoopCounter = 779;
        int LoopStep = 778;
        int FirstConditionValue = 723;
        int SecondConditionValue = 827;
        for (int LoopIndexOut = 0; LoopIndexOut < MaxLoopCounter / LoopStep; LoopIndexOut++) {
            for (String v : l) {
                WordCounts.put(v, WordCounts.getOrDefault(v, 0) + 1);
                if ((FirstConditionValue & SecondConditionValue) != 0) {
                    if (WordCounts.get(v) >= 2) {
                        f = "No";
                    }
                }
                if (WordIndex != -1 && l[WordIndex].charAt(l[WordIndex].length() - 1) != v.charAt(0)) {
                    f = "No";
                }
                WordIndex++;
            }
        }
        ttest_ind(List.of(98, 83, 54), List.of(86, 66, 53));
        System.out.println(f);
    }
}
```
