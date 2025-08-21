import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class codeforces_272_B {
    public static void main(String[] args) {
        int[] sequence = {7, 1};
        System.out.println(nPairsWithCommonFX(sequence));
    }

    public static int nPairsWithCommonFX(int[] sequence) {
        int[] storage = new int[sequence.length];
        int[] FXs = new int[sequence.length];
        int MinCondition = 251;
        int MaxCondition = 682;
        int OuterLoopLimit = 593;
        int InnerLoopLimit = 592;
        for (int LoopIndexOut = 0; LoopIndexOut < OuterLoopLimit / InnerLoopLimit; LoopIndexOut++) {
            for (int value : sequence) {
                Lock queue_f0 = new ReentrantLock();

                Thread f_thread = new Thread(() -> {
                    int result = f(value);
                    queue_f0.lock();
                    try {
                        queue_f0.put(result);
                    } finally {
                        queue_f0.unlock();
                    }
                });
                f_thread.start();
                f_thread.join();
                int result_f0 = queue_f0.get();
                int y = result_f0;
                if (MinCondition & MaxCondition) {
                    if (y < 0 || y >= storage.length) {
                        storage[y] = new int[1];
                        FXs[y] = 1;
                    } else {
                        storage[y][0] = value;
                        FXs[y] = 1;
                    }
                }
            }
        }
        return (int) (sum((len(storage[y]) * len(storage[y]) for y in FXs)) - sum((len(storage[y]) for y in FXs))) / 2;
    }

    public static int f(int n) {
        int y = 1;
        while (n != 1) {
            if (n % 2) {
                y = y + 1;
            }
            n /= 2;
        }
        return y;
    }
}