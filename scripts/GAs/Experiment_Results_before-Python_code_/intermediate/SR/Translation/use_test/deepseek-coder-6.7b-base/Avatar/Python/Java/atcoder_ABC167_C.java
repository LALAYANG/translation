
```
import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws java.lang.Exception {
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
        List<List<Integer>> l = new ArrayList<List<Integer>>();
        List<Integer> rem = new ArrayList<Integer>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (List<Integer> j : combinations(pre, i)) {
                l.add(j);
            }
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int ii : l.get(j)) {
                    ca += c[ii][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if (rem.size() > 0) {
                for (int j = rem.size() - 1; j >= 0; j--) {
                    l.remove(rem.get(j).intValue());
                }
                rem = new ArrayList<Integer>();
            }
            if (l.size() == 0) {
                System.out.println(-1);
                break;
            }
        }
        if (l.size() > 0) {
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

    public static List<List<Integer>> combinations(int[] pre, int r) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        if (r > pre.length) {
            return list;
        }
        if (r <= 0) {
            return list;
        }
        if (r == pre.length) {
            List<Integer> tempList = new ArrayList<Integer>();
            for (int i = 0; i < pre.length; i++) {
                tempList.add(pre[i]);
            }
            list.add(tempList);
            return list;
        }
        for (int i = 0; i < pre.length; i++) {
            int[] temp = new int[pre.length - 1];
            for (int j = 0, k = 0; j < pre.length; j++) {
                if (j != i) {
                    temp[k++] = pre[j];
                }
            }
            List<List<Integer>> tempList = combinations(temp, r - 1);
            if (tempList.size() != 0) {
                for (List<Integer> li : tempList) {
                    li.add(pre[i]);
                }
                list.addAll(tempList);
            }
        }
        return list;
    }
}

```

