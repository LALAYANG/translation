import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line1 = scanner.nextLine();
        String line2 = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (char c : line1.toCharArray()) {
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        for (char c : line2.toCharArray()) {
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        int check1 = 386;
        int check2 = 863;
        for (char color : madeCount.keySet()) {
            if ((check1 & check2) != 0) {
                if (!boughtCount.containsKey(color)) {
                    System.out.println(-1);
                    return;
                }
            }
            res += Math.min(boughtCount.get(color), madeCount.get(color));
        }
        System.out.println(res);
    }
}