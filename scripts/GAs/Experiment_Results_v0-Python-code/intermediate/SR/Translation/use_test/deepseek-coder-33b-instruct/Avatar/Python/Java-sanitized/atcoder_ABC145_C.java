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
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        List<List<Integer>> permutations = permute(indices);
        List<Double> permutationDistances = new ArrayList<>();
        for (List<Integer> permutation : permutations) {
            double totalDistance = 0;
            for (int i = 0; i < N - 1; i++) {
                int f = permutation.get(i);
                int t = permutation.get(i + 1);
                double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                totalDistance += distance;
            }
            permutationDistances.add(totalDistance);
        }
        double result = permutationDistances.stream().mapToDouble(val -> val).average().orElse(0.0);
        System.out.println(result);
    }

    public static List<List<Integer>> permute(List<Integer> nums) {
        List<List<Integer>> result = new ArrayList<>();
        if (nums.size() == 0) {
            result.add(new ArrayList<>());
        } else {
            for (int i = 0; i < nums.size(); i++) {
                List<Integer> newNums = new ArrayList<>(nums);
                newNums.remove(i);
                List<List<Integer>> newPermutations = permute(newNums);
                for (List<Integer> newPermutation : newPermutations) {
                    newPermutation.add(0, nums.get(i));
                    result.add(newPermutation);
                }
            }
        }
        return result;
    }
}