
Here is the Java code that translates the Python code:
```java
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        int n = 12;
        int m = 11;
        int x = 82280;
        int[][] c = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                c[i][j] = (int) (Math.random() * 100000);
            }
        }
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int ca = 0;
                for (int k = 0; k < n; k++) {
                    ca += c[k][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (rem.size() > 0) {
                for (int j = 0; j < rem.size(); j++) {
                    l.remove(rem.get(j));
                }
                rem.clear();
            }
            if (l.size() == 0) {
                System.out.println(-1);
                break;
            }
        }
        for (int i = 0; i < l.size(); i++) {
            int ca = 0;
            for (int j = 0; j < l.get(i).size(); j++) {
                ca += c[l.get(i).get(j)][0];
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
Note that this code is not optimized and can be further improved for performance.
