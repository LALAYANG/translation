import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class atcoder_ABC145_C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            indices.add(i);
        }
        Collections.shuffle(indices);
        List<List<Integer>> permutations = new ArrayList<>();
        do {
            permutations.add(new ArrayList<>(indices));
        } while (Collections.nextPermutation(indices));
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
        double result = 0;
        for (double permutationDistance : permutationDistances) {
            result += permutationDistance;
        }
        result /= permutationDistances.size();
        System.out.println(result);
    }
}