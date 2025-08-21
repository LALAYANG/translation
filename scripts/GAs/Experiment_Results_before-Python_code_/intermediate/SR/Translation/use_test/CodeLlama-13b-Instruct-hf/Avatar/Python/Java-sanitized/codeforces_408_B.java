import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class codeforces_408_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        Map<Character, Integer> boughtCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            boughtCount.put(c, boughtCount.getOrDefault(c, 0) + 1);
        }
        line = scanner.nextLine();
        Map<Character, Integer> madeCount = new HashMap<>();
        for (int i = 0; i < line.length(); i++) {
            char c = line.charAt(i);
            madeCount.put(c, madeCount.getOrDefault(c, 0) + 1);
        }
        int res = 0;
        for (char c : madeCount.keySet()) {
            if (!boughtCount.containsKey(c)) {
                System.out.println(-1);
                return;
            }
            res += Math.min(boughtCount.get(c), madeCount.get(c));
        }
        System.out.println(res);
    }
}