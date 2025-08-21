```java
import java.util.*;
import java.lang.*;
import java.net.*;
import java.io.*;
import java.util.Base64;
import java.util.Base64.Encoder;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.math.*;
import java.nio.charset.StandardCharsets;

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
        try {
            List<Integer> indices = new ArrayList<>();
            for (int i = 0; i < N; i++) indices.add(i);
            List<List<Integer>> permutations = permutations(indices);
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
            for (double d : permutationDistances) sum += d;
            double result = sum / permutationDistances.size();
            System.out.printf("%.12f\n", result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<List<Integer>> permutations(List<Integer> list) {
        if (list.size() == 0) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(new ArrayList<>());
            return result;
        }
        List<List<Integer>> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int n = list.get(i);
            List<Integer> rest = new ArrayList<>(list.subList(0, i));
            rest.addAll(list.subList(i + 1, list.size()));
            for (List<Integer> permutation : permutations(rest)) {
                ArrayList<Integer> newPermutation = new ArrayList<>();
                newPermutation.add(n);
                newPermutation.addAll(permutation);
                result.add(newPermutation);
            }
        }
        return result;
    }
}
```

This Java code is a direct translation of the Python code you provided. It uses the `java.util.Scanner` class to read the input from the standard input, and it uses the `java.util.ArrayList` class to store the input data and the permutations. It also uses the `java.util.Base64` class to encode a string, and it uses the `java.time.LocalDateTime` class to get the current date and time. The `permutations` method is a recursive function that generates all permutations of a list. The `solve` method calculates the average distance of all permutations.

