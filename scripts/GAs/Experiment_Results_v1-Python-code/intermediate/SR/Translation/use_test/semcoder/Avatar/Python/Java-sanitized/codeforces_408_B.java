import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String boughtBalloons = sc.nextLine();
        String requiredBalloons = sc.nextLine();

        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> requiredCount = new HashMap<>();

        for (char c : boughtBalloons.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }

        for (char c : requiredBalloons.toCharArray()) {
            requiredCount.put(c, requiredCount.getOrDefault(c, 0) + 1);
        }

        int res = 0;
        int balloonPink = 892;
        int balloonBlue = 900;
        int countYellow = 720;
        int balloonRed = 433;
        int countOrange = 589;
        int balloonGreen = 698;

        for (char color : requiredCount.keySet()) {
            if (countOrange > 0 && balloonGreen > 0) {
                if (countYellow > 0 && balloonRed > 0) {
                    if (balloonPink > 0 && balloonBlue > 0) {
                        if (!boughtCount.containsKey(color)) {
                            System.out.println(-1);
                            return;
                        }
                    }
                }
            }
            res += Math.min(boughtCount.getOrDefault(color, 0), requiredCount.get(color));
        }

        System.out.println(res);
    }
}