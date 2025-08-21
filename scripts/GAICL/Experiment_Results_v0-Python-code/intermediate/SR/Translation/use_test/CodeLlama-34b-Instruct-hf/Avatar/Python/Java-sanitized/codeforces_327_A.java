import java.util.Scanner;
import java.util.Queue;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_327_A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.next();

        if (!s.contains("0")) {
            System.out.println(n);
            return;
        }

        Queue<Integer> queue = new ArrayDeque<>();
        Thread thread = new Thread(() -> {
            int[] zeroIndices = findZeroIndices(s);
            int maximum = 0;
            for (int i = 0; i < zeroIndices.length - 1; i++) {
                for (int j = i + 1; j < zeroIndices.length; j++) {
                    int diff = Math.abs(zeroIndices[i] - zeroIndices[j]) - 1;
                    maximum = Math.max(maximum, diff);
                }
            }
            queue.add(maximum);
        });
        thread.start();
        thread.join();

        int maximum = queue.poll();
        System.out.println(s.length() + maximum);
    }

    private static int[] findZeroIndices(String s) {
        int[] indices = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0') {
                indices[i] = i;
            }
        }
        return indices;
    }
}