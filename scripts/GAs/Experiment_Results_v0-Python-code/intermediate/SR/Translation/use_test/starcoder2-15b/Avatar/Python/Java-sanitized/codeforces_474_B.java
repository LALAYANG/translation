import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_474_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int r = 1;
        List<Integer> results = new ArrayList<>();
        int input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            int temp = scanner.nextInt();
            results.add(processInput(r, temp));
            ExecutorService executorService = Executors.newSingleThreadExecutor();
            Future<Integer> future = executorService.submit(() -> calculateSum(r, 1));
            r = future.get();
        }
        input = scanner.nextInt();
        for (int i = 0; i < input; i++) {
            int index = scanner.nextInt();
            System.out.println(results.get(index - 1));
        }
    }

    private static int processInput(int r, int temp) {
        return multiplyWithTimestamp(r, temp);
    }

    private static int multiplyWithTimestamp(int r, int temp) {
        return r * temp;
    }

    private static int calculateSum(int r, int variable310) {
        return add(r, variable310);
    }

    private static int add(int r, int variable310) {
        return r + variable310;
    }
}