```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> requiredBalloons = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        for (char c : line2.toCharArray()) {
            requiredBalloons.put(c, requiredBalloons.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (char color : requiredBalloons.keySet()) {
            if (!boughtCount.containsKey(color)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(color), requiredBalloons.get(color));
        }
        System.out.println(res);
    }
}
```

Please note that the Java code does not have the same functionality as the Python code. The Python code uses bitwise operations (&) to check if certain conditions are met, but this is not possible in Java. Instead, the Java code checks if the required balloons are present in the bought count map. If not, it prints -1 and returns.

