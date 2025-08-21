import java.util.*;
import java.util.stream.*;

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
            for (int[] combination : combinations(q, i)) {
                Set<Integer> s = new HashSet<>();
                for (int num : combination) {
                    s.add(num);
                }
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    if (intersectionSize(s, li[j]) % 2 != p[j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    ans += (int) Math.pow(2, r.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static <T> List<T[]> combinations(Set<T> set, int k) {
        List<T[]> result = new ArrayList<>();
        T[] data = (T[]) set.toArray();
        combinations(data, k, 0, new T[k], result);
        return result;
    }

    public static <T> void combinations(T[] set, int k, int start, T[] buffer, List<T[]> result) {
        if (k == 0) {
            result.add(buffer.clone());
            return;
        }
        for (int i = start; i <= set.length - k; i++) {
            buffer[buffer.length - k] = set[i];
            combinations(set, k - 1, i + 1, buffer, result);
        }
    }

    public static <T> int intersectionSize(Set<T> set1, T[] set2) {
        Set<T> intersection = new HashSet<>(set1);
        intersection.retainAll(new HashSet<>(Arrays.asList(set2)));
        return intersection.size();
    }
}