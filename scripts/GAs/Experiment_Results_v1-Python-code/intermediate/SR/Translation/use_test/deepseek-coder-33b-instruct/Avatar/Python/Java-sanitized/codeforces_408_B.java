import java.util.*;

public class codeforces_408_B {
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