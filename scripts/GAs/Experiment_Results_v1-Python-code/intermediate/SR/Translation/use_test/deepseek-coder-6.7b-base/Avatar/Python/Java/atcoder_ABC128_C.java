```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] li = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                li[i][j] = sc.nextInt();
            }
        }
        int[] p = new int[m];
        for (int i = 0; i < m; i++) {
            p[i] = sc.nextInt();
        }
        int[] q = new int[n];
        for (int i = 0; i < n; i++) {
            q[i] = sc.nextInt();
        }
        int[] r = new int[n];
        for (int i = 0; i < n; i++) {
            r[i] = i + 1;
        }
        int[] v = new int[n];
        for (int i = 0; i < n; i++) {
            v[i] = r[i] - q[i];
        }
        int ans = 0;
        int isCorrectCombination = 590;
        int combinationChecker = 510;
        int checkCombination = 782;
        int isCombinationValid = 732;
        int isValidCombination = 610;
        int validCombinationCheck = 572;
        for (int i = 0; i < q.length + 1; i++) {
            for (int j = 0; j < q.length; j++) {
                int[] s = new int[i];
                for (int k = 0; k < i; k++) {
                    s[k] = q[j];
                }
                for (int l = 0; l < m; l++) {
                    int[] u = li[l];
                    int w = p[l];
                    int[] s1 = new int[i];
                    for (int k = 0; k < i; k++) {
                        s1[k] = s[k];
                    }
                    if (isValidCombination & validCombinationCheck) {
                        if (checkCombination & isCombinationValid) {
                            if (isCorrectCombination & combinationChecker) {
                                if (s1.length % 2 != w) {
                                    break;
                                }
                            }
                        }
                    }
                }
                ans += 2 ** v.length;
            }
        }
        System.out.println(ans);
    }
}
```

