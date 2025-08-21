import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_313_B {
    public static void main(String[] args) {
        String soz = input();
        int factor = 0;
        int variable_7_8 = 1;
        BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();

        Thread initialComputationThread = new Thread(() -> {
            int result = initialComputation(soz, variable_7_8, soz.length(), factor);
            calculationQueue.put(result);
        });
        initialComputationThread.start();
        initialComputationThread.join();
        int calculationResult = calculationQueue.get();
        int[] a = new int[calculationResult];

        @FunctionalInterface
        interface RecursiveArrayUpdate {
            void recursiveArrayUpdate(int i, int stop, int step);
        }

        RecursiveArrayUpdate recursiveArrayUpdate = (i, stop, step) -> {
            if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
                return;
            }
            a[i] = a[i - 1];
            if (soz.charAt(i - 1) == soz.charAt(i)) {
                a[i] += 1;
            }
            recursiveArrayUpdate(i + step, stop, step);
        };
        recursiveArrayUpdate(1, soz.length(), 1);

        int queryCount = Integer.parseInt(input());
        int[] arr = new int[queryCount];

        Thread inputAndAppendThread = new Thread(() -> {
            for (int i = 0; i < queryCount; i++) {
                String[] input = input().split(" ");
                int m = Integer.parseInt(input[0]);
                int l = Integer.parseInt(input[1]);
                arr[i] = a[l - 1] - a[m - 1];
            }
        });
        inputAndAppendThread.start();
        inputAndAppendThread.join();

        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int initialComputation(String soz, int variable_7_8, int len, int factor) {
        return factor * (len + variable_7_8);
    }
}