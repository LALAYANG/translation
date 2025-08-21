```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = scanner.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (char c : madeCount.keySet()) {
            if (!boughtCount.containsKey(c)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(c), madeCount.get(c));
        }
        System.out.println(res);
    }
}
```
This is a solution to the problem using Java. It first reads the input from the user and stores it in a `String` variable called `line`. It then uses a `HashMap` to store the count of each character in the `line` string.

Next, it reads the second line of input and stores it in a `String` variable called `line`. It then uses a `HashMap` to store the count of each character in the `line` string.

The program then iterates over the keys of the `madeCount` map and checks if the corresponding key is present in the `boughtCount` map. If it is not present, it prints `-1` and returns. If it is present, it calculates the minimum of the corresponding values in the `boughtCount` and `madeCount` maps and adds it to the `res` variable.

Finally, it prints the value of `res` and returns.
