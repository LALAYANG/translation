import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> list = IntStream.range(0, n).map(i -> scanner.nextInt()).boxed().collect(Collectors.toList());
        int m = scanner.nextInt();
        List<Integer> indices = IntStream.range(0, m).map(i -> scanner.nextInt()).boxed().collect(Collectors.toList());
        scanner.close();

        List<Integer> result = new ArrayList<>();
        AtomicInteger r = new AtomicInteger(1);
        ExecutorService executor = Executors.newFixedThreadPool(10);
        for (int i = 0; i < list.size(); i++) {
            int finalI = i;
            executor.submit(() -> {
                List<Integer> tempList = new ArrayList<>();
                tempList.add(r.get());
                result.add(multiplyWithTimestamp(tempList, list.get(finalI)));
                r.addAndGet(1);
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(1, TimeUnit.MINUTES);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        indices.stream().map(i -> result.get(i - 1)).forEach(System.out::println);
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

    public static int multiplyWithTimestamp(List<Integer> arg1, int arg2) {
        return multiply(arg1.get(0), arg2);
    }
}