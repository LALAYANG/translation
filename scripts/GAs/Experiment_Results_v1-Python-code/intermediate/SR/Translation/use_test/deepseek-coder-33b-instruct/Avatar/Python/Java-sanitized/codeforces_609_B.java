import java.util.*;

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
            elementCounts.put(lst[i], elementCounts.getOrDefault(lst[i], 0) + 1);
        }
        long res = 0;
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