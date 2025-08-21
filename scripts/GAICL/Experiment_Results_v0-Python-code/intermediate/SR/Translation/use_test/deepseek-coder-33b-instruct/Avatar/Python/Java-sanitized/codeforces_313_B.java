import java.util.Scanner;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class codeforces_313_B {
    static String soz;
    static int[] factor = {0};
    static int variable_7_8 = 1;
    static BlockingQueue<Integer> calculationQueue = new LinkedBlockingQueue<>();
    static int[] a;

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        soz = scanner.nextLine();
        Thread calculationThread = new Thread(() -> initialComputationThread(calculationQueue));
        calculationThread.start();
        calculationThread.join();
        int calculationResult = calculationQueue.take();
        a = new int[calculationResult];
        recursiveArrayUpdate(1, soz.length(), 1);
        int queryCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < queryCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            System.out.println(a[l - 1] - a[m - 1]);
        }
    }

    public static void initialComputationThread(BlockingQueue<Integer> queue) {
        int result = initialComputation(soz, variable_7_8, soz.length(), factor[0]);
        queue.add(result);
    }

    public static int initialComputation(String soz, int variable_7_8, int len, int factor) {
        return factor * (len + variable_7_8);
    }

    public static void recursiveArrayUpdate(int i, int stop, int step) {
        if (step == 0 || (step > 0 && i >= stop) || (step < 0 && i <= stop)) {
            return;
        }
        a[i] = a[i - 1];
        if (soz.charAt(i - 1) == soz.charAt(i)) {
            a[i] += 1;
        }
        recursiveArrayUpdate(i + step, stop, step);
    }
}