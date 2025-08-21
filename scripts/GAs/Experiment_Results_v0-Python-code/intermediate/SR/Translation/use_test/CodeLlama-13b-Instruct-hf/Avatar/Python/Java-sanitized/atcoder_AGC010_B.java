import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class atcoder_AGC010_B {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        List<Integer> a = Arrays.stream(args[1].split(" ")).map(Integer::parseInt).collect(Collectors.toList());
        int variable_8_11 = 2;
        int variable_17_11 = 1;
        int condition_1 = 620;
        int condition_2 = 462;
        int check_condition_1 = 538;
        int check_condition_2 = 673;

        if (condition_1 & condition_2) {
            if (check_condition_1 & check_condition_2) {
                if (sum(a) % (n * (n + 1) / 2)) {
                    System.out.println("NO");
                } else {
                    ExecutorService executor = Executors.newFixedThreadPool(1);
                    Future<Double> future = executor.submit(() -> calculateAverage(sum, n, variable_17_11, variable_8_11, a));
                    double result = future.get(10, TimeUnit.SECONDS);
                    executor.shutdown();

                    a.add(a.get(0));
                    if (sum(a.subList(1, a.size()).stream().map(i -> (result - i + j) % n).collect(Collectors.toList())) || sum(a.subList(1, a.size()).stream().map(i -> (result - i + j) / n >= 0).collect(Collectors.toList())) != n) {
                        System.out.println("NO");
                    } else {
                        System.out.println("YES");
                    }
                }
            }
        }
    }

    private static double calculateAverage(int sum, int n, int variable_17_11, int variable_8_11, List<Integer> a) {
        return sum(a) / (n * (n + variable_17_11) / variable_8_11);
    }

    private static int sum(List<Integer> a) {
        return a.stream().mapToInt(Integer::intValue).sum();
    }
}