import java.util.*;

public class atcoder_ABC145_C {
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
        List<List<Integer>> permutations = new ArrayList<>();
        generatePermutations(N, new ArrayList<>(), permutations);
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
        double result = distances.stream().mapToDouble(Double::doubleValue).average().orElse(0);
        System.out.println(result);
    }

    public static void generatePermutations(int N, List<Integer> current, List<List<Integer>> permutations) {
        if (current.size() == N) {
            permutations.add(new ArrayList<>(current));
        } else {
            for (int i = 0; i < N; i++) {
                if (current.contains(i)) {
                    continue;
                }
                current.add(i);
                generatePermutations(N, current, permutations);
                current.remove(current.size() - 1);
            }
        }
    }
}