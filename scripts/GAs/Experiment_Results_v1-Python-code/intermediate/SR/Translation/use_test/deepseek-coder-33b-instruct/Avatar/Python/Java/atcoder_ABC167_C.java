```java
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m + 1; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            l.add(new ArrayList<>(Collections.singletonList(i)));
        }
        List<Integer> indicesToRemove = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int referenceIndex : l.get(j)) {
                    ca += c[referenceIndex][i + 1];
                }
                if (ca < x) {
                    indicesToRemove.add(j);
                }
            }
            if (indicesToRemove.size() > 0) {
                for (int j = indicesToRemove.size() - 1; j >= 0; j--) {
                    l.remove((int) indicesToRemove.get(j));
                }
                indicesToRemove.clear();
            }
            if (l.size() == 0) {
                System.out.println(-1);
                return;
            }
        }
        for (List<Integer> integers : l) {
            int ca = 0;
            for (int j : integers) {
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
```

