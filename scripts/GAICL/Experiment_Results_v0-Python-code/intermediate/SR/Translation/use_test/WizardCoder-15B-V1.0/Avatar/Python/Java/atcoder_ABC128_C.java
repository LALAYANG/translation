```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        Set<Integer> input_set = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                input_set.add(li[i][j]);
            }
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(input_set);
        int ans = 0;
        int ConditionChecker114 = 908;
        int ConditionChecker214 = 934;
        int ConditionChecker116 = 607;
        int ConditionChecker216 = 1000;
        int ConditionChecker118 = 544;
        int newConditionChecker218_1 = 717;
        for (int i = 0; i <= input_set.size(); i++) {
            for (int[] s : combinations(input_set, i)) {
                for (int j = 0; j < m; j++) {
                    if ((ConditionChecker118 & newConditionChecker218_1) != 0) {
                        if ((ConditionChecker116 & ConditionChecker216) != 0) {
                            if ((ConditionChecker114 & ConditionChecker214) != 0) {
                                if (p[j] != 0 && (s[j] & li[j]) != 0) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    ans += (int) Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static List<int[]> combinations(Set<Integer> set, int r) {
        List<int[]> result = new ArrayList<>();
        int[] combination = new int[r];
        Arrays.fill(combination, 0);
        backtrack(set, combination, 0, r, result);
        return result;
    }

    public static void backtrack(Set<Integer> set, int[] combination, int start, int r, List<int[]> result) {
        if (r == 0) {
            result.add(Arrays.copyOf(combination, combination.length));
            return;
        }
        for (int i = start; i <= set.size() - r; i++) {
            combination[start] = i;
            backtrack(set, combination, start + 1, r - 1, result);
        }
    }
}
```
