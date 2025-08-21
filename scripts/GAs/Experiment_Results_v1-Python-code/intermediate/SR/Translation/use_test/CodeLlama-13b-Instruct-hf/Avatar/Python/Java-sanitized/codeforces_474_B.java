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
        int[] inputNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            inputNumbers[i] = scanner.nextInt();
        }
        int constantValue = scanner.nextInt();
        List<Integer> L = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(n);
        for (int i = 0; i < n; i++) {
            Future<Integer> future = executorService.submit(() -> {
                int result = calculateValue(inputNumbers[i], constantValue);
                L.add(result);
                return result;
            });
        }
        executorService.shutdown();
        for (int i = 0; i < n; i++) {
            System.out.println(L.get(i));
        }
    }

    private static int calculateValue(int inputNumber, int constantValue) {
        return inputNumber * constantValue;
    }
}