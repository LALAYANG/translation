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
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line.toCharArray()) {
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