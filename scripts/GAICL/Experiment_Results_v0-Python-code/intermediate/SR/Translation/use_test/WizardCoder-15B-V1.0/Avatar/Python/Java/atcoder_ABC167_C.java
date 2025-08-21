```java
import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int x = Integer.parseInt(input[2]);
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            String[] input2 = br.readLine().split(" ");
            for (int j = 0; j < m; j++) {
                c[i][j] = Integer.parseInt(input2[j]);
            }
        }
        int[] indices = new int[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            for (List<Integer> j : combinations(indices, i)) {
                combinations.add(j);
            }
        }
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (List<Integer> j : combinations) {
                int currentCost = 0;
                for (int k : j) {
                    currentCost += c[k][i];
                }
                if (currentCost < x) {
                    rem.add(0, j.size() - 1);
                }
            }
            if (rem.size() > 0) {
                for (int j : rem) {
                    combinations.remove(j);
                }
                rem.clear();
            }
            if (combinations.size() == 0) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> i : combinations) {
            int currentCost = 0;
            for (int j : i) {
                currentCost += c[j][0];
            }
            if (ans == 0) {
                ans = currentCost;
            } else {
                ans = Math.min(ans, currentCost);
            }
        }
        System.out.println(ans);
    }

    public static List<List<Integer>> combinations(int[] indices, int r) {
        List<List<Integer>> result = new ArrayList<>();
        if (r == 0) {
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> subCombs = combinations(indices, r - 1);
        for (List<Integer> subComb : subCombs) {
            for (int i : indices) {
                if (!subComb.contains(i)) {
                    List<Integer> newComb = new ArrayList<>(subComb);
                    newComb.add(i);
                    result.add(newComb);
                }
            }
        }
        return result;
    }
}
```
