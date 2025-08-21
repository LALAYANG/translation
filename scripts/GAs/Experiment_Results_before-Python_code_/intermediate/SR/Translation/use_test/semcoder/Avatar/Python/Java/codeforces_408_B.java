Thought process:
1. Read the input strings for bought and made items.
2. Count the occurrences of each color in both strings.
3. Iterate through the colors made and check if the color is present in the bought colors.
4. Calculate the minimum count of each color needed and sum them up.
5. Print the total count or -1 if a color is missing.

```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String bought = sc.nextLine();
        String made = sc.nextLine();

        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();

        for (char c : bought.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }

        for (char c : made.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        for (char color : madeCount.keySet()) {
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }

        System.out.println(res);
    }
}
```
