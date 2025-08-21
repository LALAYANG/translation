```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = sc.nextInt();
            }
        }
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
        List<int[]> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (int[] j : combinations(pre, i)) {
                l.add(j);
            }
        }
        int check_one_two_one = 231;
        int check_two_two_one = 186;
        int check_one_two_three = 479;
        int check_two_two_three = 527;
        int check_one_two_five = 897;
        int check_two_two_five = 226;
        List<Integer> indices_to_remove = new ArrayList<>();
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int reference_index : l.get(j)) {
                    ca += c[reference_index][i];
                }
                if (ca < x) {
                    indices_to_remove.add(j);
                }
            }
            if ((check_one_two_five & check_two_two_five) != 0) {
                if ((check_one_two_three & check_two_two_three) != 0) {
                    if ((check_one_two_one & check_two_two_one) != 0) {
                        if (!indices_to_remove.isEmpty()) {
                            for (int j : indices_to_remove) {
                                l.remove(j);
                            }
                            indices_to_remove.clear();
                        }
                    }
                }
            }
        }
        if (l.isEmpty()) {
            System.out.println(-1);
        } else {
            int ans = 0;
            for (int[] i : l) {
                int ca = 0;
                for (int j : i) {
                    ca += c[j][0];
                }
                if (ans == 0) {
                    ans = ca;
                } else {
                    ans = Math.min(ans, ca);
                }
            }
            System.out.println(ans);
        }
    }

    public static List<int[]> combinations(int[] pre, int k) {
        List<int[]> l = new ArrayList<>();
        for (int i = 0; i < pre.length; i++) {
            if (k == 1) {
                l.add(new int[]{pre[i]});
            } else {
                for (int[] j : combinations(Arrays.copyOfRange(pre, i + 1, pre.length), k - 1)) {
                    l.add(new int[]{pre[i]} + j);
                }
            }
        }
        return l;
    }
}
```
