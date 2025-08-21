import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_265_B {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < inputNumber; i++) {
            l.add(scanner.nextInt());
        }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> future = executorService.submit(new CalculateDifferenceCallable(1, inputNumber));
        int ans = future.get();
        int last = 0;
        for (int loopCounter : l) {
            ans += Math.abs(last - loopCounter) + 1;
            last = loopCounter;
        }
        System.out.println(ans);
        executorService.shutdown();
    }
}

class CalculateDifferenceCallable implements Callable<Integer> {

    private int minuend;
    private int inputNumber;

    public CalculateDifferenceCallable(int minuend, int inputNumber) {
        this.minuend = minuend;
        this.inputNumber = inputNumber;
    }

    @Override
    public Integer call() {
        return calculateDifference(minuend, inputNumber);
    }

    private int calculateDifference(int minuend, int inputNumber) {
        return inputNumber - minuend;
    }
}