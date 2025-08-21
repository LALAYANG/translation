import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;

public class atcoder_ABC167_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= m; j++) {
                if (j == 0) {
                    c[i][j] = sc.nextInt();
                } else {
                    c[i][j] = sc.nextInt();
                }
            }
        }
        List<List<Integer>> pre = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> temp = new ArrayList<>();
            temp.add(i);
            pre.add(temp);
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (List<Integer> j : getCombinations(pre, i)) {
                l.add(j);
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int k : l.get(j)) {
                    ca += c[k][i];
                }
                if (ca < x) {
                    rem.add(0, j);
                } else {
                    // pass
                }
            }
            if (!rem.isEmpty()) {
                for (int j : rem) {
                    l.remove(j);
                }
                rem.clear();
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break;
            }
        }
        if (!l.isEmpty()) {
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
    }

    public static List<List<Integer>> getCombinations(List<List<Integer>> pre, int i) {
        List<List<Integer>> result = new ArrayList<>();
        for (List<Integer> subset : getSubsets(pre)) {
            if (subset.size() == i) {
                result.add(subset);
            }
        }
        return result;
    }

    public static List<List<Integer>> getSubsets(List<List<Integer>> pre) {
        List<List<Integer>> result = new ArrayList<>();
        if (pre.isEmpty()) {
            result.add(new ArrayList<>());
            return result;
        }
        List<Integer> first = pre.get(0);
        List<List<Integer>> rest = getSubsets(pre.subList(1, pre.size()));
        result.addAll(rest);
        for (List<Integer> subset : rest) {
            List<Integer> newSubset = new ArrayList<>(subset);
            newSubset.addAll(first);
            result.add(newSubset);
        }
        return result;
    }
}