```java
import java.util.*;

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
        int[] pre = new int[n];
        for (int i = 0; i < n; i++) {
            pre[i] = i;
        }
        List<int[]> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < Math.pow(2, n) - 1; j++) {
                int[] k = new int[i];
                for (int kIndex = 0; kIndex < i; kIndex++) {
                    k[kIndex] = j & (1 << kIndex) - 1;
                }
                int ca = 0;
                for (int innerIndex : k) {
                    ca += c[innerIndex][i - 1];
                }
                if (ca < x) {
                    rem.add(0, l.size());
                } else {
                    l.add(k);
                }
            }
            if (rem.size() > 0) {
                for (int index : rem) {
                    l.remove(index);
                }
                rem.clear();
            }
            if (l.size() == 0) {
                System.out.println(-1);
                return;
            }
            int[] caArr = new int[l.size()];
            for (int j = 0; j < l.size(); j++) {
                int[] k = l.get(j);
                int ca = 0;
                for (int innerIndex : k) {
                    ca += c[innerIndex][0];
                }
                caArr[j] = ca;
            }
            if (ans == 0) {
                ans = Arrays.stream(caArr).min().getAsInt();
            } else {
                ans = Math.min(ans, Arrays.stream(caArr).min().getAsInt());
            }
        }
        System.out.println(ans);
    }
}
```
