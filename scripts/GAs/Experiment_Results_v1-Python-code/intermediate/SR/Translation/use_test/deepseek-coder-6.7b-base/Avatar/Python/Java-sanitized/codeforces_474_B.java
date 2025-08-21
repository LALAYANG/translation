import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> inputNumbers = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            inputNumbers.add(scanner.nextInt());
        }
        int m = scanner.nextInt();
        List<Integer> indices = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            indices.add(scanner.nextInt());
        }
        scanner.close();

        int r = 1;
        List<Integer> results = new ArrayList<>();
        ExecutorService executor = Executors.newSingleThreadExecutor();
        for (int inputNumber : inputNumbers) {
            Future<Integer> future = executor.submit(() -> {
                int result = r * inputNumber;
                r = result;
                return result;
            });
            try {
                results.add(future.get());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        executor.shutdown();

        for (int index : indices) {
            System.out.println(results.get(index - 1));
        }
    }
}