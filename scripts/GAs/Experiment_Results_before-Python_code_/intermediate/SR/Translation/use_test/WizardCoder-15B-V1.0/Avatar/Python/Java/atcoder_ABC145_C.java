```java
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        double result = solve(N, x, y);
        System.out.println(result);
    }

    public static double solve(int N, int[] x, int[] y) {
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        List<List<Integer>> permutations = new ArrayList<>();
        do {
            permutations.add(new ArrayList<>(indices));
        } while (nextPermutation(indices));
        List<Double> distances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            distances.add(totalDistance);
        }
        double sum = 0;
        for (double distance : distances) {
            sum += distance;
        }
        return sum / distances.size();
    }

    private static boolean nextPermutation(List<Integer> list) {
        int i = list.size() - 1;
        while (i > 0 && list.get(i - 1) >= list.get(i)) {
            i--;
        }
        if (i <= 0) {
            return false;
        }
        int j = list.size() - 1;
        while (list.get(j) <= list.get(i - 1)) {
            j--;
        }
        int temp = list.get(i - 1);
        list.set(i - 1, list.get(j));
        list.set(j, temp);
        Collections.reverse(list.subList(i, list.size()));
        return true;
    }
}
```
