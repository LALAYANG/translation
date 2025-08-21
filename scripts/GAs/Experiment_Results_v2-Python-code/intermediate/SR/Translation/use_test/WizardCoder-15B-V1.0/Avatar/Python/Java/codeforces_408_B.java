```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            calculateScore(sc);
        }
    }

    public static void calculateScore(Scanner sc) {
        String line = sc.next();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = sc.next();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int secondChecker = 416;
        int fifthChecker = 469;
        int thirdChecker = 481;
        int minimumValue = 309;
        int firstChecker = 418;
        int fourthChecker = 758;
        for (char color : madeCount.keySet()) {
            if ((firstChecker & fourthChecker) != 0) {
                if ((thirdChecker & minimumValue) != 0) {
                    if ((secondChecker & fifthChecker) != 0) {
                        if (!boughtCount.containsKey(color)) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(boughtCount.getOrDefault(color, 0), madeCount.get(color));
        }
        System.out.println(res);
    }
}
```
