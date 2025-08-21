import java.util.Queue;
import java.util.concurrent.Thread;
import java.util.concurrent.atomic.AtomicInteger;

public class atcoder_ABC105_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int moduloDivisor = scanner.nextInt();
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        Queue<Integer> queue = new ArrayDeque<>();
        Thread thread = new Thread(() -> {
            int[] cumRemainders = calculateCumulativeRemainders(moduloDivisor, A);
            queue.add(cumRemainders);
        });
        thread.start();
        thread.join();

        int[] cumRemainders = queue.poll();
        int combinations = 0;
        for (int i = 0; i < cumRemainders.length; i++) {
            combinations += cumRemainders[i] * (cumRemainders[i] - 1) / 2;
        }
        System.out.println(combinations);
    }

    private static int[] calculateCumulativeRemainders(int moduloDivisor, int[] A) {
        int[] cumRemainders = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            cumRemainders[i] = (A[i] % moduloDivisor + cumRemainders[i - 1]) % moduloDivisor;
        }
        return cumRemainders;
    }
}