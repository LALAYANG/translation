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
            List<Integer> list = new ArrayList<>(q);
            List<List<Integer>> combinations = getCombinations(list, i);
            for (List<Integer> combination : combinations) {
                boolean flag = true;
                for (int j = 0; j < m; j++) {
                    int count = 0;
                    for (int k = 0; k < n; k++) {
                        if (combination.contains(li[j][k])) {
                            count++;
                        }
                    }
                    if (count % 2 != p[j]) {
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

    public static List<List<Integer>> getCombinations(List<Integer> list, int length) {
        if (length == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        if (list.isEmpty()) {
            return new ArrayList<>();
        }
        List<List<Integer>> result = new ArrayList<>();
        int head = list.get(0);
        List<Integer> rest = new ArrayList<>(list.subList(1, list.size()));
        for (List<Integer> combination : getCombinations(rest, length - 1)) {
            combination.add(0, head);
            result.add(combination);
        }
        result.addAll(getCombinations(rest, length));
        return result;
    }
}