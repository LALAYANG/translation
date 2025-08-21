import java.util.*;

public class codeforces_408_B {
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