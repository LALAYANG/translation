import java.util.*;

public class atcoder_ABC128_C {
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
        Set<Integer> q = new HashSet<>();
        for (int i = 0; i < n; i++) {
            q.add(i + 1);
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        Set<Integer> v = new HashSet<>(r);
        v.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (Set<Integer> s : Sets.combinations(q, i)) {
                for (int j = 0; j < m; j++) {
                    if (isValidCombination(s, li[j], p[j])) {
                        break;
                    }
                } else {
                    ans += Math.pow(2, v.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static boolean isValidCombination(Set<Integer> s, int[] u, int w) {
        Set<Integer> s1 = new HashSet<>(s);
        s1.retainAll(Arrays.stream(u).boxed().collect(Collectors.toList()));
        return s1.size() % 2 != w;
    }
}