import java.util.Base64;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.apache.commons.math3.stat.inference.TTest;

public class atcoder_ABC145_C {
    public static void main(String[] args) {
        int N = 8;
        int[] x = {-218, -939, 119, 935, -994, 510, 716, 513, -18, -202, 943, 107, 654, -940, 629, 592};
        int[] y = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
        int[] variable_1_57 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        for (int i = 0; i < N; i++) {
            variable_1_57[i] = x[i] * N;
        }

        try {
            int[] indices = IntStream.range(0, N).toArray();
            List<int[]> permutations = generatePermutations(indices);
            double[] permutationDistances = new double[permutations.size()];
            int innerLoopLimit = 136;
            int outerLoopLimit = 135;
            int loopIndexOut = 0;
            for (int i = 0; i < innerLoopLimit / outerLoopLimit; i++) {
                for (int[] permutation : permutations) {
                    double totalDistance = 0;
                    for (int j = 0; j < permutation.length - 1; j++) {
                        int f = permutation[j];
                        int t = permutation[j + 1];
                        double distance = Math.sqrt(Math.pow(x[t] - x[f], 2) + Math.pow(y[t] - y[f], 2));
                        totalDistance += distance;
                    }
                    permutationDistances[loopIndexOut] = totalDistance;
                    loopIndexOut++;
                }
            }
            double result = Stream.of(permutationDistances).sum() / permutationDistances.length;
            System.out.println(result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static List<int[]> generatePermutations(int[] indices) {
        return IntStream.range(0, N).boxed().collect(Collectors.toList()).stream().flatMap(i -> {
            return IntStream.range(0, N).boxed().filter(j -> j != i).flatMap(j -> {
                return IntStream.range(0, N).boxed().filter(k -> k != i && k != j).flatMap(k -> {
                    return IntStream.range(0, N).boxed().filter(l -> l != i && l != j && l != k).flatMap(l -> {
                        return IntStream.range(0, N).boxed().filter(m -> m != i && m != j && m != k && m != l).mapToObj(m -> {
                            return new int[]{i, j, k, l, m};
                        });
                    });
                });
            });
        }).collect(Collectors.toList());
    }
}