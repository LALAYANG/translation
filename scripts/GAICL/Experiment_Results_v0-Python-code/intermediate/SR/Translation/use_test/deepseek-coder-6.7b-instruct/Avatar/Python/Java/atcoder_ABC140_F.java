```java
import java.util.*;
import java.util.stream.*;

class Main {
    static class Pair {
        int first, second;
        Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }

    static boolean check(List<Integer> a, List<Integer> b) {
        int n = a.size(), m = b.size();
        Collections.sort(a);
        Collections.sort(b);
        for (int i = 0; i < n; i++) {
            if (a.get(i) >= b.get(0)) return false;
        }
        for (int i = 0; i < m; i++) {
            if (b.get(i) <= a.get(n - 1)) return false;
        }
        return true;
    }

    static boolean solve(List<Integer> a, List<Integer> b) {
        int n = a.size(), m = b.size();
        List<Integer> s = new ArrayList<>();
        s.addAll(a);
        s.addAll(b);
        Collections.sort(s, Collections.reverseOrder());
        List<Integer> cur = new ArrayList<>();
        boolean[] used = new boolean[n + m];
        cur.add(s.get(0));
        used[0] = true;
        for (int i = 0; i < n + m; i++) {
            int j = 0;
            while (j < cur.size() && j < s.size()) {
                if (!used[j] && s.get(j) < cur.get(cur.size() - 1)) {
                    cur.add(s.get(j));
                    used[j] = true;
                    break;
                }
                j++;
            }
            if (j == cur.size()) return false;
            Collections.sort(cur, Collections.reverseOrder());
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> a = new ArrayList<>();
        List<Integer> b = new ArrayList<>();
        for (int i = 0; i < n; i++) a.add(in.nextInt());
        for (int i = 0; i < n; i++) b.add(in.nextInt());
        System.out.println(solve(a, b) ? "Yes" : "No");
    }
}
```

This Java code reads an integer `n` and two lists of `n` integers each from the standard input. It then checks if the lists can be sorted in non-decreasing order by taking elements from each list in turn, and prints "Yes" if it can, and "No" otherwise.

