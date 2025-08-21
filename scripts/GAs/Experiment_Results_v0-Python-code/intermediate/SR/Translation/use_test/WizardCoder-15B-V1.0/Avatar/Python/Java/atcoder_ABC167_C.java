```java
import java.util.*;
import java.util.stream.*;

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
        int[] indices = IntStream.range(0, n).toArray();
        List<List<Integer>> combinations = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            List<List<Integer>> temp = new ArrayList<>();
            for (List<Integer> j : combinations) {
                for (int k : j) {
                    temp.add(new ArrayList<>(j));
                }
            }
            combinations = temp;
            for (int j = 0; j < combinations.size(); j++) {
                List<Integer> k = combinations.get(j);
                int currentCost = 0;
                for (int ii : k) {
                    currentCost += c[ii][i];
                }
                if (currentCost < x) {
                    rem.add(j);
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
                ans = current_cost;
            } else {
                ans = Math.min(ans, current_cost);
            }
        }
        System.out.println(ans);
    }
}
```
