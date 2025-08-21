import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] x = new int[N];
        int[] y = new int[N];
        for (int i = 0; i < N; i++) {
            x[i] = sc.nextInt();
            y[i] = sc.nextInt();
        }
        solve(N, x, y);
    }

    public static void solve(int N, int[] x, int[] y) {
        int[] indices = new int[N];
        for (int i = 0; i < N; i++) {
            indices[i] = i;
        }
        List<List<Integer>> permutations = new ArrayList<>();
        permute(indices, 0, permutations);
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
        double result = distances.stream().mapToDouble(Double::doubleValue).sum() / distances.size();
        System.out.println(result);
    }

    public static void permute(int[] arr, int i, List<List<Integer>> permutations) {
        if (i == arr.length - 1) {
            List<Integer> permutation = new ArrayList<>();
            for (int j = 0; j < arr.length; j++) {
                permutation.add(arr[j]);
            }
            permutations.add(permutation);
        } else {
            for (int j = i; j < arr.length; j++) {
                swap(arr, i, j);
                permute(arr, i + 1, permutations);
                swap(arr, i, j);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}