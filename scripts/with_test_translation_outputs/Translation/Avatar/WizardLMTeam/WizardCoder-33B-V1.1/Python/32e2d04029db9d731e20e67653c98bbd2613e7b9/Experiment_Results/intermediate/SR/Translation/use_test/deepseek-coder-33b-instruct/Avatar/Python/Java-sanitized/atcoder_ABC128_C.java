import java.util.*;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = scanner.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = scanner.nextInt();
        }
        Set<Integer> q = new HashSet<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                q.add(li[i][j]);
            }
        }
        Set<Integer> r = new HashSet<>();
        for (int i = 1; i <= n; i++) {
            r.add(i);
        }
        r.removeAll(q);
        int ans = 0;
        for (int i = 0; i <= q.size(); i++) {
            for (Set<Integer> s : combinations(new ArrayList<>(q), i)) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    Set<Integer> u = new HashSet<>();
                    for (int k = 0; k < n; k++) {
                        u.add(li[j][k]);
                    }
                    if (countIntersection(s, u) % 2 != p[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += Math.pow(2, r.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static <T> Set<Set<T>> combinations(List<T> list, int k) {
        Set<Set<T>> result = new HashSet<>();
        if (k == 0) {
            result.add(new HashSet<>());
            return result;
        }
        for (int i = 0; i < list.size(); i++) {
            T element = list.get(i);
            List<T> rest = new ArrayList<>(list.subList(i + 1, list.size()));
            for (Set<T> subset : combinations(rest, k - 1)) {
                subset.add(element);
                result.add(subset);
            }
        }
        return result;
    }

    public static <T> int countIntersection(Set<T> set1, Set<T> set2) {
        int count = 0;
        for (T element : set1) {
            if (set2.contains(element)) {
                count++;
            }
        }
        return count;
    }
}