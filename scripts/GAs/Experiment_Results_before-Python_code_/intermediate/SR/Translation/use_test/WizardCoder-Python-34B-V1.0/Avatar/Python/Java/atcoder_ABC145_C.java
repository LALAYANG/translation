```java
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = scanner.nextInt();
            y[i] = scanner.nextInt();
        }
        solve(N, x, y);
    }

    public static void solve(int N, int[] x, int[] y) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        List<Double> distances = new ArrayList<>();
        for (List<Integer> permutation : generatePermutations(indices)) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            distances.add(totalDistance);
        }
        double result = distances.stream().mapToDouble(Double::doubleValue).average().orElse(0.0);
        System.out.printf("%.10f\n", result);
    }

    public static List<List<Integer>> generatePermutations(List<Integer> indices) {
        List<List<Integer>> result = new ArrayList<>();
        generatePermutationsHelper(indices, new ArrayList<>(), new boolean[indices.size()], result);
        return result;
    }

    private static void generatePermutationsHelper(List<Integer> indices, List<Integer> current, boolean[] used, List<List<Integer>> result) {
        if (current.size() == indices.size()) {
            result.add(new ArrayList<>(current));
            return;
        }
        for (int i = 0; i < indices.size(); i++) {
            if (!used[i]) {
                current.add(indices.get(i));
                used[i] = true;
                generatePermutationsHelper(indices, current, used, result);
                current.remove(current.size() - 1);
                used[i] = false;
            }
        }
    }
}
```

Test input:
8
-218 -939
119 935
-994 510
716 513
-18 -202
943 107
654 -940
629 592

Expected output:
8757.2238077003
``` 
