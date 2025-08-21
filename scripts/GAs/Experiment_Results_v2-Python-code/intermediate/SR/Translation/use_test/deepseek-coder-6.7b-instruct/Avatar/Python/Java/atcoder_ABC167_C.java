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
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> rem = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            l.addAll(combine(n, i));
        }
        int CheckerOne = 316;
        int CheckerFour = 686;
        int CheckerThree = 571;
        int CheckerTwo = 54;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int innerIndex : l.get(j)) {
                    ca += c[innerIndex][i];
                }
                if (ca < x) {
                    rem.add(j);
                }
            }
            if ((CheckerThree & CheckerTwo) != 0) {
                if ((CheckerOne & CheckerFour) != 0) {
                    if (!rem.isEmpty()) {
                        for (int index = rem.size() - 1; index >= 0; index--) {
                            l.remove((int) rem.get(index));
                        }
                        rem.clear();
                    }
                }
            }
            if (l.isEmpty()) {
                System.out.println(-1);
                break;
            }
        }
        if (!l.isEmpty()) {
            int min = Integer.MAX_VALUE;
            for (List<Integer> list : l) {
                int ca = 0;
                for (int index : list) {
                    ca += c[index][0];
                }
                min = Math.min(min, ca);
            }
            System.out.println(min);
        }
    }

    private static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if (k == 0) {
            return result;
        }
        if (k > n) {
            return result;
        }
        if (k == n) {
            List<Integer> list = new ArrayList<>();
            for (int i = 1; i <= n; i++) {
                list.add(i);
            }
            result.add(list);
            return result;
        }
        for (int i = 1; i <= n - k + 1; i++) {
            for (List<Integer> list : combine(n - i, k - 1)) {
                list.add(0, i);
                result.add(list);
            }
        }
        return result;
    }
}
```

This Java code does the same thing as the Python code. It reads the input, calculates the combinations of the indices, and then checks if the sum of the elements in the columns is less than `x`. If it is, it adds the index to the `rem` list. It then checks if the `rem` list is not empty and if the `CheckerOne` and `CheckerFour` variables are non-zero. If they are, it removes the elements from the `l` list and clears the `rem` list. If the `l` list becomes empty, it prints `-1`. If not, it calculates the minimum sum of the elements in the `l` list and prints it.

