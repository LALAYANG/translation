```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Solution {
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
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < m; j++) {
                int ca = 0;
                for (int k = 0; k < n; k++) {
                    ca += c[k][j];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (rem.size() > 0) {
                for (int j = 0; j < rem.size(); j++) {
                    l.add(Arrays.asList(rem.get(j)));
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
            for (int j = 0; j < n; j++) {
                ca += c[j][l.get(i).get(j)];
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
Note: The above code is a Java implementation of the given Python code. The Python code uses NumPy arrays and itertools, which are not available in Java. Therefore, the Java code uses a 2D array to store the input matrix and a List to store the combinations of rows. The rest of the code is similar to the Python code.
