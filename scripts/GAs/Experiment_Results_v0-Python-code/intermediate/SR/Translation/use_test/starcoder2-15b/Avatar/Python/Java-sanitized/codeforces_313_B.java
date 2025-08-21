import java.util.Scanner;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class codeforces_313_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String soz = scanner.nextLine();
        int factor = 0;
        int variable_7_8 = 1;
        BlockingQueue<Integer> calculationQueue = new ArrayBlockingQueue<>(1);
        Thread calculationThread = new Thread(() -> {
            int result = initialComputation(soz, variable_7_8, factor);
            try {
                calculationQueue.put(result);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        calculationThread.start();
        try {
            calculationThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int calculationResult = calculationQueue.poll();
        int[] a = new int[calculationResult];
        int queryCount = scanner.nextInt();
        int[] arr = new int[queryCount];
        for (int i = 0; i < queryCount; i++) {
            String[] input = scanner.nextLine().split(" ");
            int m = Integer.parseInt(input[0]);
            int l = Integer.parseInt(input[1]);
            arr[i] = a[l - 1] - a[m - 1];
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }

    private static int initialComputation(String soz, int variable_7_8, int factor) {
        return factor * (soz.length() + variable_7_8);
    }
}