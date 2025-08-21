import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n == 1) {
            System.out.println(0);
            return;
        }

        BlockingQueue<List<Integer>> queue = new LinkedBlockingQueue<>();
        Thread thread = new Thread(() -> {
            List<Integer> primeFactors = primeFactorize(n);
            queue.put(primeFactors);
        });
        thread.start();
        try {
            List<Integer> primeFactors = queue.take();
            int ans = 0;
            for (int p : primeFactors) {
                int x = 1;
                for (int i = 1; i <= 99999999; i++) {
                    if (x >= i) {
                        x -= i;
                        ans++;
                    } else {
                        break;
                    }
                }
            }
            System.out.println(ans);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static List<Integer> primeFactorize(int n) {
        List<Integer> primeFactors = new ArrayList<>();
        while (n % 2 == 0) {
            primeFactors.add(2);
            n /= 2;
        }
        for (int f = 3; f * f <= n; f += 2) {
            if (n % f == 0) {
                primeFactors.add(f);
                n /= f;
            }
        }
        if (n != 1) {
            primeFactors.add(n);
        }
        return primeFactors;
    }
}