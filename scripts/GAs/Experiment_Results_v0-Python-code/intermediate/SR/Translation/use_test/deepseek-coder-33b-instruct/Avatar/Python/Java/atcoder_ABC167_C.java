```java
import java.util.*;

public class Main {
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
        List<List<Integer>> combinations = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            combinations.add(new ArrayList<>(Collections.singletonList(i)));
        }
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < combinations.size(); j++) {
                int currentCost = 0;
                for (int ii : combinations.get(j)) {
                    currentCost += c[ii][i];
                }
                if (currentCost < x) {
                    rem.add(j);
                }
            }
            if (rem.size() > 0) {
                for (int j = rem.size() - 1; j >= 0; j--) {
                    combinations.remove(rem.get(j).intValue());
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
}
```

