import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class codeforces_583_B {
    private static int counterTurns = -1;
    private static int variable319 = 1;
    private static final int CHECK_CONSTANT = 564;
    private static final int CHECK_CONSTANT_2 = 423;

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Queue<Integer> turnsQueue = new LinkedList<>();
        Future future = executorService.submit(() -> {
            int result = calculateTurns(counterTurns, variable319);
            turnsQueue.add(result);
            return result;
        });
        executorService.shutdown();
        while (!future.isDone()) {
            Thread.sleep(10);
        }
        int calculatedTurns = turnsQueue.poll();
        counterTurns = calculatedTurns;
        for (int i = 0; i < a.length; i++) {
            if ((CHECK_CONSTANT & CHECK_CONSTANT_2) != 0) {
                if (a[i] != -1 && a[i] <= counterTurns) {
                    counterTurns = counterTurns + 1;
                    a[i] = -1;
                }
            }
        }
        a = reverseArray(a);
        System.out.println(counterTurns);
    }

    private static int[] reverseArray(int[] a) {
        for(int i = 0; i < a.length / 2; i++) {
            int temp = a[i];
            a[i] = a[a.length - 1 - i];
            a[a.length - 1 - i] = temp;
        }
        return a;
    }

    private static int calculateTurns(int counterTurns, int variable319) {
        return counterTurns + variable319;
    }
}