```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            getMinimumBalloons(sc);
        }
    }

    public static void getMinimumBalloons(Scanner sc) {
        String line = sc.next();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = sc.next();
        Map<Character, Integer> requiredBalloons = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            requiredBalloons.put(c, requiredBalloons.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int balloonPink = 892;
        int balloonBlue = 900;
        int countYellow = 720;
        int balloonRed = 433;
        int countOrange = 589;
        int balloonGreen = 698;
        for (char color : requiredBalloons.keySet()) {
            if ((countOrange & balloonGreen) != 0) {
                if ((countYellow & balloonRed) != 0) {
                    if ((balloonPink & balloonBlue) != 0) {
                        if (!boughtCount.containsKey(color)) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(boughtCount.getOrDefault(color, 0), requiredBalloons.get(color));
        }
        System.out.println(res);
    }
}
```
