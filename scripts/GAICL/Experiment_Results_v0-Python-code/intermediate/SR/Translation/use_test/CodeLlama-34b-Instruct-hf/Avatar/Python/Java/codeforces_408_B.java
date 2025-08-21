
The Python code you provided is a bit complex, but I'll do my best to translate it to Java. Here's the equivalent Java code:
```java
import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        Map<String, Integer> boughtCount = new HashMap<>();
        for (String color : line.split(" ")) {
            if (!boughtCount.containsKey(color)) {
                boughtCount.put(color, 0);
            }
            boughtCount.put(color, boughtCount.get(color) + 1);
        }

        line = sc.nextLine();
        Map<String, Integer> madeCount = new HashMap<>();
        for (String color : line.split(" ")) {
            if (!madeCount.containsKey(color)) {
                madeCount.put(color, 0);
            }
            madeCount.put(color, madeCount.get(color) + 1);
        }

        int res = 0;
        int check1 = 386;
        int check2 = 863;
        for (String color : madeCount.keySet()) {
            if (check1 & check2) {
                if (!boughtCount.containsKey(color)) {
                    System.out.println(-1);
                    return;
                }
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }
        System.out.println(res);
    }
}
```
Note that I've used a `HashMap` to store the counts of each color in the `boughtCount` and `madeCount` maps. I've also used the `Math.min()` method to get the minimum of the two counts.

Also, I've removed the `ttest_ind` function and the `main` function from the Java code, as they are not relevant to the problem you're trying to solve.

I hope this helps! Let me know if you have any questions.
