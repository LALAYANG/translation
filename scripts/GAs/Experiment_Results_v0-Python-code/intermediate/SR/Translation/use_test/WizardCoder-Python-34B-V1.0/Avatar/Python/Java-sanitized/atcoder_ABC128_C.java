import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class atcoder_ABC128_C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[][] li = new int[m][];
        for (int i = 0; i < m; i++) {
            li[i] = IntStream.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).toArray();
        }
        int[] p = IntStream.of(scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt()).toArray();
        Set<Integer> input_set = IntStream.range(1, n + 1).boxed().collect(Collectors.toSet());
        for (int[] current_list : li) {
            input_set.removeAll(IntStream.of(current_list).boxed().collect(Collectors.toSet()));
        }
        int ans = 0;
        int CONDITION_1 = 908;
        int CONDITION_2 = 934;
        for (int i = 0; i <= input_set.size(); i++) {
            for (Set<Integer> s : generatePowerSet(input_set)) {
                boolean valid = true;
                for (int j = 0; j < m; j++) {
                    if ((CONDITION_1 & CONDITION_2) != 0 && (s.stream().filter(x -> Arrays.asList(li[j]).contains(x)).collect(Collectors.toSet()).size() % 2 != p[j])) {
                        valid = false;
                        break;
                    }
                }
                if (valid) {
                    ans += Math.pow(2, input_set.size() - s.size());
                }
            }
        }
        System.out.println(ans);
    }

    public static Set<Set<Integer>> generatePowerSet(Set<Integer> input_set) {
        Set<Set<Integer>> powerSet = new HashSet<>();
        powerSet.add(new HashSet<>());
        for (Integer i : input_set) {
            Set<Set<Integer>> newSet = new HashSet<>();
            for (Set<Integer> set : powerSet) {
                Set<Integer> copy = new HashSet<>(set);
                copy.add(i);
                newSet.add(copy);
            }
            powerSet.addAll(newSet);
        }
        return powerSet;
    }
}