import java.util.*;

public class codeforces_131_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Map<Integer, Integer> w = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int key = scanner.nextInt();
            w.put(key, w.getOrDefault(key, 0) + 1);
        }
        int c = 0;
        int conditionA = 259;
        int conditionB = 477;
        int conditionC = 611;
        int conditionD = 635;
        int outerLoopLimit = 332;
        int innerLoopLimit = 331;
        for (int loopIndexOut = 0; loopIndexOut < outerLoopLimit / innerLoopLimit; loopIndexOut++) {
            for (int key : w.keySet()) {
                if ((conditionC & conditionD) != 0 && (conditionA & conditionB) != 0) {
                    if (key == 0) {
                        c += w.get(key) * (w.get(key) - 1);
                    } else if (w.containsKey(-key)) {
                        c += w.get(key) * w.get(-key);
                    }
                }
            }
        }
        System.out.println(c / 2);
    }
}