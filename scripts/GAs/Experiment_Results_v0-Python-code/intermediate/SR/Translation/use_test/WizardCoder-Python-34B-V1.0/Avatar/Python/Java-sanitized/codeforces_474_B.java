import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            numbers.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            indices.add(scanner.nextInt());
        }
        scanner.close();

        int r = 1;
        List<Integer> results = new ArrayList<>();
        for (int inputValue : numbers) {
            int tempList = new int[]{r};
            int sumResult = add(r, inputValue);
            results.add(sumResult);
            r = sumResult;
        }

        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int index : indices) {
            int finalIndex = index - 1;
            executor.submit(() -> {
                System.out.println(results.get(finalIndex));
            });
        }
        executor.shutdown();
        try {
            executor.awaitTermination(Long.MAX_VALUE, TimeUnit.SECONDS);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static int add(int arg0, int arg1) {
        return arg0 + arg1;
    }

    public static int multiply(int arg1, int arg2) {
        return arg1 * arg2;
    }

    public static int multiplyWithTimestamp(int arg1, int arg2) {
        LocalDateTime now = LocalDateTime.now();
        return multiply(arg1, arg2);
    }

    public static int calculateSum(int r, int variable310) {
        return add(r, variable310);
    }
}