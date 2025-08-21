import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_265_B {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < inputNumber; i++) {
            list.add(scanner.nextInt());
        }

        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new Callable<Integer>() {
            @Override
            public Integer call() throws Exception {
                return calculateDifference(1, inputNumber);
            }
        });

        int ans = future.get();
        int last = 0;
        for (int loopCounter : list) {
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }

        System.out.println(ans);
        executorService.shutdown();
    }

    private static int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}