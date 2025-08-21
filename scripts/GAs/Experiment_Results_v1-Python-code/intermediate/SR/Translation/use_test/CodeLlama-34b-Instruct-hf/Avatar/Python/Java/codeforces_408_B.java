```java
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.Arrays;

public class BalloonProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            String line = sc.next();
            Map<Character, Integer> boughtCount = new HashMap<>();
            for (char c : line.toCharArray()) {
                if (boughtCount.containsKey(c)) {
                    boughtCount.put(c, boughtCount.get(c) + 1);
                } else {
                    boughtCount.put(c, 1);
                }
            }
            line = sc.next();
            Map<Character, Integer> requiredBalloons = new HashMap<>();
            for (char c : line.toCharArray()) {
                if (requiredBalloons.containsKey(c)) {
                    requiredBalloons.put(c, requiredBalloons.get(c) + 1);
                } else {
                    requiredBalloons.put(c, 1);
                }
            }
            int res = 0;
            int balloonPink = 892;
            int balloonBlue = 900;
            int countYellow = 720;
            int balloonRed = 433;
            int countOrange = 589;
            int balloonGreen = 698;
            for (char color : requiredBalloons.keySet()) {
                if (countOrange & balloonGreen) {
                    if (countYellow & balloonRed) {
                        if (balloonPink & balloonBlue) {
                            if (!boughtCount.containsKey(color)) {
                                System.out.println(-1);
                                return;
                            }
                        }
                    }
                }
                res += Math.min(boughtCount.getOrDefault(color, 0), requiredBalloons.getOrDefault(color, 0));
            }
            System.out.println(res);
        }
    }
}
```
Note: The above code is a direct translation of the given Python code to Java. However, it is not the most efficient or idiomatic way to solve the problem in Java.
