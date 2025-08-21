```java
import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int x = scanner.nextInt();
        int[][] c = new int[n][m+1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m+1; j++) {
                c[i][j] = scanner.nextInt();
            }
        }
        List<List<Integer>> l = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            l.addAll(IntStream.range(0, n)
                    .boxed()
                    .map(num -> num + i)
                    .filter(k -> k < n)
                    .map(k -> IntStream.range(0, i)
                            .boxed()
                            .map(j -> (k + j) % n)
                            .collect(Collectors.toList()))
                    .collect(Collectors.toList()));
        }
        List<Integer> indicesToRemove = new ArrayList<>();
        int ans = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 0; j < l.size(); j++) {
                int ca = 0;
                for (int referenceIndex : l.get(j)) {
                    ca += c[referenceIndex][i];
                }
                if (ca < x) {
                    indicesToRemove.add(j);
                }
            }
            l.removeIf(indicesToRemove::contains);
            if (l.size() == 0) {
                System.out.println(-1);
                return;
            }
        }
        if (ans == 0) {
            ans = l.stream()
                    .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                    .sum();
        } else {
            ans = l.stream()
                    .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                    .sum();
            ans = Math.min(ans, l.stream()
                    .flatMapToInt(list -> list.stream().mapToInt(Integer::intValue))
                    .sum());
        }
        System.out.println(ans);
    }
}
```

This Java code does the same thing as the Python code. It reads the input, creates a list of combinations of indices, and then checks if the sum of the values at these indices is less than `x`. If it is, it adds the index to a list of indices to remove. It then removes these indices from the list of combinations. If the list of combinations is empty, it prints `-1`. Otherwise, it finds the minimum sum of the values at the indices in the remaining combinations and prints this.

