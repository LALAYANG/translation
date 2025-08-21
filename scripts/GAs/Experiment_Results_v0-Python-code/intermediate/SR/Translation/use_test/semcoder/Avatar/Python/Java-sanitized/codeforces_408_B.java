import java.util.*;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String boughtColors = scanner.nextLine();
        String madeColors = scanner.nextLine();

        Map<Character, Integer> boughtCount = new HashMap<>();
        Map<Character, Integer> madeCount = new HashMap<>();

        for (char color : boughtColors.toCharArray()) {
            boughtCount.put(color, boughtCount.getOrDefault(color, 0) + 1);
        }

        for (char color : madeColors.toCharArray()) {
            madeCount.put(color, madeCount.getOrDefault(color, 0) + 1);
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
            res += Math.min(boughtCount.getOrDefault(color, 0), madeCount.get(color));
        }

        System.out.println(res);
    }
}