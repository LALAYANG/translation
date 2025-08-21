import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class codeforces_369_B {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int unused_variable = scanner.nextInt();
        int r = scanner.nextInt();
        int total_set_size = scanner.nextInt();
        int sk = scanner.nextInt();
        scanner.close();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<List<Integer>> future = executor.submit(new Callable<List<Integer>>() {
            @Override
            public List<Integer> call() throws Exception {
                return calculate_combinations(n, k, sk, total_set_size, Func_get_nums_0);
            }
        });
        List<Integer> combinations_result = future.get();
        executor.shutdown();
        List<Integer> ans = combinations_result;
        System.out.println(ans.stream().map(Object::toString).collect(Collectors.joining(" ")));
    }

    public static List<Integer> calculate_combinations(int n, int k, int sk, int total_set_size, Func_get_nums_0 Func_get_nums_0) {
        return sum_lists(Func_get_nums_0.get_nums_0(k, sk), Func_get_nums_0.get_nums_0(n - k, total_set_size - sk));
    }

    public static List<Integer> sum_lists(List<Integer> arg0, List<Integer> arg1) {
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < arg0.size(); i++) {
            result.add(arg0.get(i) + arg1.get(i));
        }
        return result;
    }

    public static class Func_get_nums_0 {
        public static List<Integer> get_nums_0(int num, int t) {
            return IntStream.range(0, num).map(i -> t / num + (i < t % num ? 1 : 0)).boxed().collect(Collectors.toList());
        }
    }
}