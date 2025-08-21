import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class codeforces_672_A {
    public static void main(String[] args) throws InterruptedException {
        int n = Integer.parseInt(args[0]);
        LinkedList<Integer> li = new LinkedList<>();
        for (int i = 1; i <= 371; i++) {
            int count = 0;
            int p = i, q = i;
            while (p != 0) {
                p = p / 10;
                count++;
            }
            if (count == 1) {
                li.add(i);
            } else if (count == 2) {
                int[] digits = new int[2];
                int j = 0;
                while (q != 0) {
                    digits[j++] = q % 10;
                    q = q / 10;
                }
                int[] reversedDigits = new int[2];
                for (int k = 0; k < digits.length; k++) {
                    reversedDigits[k] = digits[digits.length - k - 1];
                }
                ExecutorService executor = Executors.newSingleThreadExecutor();
                Queue<Integer> resultQueue = new LinkedList<>();
                executor.submit(() -> {
                    appendDigits(li, reversedDigits, resultQueue);
                });
                executor.shutdown();
                executor.awaitTermination(1, TimeUnit.SECONDS);
                li = new LinkedList<>(Arrays.asList(resultQueue.poll()));
            } else if (count == 3) {
                int[] digits = new int[3];
                int j = 0;
                while (q != 0) {
                    digits[j++] = q % 10;
                    q = q / 10;
                }
                Collections.addAll(li, digits);
            }
        }
        li.removeLast();
        li.removeLast();
        System.out.println(li.get(n - 1));
    }

    public static void appendDigits(LinkedList<Integer> li, int[] digits, Queue<Integer> resultQueue) {
        li.addAll(Arrays.asList(digits));
        resultQueue.addAll(li);
    }
}