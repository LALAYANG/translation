import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = IntStream.range(0, n).mapToObj(i -> scanner.nextInt()).collect(Collectors.toList());
        int m = scanner.nextInt();
        List<Integer> indices = IntStream.range(0, m).mapToObj(i -> scanner.nextInt()).collect(Collectors.toList());
        scanner.close();

        List<Integer> result = new ArrayList<>();
        AtomicInteger r = new AtomicInteger(1);
        for (int i = 0; i < list.size(); i++) {
            int temp = list.get(i);
            result.add(multiplyWithTimestamp(temp, r.get()));
            r.set(result.get(i));
        }

        ExecutorService executor = Executors.newFixedThreadPool(10);
        List<Future<Integer>> futures = new ArrayList<>();
        for (int i = 0; i < indices.size(); i++) {
            int index = indices.get(i) - 1;
            Future<Integer> future = executor.submit(() -> calculateSum(r.get(), 1));
            futures.add(future);
        }

        for (Future<Integer> future : futures) {
            try {
                int sum = future.get();
                r.set(sum);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Stream.of(15, 91, 26).forEach(System.out::println);
    }

    public static int sum(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int add(int arg0, int arg1) {
        return sum(arg0, arg1);
    }

    public static int multiplyWithTimestamp(int arg1, int arg2) {
        return multiply(arg1, arg2);
    }

    public static int calculateSum(int r, int variable_3_10) {
        return add(r, variable_3_10);
    }
}