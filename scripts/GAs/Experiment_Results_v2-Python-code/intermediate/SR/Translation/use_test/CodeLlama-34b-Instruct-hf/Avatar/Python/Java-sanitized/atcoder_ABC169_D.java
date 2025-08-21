import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class atcoder_ABC169_D {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        if (n == 1) {
            System.out.println(0);
            return;
        }

        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        Thread thread = new Thread(new PrimeFactorizeThread(n, queue));
        thread.start();
        thread.join();

        List<Integer> primeFactors = new ArrayList<>();
        while (!queue.isEmpty()) {
            primeFactors.add(queue.poll());
        }

        int ans = 0;
        for (int i = 0; i < primeFactors.size(); i++) {
            int p = primeFactors.get(i);
            int e = 1;
            for (int j = i + 1; j < primeFactors.size(); j++) {
                if (primeFactors.get(j) == p) {
                    e++;
                }
            }
            ans += e;
        }
        System.out.println(ans);
    }

    static class PrimeFactorizeThread implements Runnable {
        private int n;
        private Queue<Integer> queue;

        public PrimeFactorizeThread(int n, Queue<Integer> queue) {
            this.n = n;
            this.queue = queue;
        }

        @Override
        public void run() {
            primeFactorize(n, queue);
        }

        private void primeFactorize(int n, Queue<Integer> queue) {
            if (n == 1) {
                queue.add(1);
                return;
            }

            int f = 2;
            while (f * f <= n) {
                if (n % f == 0) {
                    queue.add(f);
                    n /= f;
                } else {
                    f++;
                }
            }

            if (n > 1) {
                queue.add(n);
            }
        }
    }
}