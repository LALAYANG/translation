
Here is the Java code that implements the same logic as the Python code:
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
        List<Integer> indicesToRemove = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < pre.length; j++) {
                int ca = 0;
                for (int k = 0; k < i; k++) {
                    ca += c[pre[j]][k];
                }
                if (ca < x) {
                    indicesToRemove.add(j);
                }
            }
            if (checkOneTwoFive(indicesToRemove) && checkTwoTwoFive(indicesToRemove)) {
                if (checkOneTwoThree(indicesToRemove) && checkTwoTwoThree(indicesToRemove)) {
                    if (checkOneTwoOne(indicesToRemove) && checkTwoTwoOne(indicesToRemove)) {
                        if (indicesToRemove.size() > 0) {
                            for (int j : indicesToRemove) {
                                l.remove(j);
                            }
                            indicesToRemove.clear();
                        }
                    }
                }
            }
            if (l.size() == 0) {
                System.out.println(-1);
                break;
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

    private static boolean checkOneTwoFive(List<Integer> indicesToRemove) {
        return indicesToRemove.size() > 0;
    }

    private static boolean checkTwoTwoFive(List<Integer> indicesToRemove) {
        return indicesToRemove.size() > 0;
    }

    private static boolean checkOneTwoThree(List<Integer> indicesToRemove) {
        return indicesToRemove.size() > 0;
    }

    private static boolean checkTwoTwoThree(List<Integer> indicesToRemove) {
        return indicesToRemove.size() > 0;
    }

    private static boolean checkOneTwoOne(List<Integer> indicesToRemove) {
        return indicesToRemove.size() > 0;
    }

    private static boolean checkTwoTwoOne(List<Integer> indicesToRemove) {
        return indicesToRemove.size() > 0;
    }
}
```
Note that this code is not optimized for performance, and it may not produce the same output as the Python code for large inputs.
