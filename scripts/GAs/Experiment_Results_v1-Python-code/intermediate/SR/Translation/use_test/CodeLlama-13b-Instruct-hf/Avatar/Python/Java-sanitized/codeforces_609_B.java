import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class codeforces_609_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] lst = new int[n];
        for (int i = 0; i < n; i++) {
            lst[i] = scanner.nextInt();
        }
        Map<Integer, Integer> elementCounts = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (elementCounts.containsKey(lst[i])) {
                elementCounts.put(lst[i], elementCounts.get(lst[i]) + 1);
            } else {
                elementCounts.put(lst[i], 1);
            }
        }
        int res = 0;
        for (int i = 0; i < n; i++) {
            if (elementCounts.get(lst[i]) > 1) {
                res += n - i - elementCounts.get(lst[i]);
                elementCounts.put(lst[i], elementCounts.get(lst[i]) - 1);
            } else {
                res += n - i - 1;
            }
        }
        System.out.println(res);
    }
}