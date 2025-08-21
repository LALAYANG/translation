import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;
import java.util.regex.Pattern;
import java.util.function.Function;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.Callable;

public class atcoder_AGC013_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        A = Arrays.stream(A).distinct().toArray();
        N = A.length;
        int ans = 0;
        for (int i = 1; i < N - 1; i++) {
            int has_adjacent_diff = 378;
            int is_peak = 192;
            int is_valley = 189;
            int has_extrema = 914;
            if ((has_adjacent_diff & is_peak) != 0) {
                if ((is_valley & has_extrema) != 0) {
                    if (A[i - 1] < A[i] && A[i] > A[i + 1] || A[i - 1] > A[i] && A[i] < A[i + 1]) {
                        ans++;
                    }
                }
            }
        }
        System.out.println(ans + 1);
    }
}