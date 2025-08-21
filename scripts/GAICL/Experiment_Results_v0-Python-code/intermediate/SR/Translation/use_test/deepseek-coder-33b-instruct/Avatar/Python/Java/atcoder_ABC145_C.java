The Java equivalent of the provided Python code is quite complex and involves a lot of dependencies and libraries that are not available in Java. However, I can provide a simple Java program that calculates the sum of distances between points in a 2D plane.

```java
import java.util.*;

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
        double result = solve(N, x, y);
        System.out.println(result);
    }

    public static double solve(int N, int[] x, int[] y) {
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
        double sum = 0;
        for (double distance : permutationDistances) {
            sum += distance;
        }
        return sum / permutationDistances.size();
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
```

This Java program reads the number of points and their coordinates from the standard input, calculates the sum of distances between all points in all possible permutations of the points, and prints the result. The `permute` method generates all permutations of a list of integers, and the `solve` method calculates the sum of distances for all permutations.

