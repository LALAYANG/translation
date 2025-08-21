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
        System.out.println(solve(N, x, y));
    }

    public static double solve(int N, int[] x, int[] y) {
        int[] indices = new int[N];
        for (int i = 0; i < N; i++) indices[i] = i;
        List<int[]> permutations = new ArrayList<>();
        permutation(indices, 0, permutations);
        double totalDistance = 0;
        for (int[] permutation : permutations) {
            double distance = 0;
            for (int i = 0; i < N - 1; i++) {
                int from = permutation[i];
                int to = permutation[i + 1];
                distance += Math.sqrt(Math.pow(x[to] - x[from], 2) + Math.pow(y[to] - y[from], 2));
            }
            totalDistance += distance;
        }
        return totalDistance / permutations.size();
    }

    public static void permutation(int[] array, int start, List<int[]> permutations) {
        if (start == array.length) {
            permutations.add(array.clone());
        } else {
            for (int i = start; i < array.length; i++) {
                swap(array, start, i);
                permutation(array, start + 1, permutations);
                swap(array, start, i);
            }
        }
    }

    public static void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
}
```

This Java code does the same thing as the Python code. It reads the number of points and their coordinates from the input, calculates all possible permutations of the indices, and for each permutation, it calculates the total distance and adds it to a total distance. Finally, it returns the average of all total distances.

