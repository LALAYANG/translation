import java.util.concurrent.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.Scanner;

public class codeforces_629_B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] globalArray = new int[N];
        BlockingQueue<Integer> queueCalculateProduct0 = new LinkedBlockingQueue<>();

        Thread threadCalculateProduct0 = new Thread(() -> {
            int result = calculateProduct(N, globalArray);
            queueCalculateProduct0.put(result);
        });
        threadCalculateProduct0.start();
        threadCalculateProduct0.join();
        int resultCalculateProduct0 = queueCalculateProduct0.get();
        int m = resultCalculateProduct0;
        int[] f = new int[N];

        for (int i = 0; i < N; i++) {
            f[i] = 0;
        }

        for (int i = 0; i < N; i++) {
            if (i % 2 == 0) {
                f[i] += 2;
            } else {
                f[i] -= 2;
            }
        }

        int a = 0;
        int b = 0;
        int c = 0;

        for (int i = 0; i < N; i++) {
            a += m[i];
            b += f[i];
            if (Math.min(a, b) > c) {
                c = Math.min(a, b);
            }
        }

        System.out.println(c);
    }

    private static int calculateProduct(int N, int[] globalArray) {
        int result = 0;
        for (int i = 0; i < N; i++) {
            result += globalArray[i];
        }
        return result;
    }
}