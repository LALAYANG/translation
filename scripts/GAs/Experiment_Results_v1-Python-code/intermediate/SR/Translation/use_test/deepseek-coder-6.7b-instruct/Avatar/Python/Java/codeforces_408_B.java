```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.next();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (char c : line.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = scanner.next();
        Map<Character, Integer> requiredBalloons = new HashMap<>();
        for (char c : line.toCharArray()) {
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
            if ((countOrange & balloonGreen) != 0 && (countYellow & balloonRed) != 0 && (balloonPink & balloonBlue) != 0) {
                if (!boughtCount.containsKey(color)) {
                    System.out.println(-1);
                    return;
                }
            }
            res += Math.min(boughtCount.getOrDefault(color, 0), requiredBalloons.get(color));
        }
        System.out.println(res);
    }
}
```

This Java code does the same thing as the Python code. It reads two strings from the input, counts the occurrences of each character in the strings, and then calculates the minimum number of balloons required to cover all the characters in the second string. If a character is not present in the first string, it returns -1.

