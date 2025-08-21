```java
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        System.out.println(solution(line1, line2));
    }

    public static int solution(String line1, String line2) {
        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (char color : madeCount.keySet()) {
            if (boughtCount.containsKey(color)) {
                res += Math.min(boughtCount.get(color), madeCount.get(color));
            } else {
                return -1;
            }
        }
        return res;
    }
}
```

This Java code does the same thing as the Python code. It reads two lines of input, counts the occurrences of each character in the first line (boughtCount), and the second line (madeCount), then calculates the minimum of the counts for each character in both maps. The result is the sum of these minimums. If a character from the madeCount map does not exist in the boughtCount map, the function returns -1.

