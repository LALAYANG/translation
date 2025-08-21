import java.util.*;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int[] comb : combinations(n, i)) {
                l.add(Arrays.asList(comb));
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int k : l.get(j)) {
                    ca += c[k][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (!rem.isEmpty()) {
                for (int j = rem.size() - 1; j >= 0; j--) {
                    l.remove((int) rem.get(j));
                }
                rem.clear();
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> i : l) {
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

    public static List<int[]> combinations(int n, int k) {
        return combinations(new int[k], 0, n, k);
    }

    public static List<int[]> combinations(int[] data, int start, int n, int k) {
        List<int[]> result = new ArrayList<>();
        if (k == 0) {
            result.add(data.clone());
            return result;
        }
        if (n == k) {
            for (int i = start; i < n; i++) {
                data[i] = i;
            }
            result.add(data.clone());
            return result;
        }
        for (int i = start; i <= n - k; i++) {
            data[i] = i;
            result.addAll(combinations(data, i + 1, n, k - 1));
        }
        return result;
    }
}